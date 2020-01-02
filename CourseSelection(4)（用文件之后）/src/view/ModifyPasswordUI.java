package view;

import java.util.Scanner;

import biz.StudentBiz;

public class ModifyPasswordUI {
	@SuppressWarnings("resource")
	public static void show() {
        Scanner scanner;
	    String studentNo;
	    String studentPassword;
	    String studentNewPassword;
	    String studentSecondPassword;
	    StudentBiz studentBiz;
	    
	    while(true) {
	    	System.out.println("请输入学号：");
			scanner = new Scanner(System.in);
			studentNo = scanner.nextLine();
			
			System.out.println("请输入密码：");
			scanner = new Scanner(System.in);
			studentPassword = scanner.nextLine();
			
		    System.out.println("请输入新的密码：");
		    scanner = new Scanner(System.in);
		    studentNewPassword = scanner.nextLine();
		    
		    System.out.println("请再次输入新的密码：");
		    scanner = new Scanner(System.in);
		    studentSecondPassword = scanner.nextLine();
		    
		    if(studentSecondPassword.equals(studentNewPassword)) {
	        	 StudentBiz studentbiz= new StudentBiz();
	             studentbiz.modifyPassword(studentNo, studentPassword,studentNewPassword );
	             break;
	        }
	        else {
	        	 System.out.println("您两次输入的新密码不一致，请重新输入：");
	        }

	    }
	    
	}
}
