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
		//课程1
		course1.setCourseNo("0001");
		course1.setCourseName("概率论");
		course1.setCourseGrade(4);
		//课程2
		course2.setCourseNo("0002");
		course2.setCourseName("大学英语");
		course2.setCourseGrade(2);
		//课程3
		course3.setCourseNo("0003");
		course3.setCourseName("大学物理");
		course3.setCourseGrade(3);
		//课程4
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
