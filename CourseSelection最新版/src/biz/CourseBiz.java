package biz;
import java.util.Iterator;
import java.util.Set;
import dao.CourseDao;
import entity.Course;

public class CourseBiz {
	public static void print(){
   	    CourseDao courseDao = new CourseDao();
   	    Set<String> keySet = courseDao.getAllEntities().keySet();
   	    Iterator<String> it = keySet.iterator();
   	    System.out.println("-------------------------------��ѡ�γ�-------------------------------\n");
   	    while(it.hasNext()){
   		    Object key = it.next();
   		    Course value = (Course)courseDao.getAllEntities().get(key);
   		    System.out.println("------ ��ţ�"+key+"------ ��Ŀ��"+value.getCourseName()+"----- ѧ�֣�"+value.getCourseGrade()+"------\n");
   	    }
   	    System.out.println("------------------------------------------------------------------------");
    }

}
