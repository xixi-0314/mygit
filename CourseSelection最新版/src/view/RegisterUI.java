package view;
import java.util.Scanner;
import biz.StudentBiz;
//ע�����
public class RegisterUI {
	public static void show() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������������������Ϣ,���ע�ᡤ��������");
		System.out.println("����������  ������ѧ�ţ�����������");
		String studentNo = scanner.nextLine();
		System.out.println("����������  ����������������������");
		String studentName = scanner.nextLine();
		System.out.println("����������  �������Ա𣺡���������");
		String studentGender = scanner.nextLine();
		System.out.println("����������  ���������䣺����������");
		int studentAge = Integer.parseInt(scanner.nextLine());
		//���ַ���������Ϊ�з��ŵ�ʮ�����������з���
		System.out.println("����������  ������Ժϵ������������");
		String studentDepartment = scanner.nextLine();
		System.out.println("����������  ���������룺����������");
		String firstPassword = scanner.nextLine();
		System.out.println("����������  ���ٴ��������룺����������");
		String secondPassword = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.register(studentNo, 
				studentName, 
				studentGender, 
				studentAge, 
				studentDepartment, 
				firstPassword, 
				secondPassword);
	}
}
