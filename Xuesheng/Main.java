 package Xuesheng;
import java.util.Scanner;
public class Main {
	public static void main(String[] strs){
		System.out.println("��ӭʹ��tyrantfor��ѧ������ϵͳ");
		
		Scanner scan = new Scanner(System.in);
		
		Main main = new Main();
		
		Sys s1 = new Sys();
		
		while(true){
			main.showMenu();
			switch(scan.nextInt()){
				case 0:
				System.exit(0);
				
				case 1:
				s1.insertStu(scan);
				break;
				
				case 2:
				s1.delateStu(scan);
				break;
				
				case 3:
				s1.updateStu(scan);
				break;
				
				case 4:
				s1.showStuInfo(scan);
				break;
				
				case 5:
				s1.showAllStuInfo();
				break;
				
				default:
				
				System.out.println("�������ݲ��Ϲ棡����");
			}
		}
	}
	void showMenu(){
		System.out.println("��ѡ�������\n\n");
		
		System.out.println("1������ѧ����Ϣ");
		System.out.println("2��ɾ��ѧ����Ϣ");
		System.out.println("3���޸�ѧ����Ϣ");
		System.out.println("4������ѧ�Ų鿴ѧ����Ϣ");
		System.out.println("5���鿴����ѧ����Ϣ");
		System.out.println("0���˳�ϵͳ");
	}
}
