package biz;

import java.util.Iterator;
import java.util.Set;
import dao.CourseDao;
import entity.Course;

public class CourseBiz {
	public static void print(){
   	    CourseDao courseDao = new CourseDao();
   	    Set keySet = courseDao.getAllEntities().keySet();
   	    Iterator it = keySet.iterator();
   	    System.out.println("------------大二上学期可选课程列表------------");
   	    while(it.hasNext()){
   		    Object key = it.next();
   		    Course value = (Course)courseDao.getAllEntities().get(key);
   		    System.out.println("*课程编号："+key+"------课程名称："+value.getCourseName()+"-----课程学分："+value.getCourseGrade()+"*");
   	    }
   	    System.out.println("----------------------------------------");
    }

}
