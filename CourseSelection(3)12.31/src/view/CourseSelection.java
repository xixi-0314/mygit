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
		System.out.println("*****************��ӭ����ѡ��ϵͳ******************\n");
		System.out.println("\t1 �γ�ѡ��");
		System.out.println("\t2 �鿴��ѡ�γ�");
		System.out.println("\t3 ��ѡ");
		System.out.println("\t4 �˳�ѡ��ϵͳ");
		System.out.println("**********************�ָ���***********************\n");
        SCBiz scbiz = new SCBiz();
        
		Scanner scanner = new Scanner(System.in);
		String nu = scanner.nextLine();
		
		System.out.println("������ѧ�ţ�");
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
			System.out.println("���ѳɹ��˳�ѡ��ϵͳ");
			break;
		}

	}
}
