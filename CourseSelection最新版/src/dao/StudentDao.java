package dao;
import entity.IEntity;
import entity.Student;
import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class StudentDao implements IDao {
	private static StudentDao instance;
	private HashMap<String,IEntity> students=new HashMap<String,IEntity>();;
	public  FileInputStream fis;
	public FileOutputStream fos;
	private StudentDao() {
		getUsersFromInputStream("user.dat");
	}
	//以InputStream的形式读取文件
	private void getUsersFromInputStream(String Name) {
		try {
			fis = new FileInputStream(Name);
			byte[] date = new byte[1024];
			int i=0;
			int b = 0;//定义一个int类型的变量b,记住每次读取的一个字节
			while(true) {
				try {
					b = fis.read();
				} catch(IOException e) {
					e.printStackTrace();
				}
				if(-1 == b) {
					break;
				}else if('\r' == (char)b || '\n' == (char)b) {
					try {
						this.processUserString(new String(date,"GBK").trim());
						i=0;
					} catch(UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					continue;
				}else {
					date[i] = (byte)b;
					i++;
				}
	         }
		}catch(Exception e) {
		     e.printStackTrace();
		}
	}
	private void processUserString(String userString) {
		String [] userFields = userString.split(",");
		Student stu = new Student();
		stu.setStudentNo(userFields[0]);
		stu.setStudentPassword(userFields[1]);
		stu.setStudentName(userFields[2]);
		stu.setStudentGender(userFields[3]);
		stu.setStudentAge(Integer.parseInt(userFields[4]));
		stu.setStudentDepartment(userFields[5]);
		students.put(stu.getStudentNo(), stu);
	}
	public static StudentDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new StudentDao();
					return instance;
				}
			}
		}
		return instance;
	}
	//插入
	public void insert(IEntity entity) {
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}
	//删除
	public void delete() {

	}
	//存盘操作
	public void update() {
		Set<String> stuSet = students.keySet();
		StringBuffer uStringBuffer = new StringBuffer();
		for(String studentNo:stuSet) //临时变量：容器变量
		{
			Student stu = (Student)students.get(studentNo);
			String uString = stu.getStudentNo() + ","
					+ stu.getStudentPassword() + ","
					+ stu.getStudentName() + ","
					+ stu.getStudentGender() + ","
					+ stu.getStudentAge() + ","
					+ stu.getStudentDepartment() + "\r\n";
			uStringBuffer.append(uString);
		}
		putUsersToFile(uStringBuffer.toString(),"user.dat");
	}
	//写入文件的函数
	private void putUsersToFile(String uString,String osName) {
		try {
			fos = new FileOutputStream(osName);
			try {
				fos.write(uString.getBytes("GBK"));
			}catch(UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 获得所有的实体，即得到所有的用户信息
	public HashMap<String, IEntity> getAllEntities() {
		return students;
	}
	//获取一个实体，即查询
	public IEntity getEntity(String Id) {
		return students.get(Id);
	}
}
