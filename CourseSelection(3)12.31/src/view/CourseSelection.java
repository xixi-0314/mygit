package view;
import java.util.*;

import biz.SCBiz;
import dao.StudentDao;

import entity.*;
import view.MainUI;

public class CourseSelection {

	public static void main(String[] args) {
		
		LoginUI.show();
		
		
	}
	public static void show() {
		String studentNo;
		System.out.println("*****************欢迎进入选课系统******************\n");
		System.out.println("\t1 课程选择");
		System.out.println("\t2 查看已选课程");
		System.out.println("\t3 退选");
		System.out.println("\t4 退出选课系统");
		System.out.println("**********************分割线***********************\n");
        SCBiz scbiz = new SCBiz();
        
		Scanner scanner = new Scanner(System.in);
		String nu = scanner.nextLine();
		
		System.out.println("请输入学号：");
		scanner = new Scanner(System.in);
		studentNo = scanner.nextLine();
		switch(nu){
		case"1":
			scbiz.choose(studentNo);
			break;
		case"2":
        	scbiz.look(studentNo);
			break;
		case"3":
			scbiz.tuixuan(studentNo);
			break;
		default:
			System.out.println("您已成功退出选课系统");
			break;
		}

	}
}
