package view;
import java.util.Scanner;
//������
public class MainUI {
	public static void show() {
		System.out.println("��������������������������������������������������������������������ѧ��~����ϵͳ��������������������������������������������������������������������");
		System.out.println("\t����������������������������������������������������ѡ��������¹��ܡ�����������������������������������������������\n");
		System.out.println("\t    |\t\t        1  ����  ���û�ע��  \t\t\t|\n");
		System.out.println("\t    |\t\t        2  ����  �� �� �� ¼  \t\t\t|\n");
		System.out.println("\t    |\t\t        3  ����  �� �� �� ��  \t\t\t|\n");
		System.out.println("\t    |\t\t        4  ����  ѧ �� ѡ ��  \t\t\t|\n");
		System.out.println("\t    |\t\t        0  ����  �� �� ϵ ͳ  \t\t\t|\n");
		System.out.println("��������������������������������������������������������������������~~~~~~~~~��������������������������������������������������������������������\n");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			RegisterUI.show();
			break;
		case "2":
			LoginUI.show();
			break;
		case "3":
			ModifyPasswordUI.show();
			break;
		case "4":
			System.out.println("�������������������ѽ���ѧ��ѡ��ϵͳ�����桤����������������\n");
			CourseSelection.show();
			break;
		default:
			System.out.println("����������������������ȫ�˳���ϵͳ����л����ʹ�á�����������������");
			break;
		}
	}
}
