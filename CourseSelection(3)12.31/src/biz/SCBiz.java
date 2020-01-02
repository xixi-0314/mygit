package biz;
import java.util.Scanner;
import dao.*;
import entity.SC;
import entity.Student;
import view.MainUI;

public class SCBiz {
	
	SCDao scDao=SCDao.getInstance();
	CourseDao courseDao = CourseDao.getInstance();
	sc = (SC) studentDao.getEntity(studentNo);
	//正选
	public void choose (String studentNo ){
		String courseNo;
        System.out.println("*****下面是可选的课程*****\n");
		System.out.println("\t001 概率论");
		System.out.println("\t002 大学英语");
		System.out.println("\t003 大学物理");
		System.out.println("\t004 Java");
		
		System.out.println("请输入要选择的课程序号\n");
		Scanner scanner = new Scanner(System.in);
		courseNo = scanner.nextLine();
		SC sc = new SC();
		sc.setCourseNo(courseNo);
		sc.setStudentNo(studentNo);
		//scDao = SCDao.getInstance();
		//scDao.insert();
		System.out.println("恭喜您，正选成功！");
	}
    //退选
    public void tuixuan(String studentNo  ){
		
	}
    //查看正选结果
    public void look ( String studentNo ){
		
	}
}
