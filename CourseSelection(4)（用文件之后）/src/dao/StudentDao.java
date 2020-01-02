package dao;
import entity.IEntity;
import entity.Student;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Set;

public class StudentDao implements IDao {

	private static StudentDao instance;
	private HashMap<String,IEntity> students=new HashMap<String,IEntity>();;
	private Student student = new Student();
	public  FileInputStream fis;
	public FileOutputStream fos;
	private StudentDao() {
		getUsersFromInputStream("user.dat");
	}
	private void getUsersFromInputStream(String isName) {
		try {
			fis = new FileInputStream(isName);
			byte[] content = new byte[1024];
			int i=0;
			int conInteger = 0;
			while(true) {
				try {
					conInteger = fis.read();
				} catch(IOException e) {
					e.printStackTrace();
				}
				if(-1 == conInteger) {
					break;
				}else if('\r' == (char)conInteger || '\n' == (char)conInteger) {
					try {
						this.processUserString(new String(content,"GBK").trim());
						i=0;
					} catch(UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					continue;
				}else {
					content[i] = (byte)conInteger;
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
	//修改信息
	public void update() {
		Set<String> stuSet = students.keySet();
		StringBuffer uStringBuffer = new StringBuffer();
		for(String studentNo:stuSet) {
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
	// 获得所有的实体，即得到所有的用户信息
	public HashMap<String, IEntity> getAllEntities() {
		return students;
	}
	//获取一个实体，即查询
	public IEntity getEntity(String Id) {
		return students.get(Id);
	}
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

}
