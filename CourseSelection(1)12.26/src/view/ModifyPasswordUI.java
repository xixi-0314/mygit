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
	    
	    System.out.println("������ѧ�ţ�");
		scanner = new Scanner(System.in);
		studentName = scanner.nextLine();
		
		System.out.println("���������룺");
		scanner = new Scanner(System.in);
		studentPassword = scanner.nextLine();
		
	    System.out.println("�������µ����룺");
	    scanner = new Scanner(System.in);
	    studentNewPassword = scanner.nextLine();
	    
	    studentBiz = new StudentBiz();
	    studentBiz.modifyPassword(studentName, studentPassword,studentNewPassword);
	}
}
