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
	    	System.out.println("������ѧ�ţ�");
			scanner = new Scanner(System.in);
			studentNo = scanner.nextLine();
			
			System.out.println("���������룺");
			scanner = new Scanner(System.in);
			studentPassword = scanner.nextLine();
			
		    System.out.println("�������µ����룺");
		    scanner = new Scanner(System.in);
		    studentNewPassword = scanner.nextLine();
		    
		    System.out.println("���ٴ������µ����룺");
		    scanner = new Scanner(System.in);
		    studentSecondPassword = scanner.nextLine();
		    
		    if(studentSecondPassword.equals(studentNewPassword)) {
	        	 StudentBiz studentbiz= new StudentBiz();
	             studentbiz.modifyPassword(studentNo, studentPassword,studentNewPassword );
	             break;
	        }
	        else {
	        	 System.out.println("����������������벻һ�£����������룺");
	        }

	    }
	    
	}
}
