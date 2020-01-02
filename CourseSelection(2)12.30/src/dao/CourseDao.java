package dao;
import entity.Course;
import entity.IEntity;
import entity.Student;


import java.util.HashMap;

public class CourseDao implements IDao {

	@SuppressWarnings("unused")
	private static CourseDao instance;
	@SuppressWarnings("unused")
	private HashMap<String, Course> courses;
	private Course course;
	private CourseDao() {
		courses = new HashMap<String, Course>();
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		Course course4 = new Course();
		Course course5 = new Course();
		//�γ�1
		course1.setCourseNo("0001");
		course1.setCourseName("������");
		course1.setCourseGrade(4);
		//�γ�2
		course2.setCourseNo("0002");
		course2.setCourseName("��ѧӢ��");
		course2.setCourseGrade(2);
		//�γ�3
		course3.setCourseNo("0003");
		course3.setCourseName("��ѧ����");
		course3.setCourseGrade(3);
		//�γ�4
		course4.setCourseNo("0004");
		course4.setCourseName("java");
		course4.setCourseGrade(4);
	}
		
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Course cou = (Course)entity;
		courses.put(cou.getCourseNo(), cou);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {

	}

	@Override
	public HashMap<String, entity.IEntity> getAllEntities() {
		
		return null;
	}

	@Override
	public IEntity getEntity(String Id) {
		return null;
	}

}
