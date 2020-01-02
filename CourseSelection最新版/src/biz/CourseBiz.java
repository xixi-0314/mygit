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
   	    System.out.println("-------------------------------可选课程-------------------------------\n");
   	    while(it.hasNext()){
   		    Object key = it.next();
   		    Course value = (Course)courseDao.getAllEntities().get(key);
   		    System.out.println("------ 序号："+key+"------ 科目："+value.getCourseName()+"----- 学分："+value.getCourseGrade()+"------\n");
   	    }
   	    System.out.println("------------------------------------------------------------------------");
    }

}
