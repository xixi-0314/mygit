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
			System.out.println("*****************��ӭ����ѡ��ϵͳ******************\n");
			System.out.println("\t1 �γ�ѡ��");
			System.out.println("\t2 �鿴��ѡ�γ�");
			System.out.println("\t3 ��ѡ");
			System.out.println("\t4 �˳�ѡ��ϵͳ");
			System.out.println("**********************�ָ���***********************\n");
	        SCBiz scbiz = new SCBiz();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch(scanner.nextLine()){
			case"1":
				System.out.println("������ѧ�ţ�");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.choose(studentNo);
				break;
			case"2":
				System.out.println("������ѧ�ţ�");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
	        	scbiz.result(studentNo);
				break;
			case"3":
				System.out.println("������ѧ�ţ�");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.tuixuan(studentNo);
				break;
			default:
				flag=1;
				System.out.println("���ѳɹ��˳�ѡ��ϵͳ");
				MainUI.show();
				break;
			}
		}
		
	}
}
