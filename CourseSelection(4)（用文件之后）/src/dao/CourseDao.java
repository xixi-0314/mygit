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
	public CourseDao() {
		
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		Course course4 = new Course();
		Course course5 = new Course();
		//课程1
		course1.setCourseNo("01");
		course1.setCourseName("主修···概率论");
		course1.setCourseGrade(4);
		courses.put(course1.getCourseNo(),course1);

		//课程2
		course2.setCourseNo("02");
		course2.setCourseName("主修···大学英语");
		course2.setCourseGrade(2);
		courses.put(course2.getCourseNo(),course2);

		//课程3
		course3.setCourseNo("03");
		course3.setCourseName("主修···大学物理");
		course3.setCourseGrade(3);
		courses.put(course3.getCourseNo(),course3);

		//课程4
		course4.setCourseNo("04");
		course4.setCourseName("主修···java");
		course4.setCourseGrade(4);
		courses.put(course4.getCourseNo(),course4);

		//课程5
		course5.setCourseNo("05");
		course5.setCourseName("选修···电影赏析");
		course5.setCourseGrade(1);
		courses.put(course5.getCourseNo(),course5);

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
