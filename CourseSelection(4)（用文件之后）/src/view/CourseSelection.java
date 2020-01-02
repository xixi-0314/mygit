package view;
import java.util.*;
import biz.SCBiz;
import view.MainUI;

public class CourseSelection {
	public static void main(String[] args) {
		MainUI.show();
	}
	public static void show() {
		String studentNo;
		int flag=0;
		while(true) {
			if(flag==1)  break;
			System.out.println("*****************欢迎进入选课系统******************\n");
			System.out.println("\t1 课程选择");
			System.out.println("\t2 查看已选课程");
			System.out.println("\t3 退选");
			System.out.println("\t4 退出选课系统");
			System.out.println("**********************分割线***********************\n");
	        SCBiz scbiz = new SCBiz();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch(scanner.nextLine()){
			case"1":
				System.out.println("请输入学号：");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.choose(studentNo);
				break;
			case"2":
				System.out.println("请输入学号：");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
	        	scbiz.result(studentNo);
				break;
			case"3":
				System.out.println("请输入学号：");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.tuixuan(studentNo);
				break;
			default:
				flag=1;
				System.out.println("您已成功退出选课系统");
				MainUI.show();
				break;
			}
		}
		
	}
}
