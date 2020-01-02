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
		//�γ�1
		course1.setCourseNo("01");
		course1.setCourseName("���ޡ�����������");
		course1.setCourseGrade(4);
		courses.put(course1.getCourseNo(),course1);

		//�γ�2
		course2.setCourseNo("02");
		course2.setCourseName("���ޡ�������ѧӢ��");
		course2.setCourseGrade(2);
		courses.put(course2.getCourseNo(),course2);

		//�γ�3
		course3.setCourseNo("03");
		course3.setCourseName("���ޡ�������ѧ����");
		course3.setCourseGrade(3);
		courses.put(course3.getCourseNo(),course3);

		//�γ�4
		course4.setCourseNo("04");
		course4.setCourseName("���ޡ�����java");
		course4.setCourseGrade(4);
		courses.put(course4.getCourseNo(),course4);

		//�γ�5
		course5.setCourseNo("05");
		course5.setCourseName("ѡ�ޡ�������Ӱ����");
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
