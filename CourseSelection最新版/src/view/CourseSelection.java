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
			System.out.println("\n����������������������������������������ѧ��ѡ��ϵͳ����������������������������������������\n");
			System.out.println("     �����������������������������Խ������¹���:��������������������������\n");
			System.out.println("\t|��������������1�������������� �γ�ѡ��       \t|");
			System.out.println("\t|��������������2�������������� �鿴��ѡ�γ�\t|");
			System.out.println("\t|��������������3�������������� ��ѡ              \t|");
			System.out.println("\t|��������������4�������������� �˳�ѡ��ϵͳ\t|");
			System.out.println("\n����������������������������������������-----------����������������������������������������\n");
	        SCBiz scbiz = new SCBiz();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch(scanner.nextLine()){
			case"1":
				System.out.println("\n��������������ѧ�ţ�");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.choose(studentNo);
				break;
			case"2":
				System.out.println("\n������������ѧ�ţ�");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
	        	scbiz.result(studentNo);
				break;
			case"3":
				System.out.println("\n������������ѧ�ţ�");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.tuixuan(studentNo);
				break;
			default:
				flag=1;
				System.out.println("\n�����������������˳�ѡ��ϵͳ��������������\n");
				MainUI.show();
				break;
			}
		}
	}
}
