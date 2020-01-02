package biz;

import java.util.Scanner;
import dao.CourseDao;
import dao.SCDao;
import entity.*;

public class SCBiz {
	SCDao scDao = SCDao.getInstance();
	CourseDao courseDao = CourseDao.getInstance();
	private SC sc;
    public void choose(String studentNo){
	    CourseBiz.print();
	    @SuppressWarnings("resource")
	    Scanner scan = new Scanner(System.in);
	    System.out.println("����������  ������Ҫѡ��Ŀ�Ŀ��ţ�����������");
	    String courseNo = scan.nextLine();
	    sc = (SC)scDao.getEntity(studentNo);
	    if(sc==null) {
		    sc = new SC();
		    sc.setStudentNo(studentNo);
		    StringBuffer courseNo1 = new StringBuffer();
		    courseNo1.append(courseNo+",");
		    sc.setCourseNo(courseNo1);
	        CourseDao courseDao = (CourseDao)CourseDao.getInstance();
	        Course course = (Course)courseDao.getEntity(courseNo);
	        int grade = course.getCourseGrade();
		    sc.setGrade(grade);
		    scDao.insert(sc);
		    System.out.println("������������  �ѳɹ�ѡ�����ſγ̣��������ѡ����������ѡ��Ҫ���еĲ�����������������");
	    }
	    else {
		    StringBuffer s = new StringBuffer();
		    StringBuffer s1 = new StringBuffer();
		    s =sc.getCourseNo();
		    s1 =sc.getCourseNo();
		    String [] arr = s1.toString().split(",");
		    int flag=0;
		    for(int i=0;i<arr.length;i++) {
			    if(arr[i].equals(courseNo)) flag=1;
		    }
		    if(flag==0) {
			    s.append(courseNo+",");
		        sc.setCourseNo(s);
		        int a = sc.getGrade();
		        a=a+(((Course)courseDao.getEntity(courseNo)).getCourseGrade());
		        sc.setGrade(a);
		        scDao.insert(sc);
		        System.out.println("������������  �ѳɹ�ѡ�����ſγ̣��������ѡ����������ѡ��Ҫ���еĲ�����������������");
		    }
		    else System.out.println("���������� �Ѿ�ѡ�����ſΣ��޷��ظ�ѡ�� ����������");
	    } 
    }
 
    public void tuixuan(String studentNo){
    	new SCBiz().result(studentNo);
	    @SuppressWarnings("resource")
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("����������  ������Ҫ��ѡ�Ŀγ���ţ�����������");
	    String courseNo = scanner.nextLine();
	    sc = (SC)scDao.getEntity(studentNo);
	    StringBuffer s = new StringBuffer();
	    s = sc.getCourseNo();
	    String[] arr = s.toString().split(",");
	    int flag=0;
	    for(int i=0;i<arr.length;i++) {
		    if(arr[i].equals(courseNo)) flag=1;
	    }
	    if(flag==0) {
	    	 System.out.println("���������� ��δѡ����ſγ̣��޷�������ѡ���� ����������");
	    }
	    else {
		    s.delete(0, s.length());
		    for(int i=0;i<arr.length;i++) {
			    if(arr[i].equals(courseNo)) continue;
			    s.append(arr[i]+",");
		    }
		    int a = sc.getGrade();
		    a=a-(((Course)courseDao.getEntity(courseNo)).getCourseGrade());
		    sc.setGrade(a);
		    scDao.delete1(sc);
		    System.out.println("�����������ѳɹ���ѡ�ÿ�Ŀ���������ѡ����������ѡ����Ҫ���еĲ�������������");
	    }
     }
    public void result(String studentNo){
	     SCDao scDao = SCDao.getInstance();
	     SC sc = (SC)scDao.getEntity(studentNo);
	     String[] courseNo = sc.getCourseNo().toString().split(",");
	     System.out.println("������������������ѡ��Ŀ��ѧ����Ϣ��������������");
	     for(int i=0;i<courseNo.length;i++) {
		     Course course = (Course)CourseDao.getInstance().getEntity(courseNo[i]);
		     System.out.println("������ ��ţ�"+course.getCourseNo()+",��������Ŀ��"+course.getCourseName()+",������ѧ�֣�"+course.getCourseGrade());
	     }
    }
}
