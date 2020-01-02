package view;

import java.util.Scanner;

import biz.StudentBiz;

public class ModifyPasswordUI {
	@SuppressWarnings("resource")
	public static void show() {
        Scanner scanner;
	    String studentName;
	    String studentPassword;
	    String studentNewPassword;
	    StudentBiz studentBiz;
	    
	    System.out.println("请输入学号：");
		scanner = new Scanner(System.in);
		studentName = scanner.nextLine();
		
		System.out.println("请输入密码：");
		scanner = new Scanner(System.in);
		studentPassword = scanner.nextLine();
		
	    System.out.println("请输入新的密码：");
	    scanner = new Scanner(System.in);
	    studentNewPassword = scanner.nextLine();
	    
	    studentBiz = new StudentBiz();
	    studentBiz.modifyPassword(studentName, studentPassword,studentNewPassword);
	}
}
