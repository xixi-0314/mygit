package dao;
import entity.Course;
import entity.IEntity;
import entity.Student;


import java.util.HashMap;

public class CourseDao implements IDao {

	@SuppressWarnings("unused")
	private static CourseDao instance;
	private HashMap<String,IEntity> courses = new HashMap<String, IEntity>();
	private Course course;
	private CourseDao() {
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		Course course4 = new Course();
		Course course5 = new Course();
		//课程1
		course1.setCourseNo("0001");
		course1.setCourseName("概率论");
		course1.setCourseGrade(4);
		courses.put(course1.getCourseNo(),course1);

		//课程2
		course2.setCourseNo("0002");
		course2.setCourseName("大学英语");
		course2.setCourseGrade(2);
		courses.put(course2.getCourseNo(),course2);

		//课程3
		course3.setCourseNo("0003");
		course3.setCourseName("大学物理");
		course3.setCourseGrade(3);
		courses.put(course3.getCourseNo(),course3);

		//课程4
		course4.setCourseNo("0004");
		course4.setCourseName("java");
		course4.setCourseGrade(4);
		courses.put(course4.getCourseNo(),course4);

	}
	public static CourseDao getInstance() {
		if(instance == null) {
			synchronized(CourseDao.class) {
				if(instance == null) {
					instance = new CourseDao();
					return instance;
				}
			}
		}
		return instance;
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
		
		return courses;
	}

	@Override
	public IEntity getEntity(String Id) {
		return courses.get(Id);
	}

}
