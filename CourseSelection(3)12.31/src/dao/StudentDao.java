package dao;
import entity.IEntity;

import entity.Student;

import java.util.HashMap;

public class StudentDao implements IDao {

	private static StudentDao instance;
	private HashMap<String,IEntity> students;
	private Student student;
	private StudentDao() {
		students = new HashMap<String,IEntity>();
		student = new Student();
		
		student.setStudentNo("164801001");
		student.setStudentName("张三");
		student.setStudentGender("男");
		student.setStudentPassword("123456");
		student.setStudentAge(20);
		student.setStudentDepartment("软件学院");
		students.put(student.getStudentNo(), student);
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
