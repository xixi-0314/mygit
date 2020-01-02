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
		student.setStudentName("����");
		student.setStudentGender("��");
		student.setStudentPassword("123456");
		student.setStudentAge(20);
		student.setStudentDepartment("���ѧԺ");
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
	//����
	public void insert(IEntity entity) {
		
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}

	//ɾ��
	public void delete() {
		

	}

	//�޸���Ϣ
	public void update() {
		
	}

	// ������е�ʵ�壬���õ����е��û���Ϣ
	public HashMap<String, IEntity> getAllEntities() {
		
		return students;
	}

	//��ȡһ��ʵ�壬����ѯ
	public IEntity getEntity(String Id) {
		
		return students.get(Id);
	}

}
