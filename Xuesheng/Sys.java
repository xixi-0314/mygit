 package Xuesheng;
import java.util.Scanner;
public class Sys {
    Data stud = new Data();
	
	void insertStu(Scanner scanner){
		System.out.println("������ѧ����ѧ�� ���� �Ա� ���� �ɼ���������ÿո�ֿ�����");
		String stuNo    = scanner.next();
		String stuName  = scanner.next();
		String gender   = scanner.next();
		byte   age		= scanner.nextByte();
		int    score	= scanner.nextInt();
		int    i 		= 0;
		
		if(stud.checkStuNo(stuNo) == null){
			Student stu = new Student(stuNo, stuName, gender, age, score);
			stud.insertStu(stu);
			System.out.println("ѧ����Ϣ��ӳɹ�������");
		}
		else{
			System.out.println("�������ѧ������Ѵ���,��ѡ����һ������");
			System.out.println("1���������  2���˳�ϵͳ");
			i = scanner.nextInt();
			if(i == 1){
				insertStu(scanner); ///�ݹ�
			}
			else if(i == 2){
				System.exit(0);
			}
			
			else{
				System.out.println("����������ݲ��Ϲ棡����");
			}
		}
	}
	
	void delateStu(Scanner scan){
		int i = 0;///�����ظ�ʹ��i��
		System.out.println("������Ҫɾ��ѧ���ı�ţ�");
		String stuNo = scan.next();
		if(stud.checkStuNo(stuNo) != null){
			stud.delateStu(stuNo);
			System.out.println("ѧ����Ϣɾ���ɹ�������");
		}
		else {
			System.out.println("�������ѧ�Ų����ڣ���ѡ����һ������");
			System.out.println("1������ɾ�� 2���˳�ϵͳ");
			if(i == 1){
				delateStu(scan); 
			}
			else if(i == 2) {
				System.exit(0);
			}
			else{
				System.out.println("����������ݲ��Ϲ棡����");
			}
		}
	}
	
	void updateStu(Scanner scanner){
		int i = 0;
		System.out.println("������Ҫ�޸ĵ�ѧ���ı�ţ�");
		String stuNo = scanner.next();
		Student stu = new Student();
		///��Ҫ����null�𣿣����Ժ���ܽ᣺1����ֱ��= new student ��Ϊ���췽����û��student���� ���޲����Ĺ��췽����
		///�����������һ���޲εĹ��췽��
		if(stud.checkStuNo(stuNo) != null){
			System.out.println("������ѧ�������� �Ա� ���� �ɼ� ������ʱ�ÿո�ֿ���");
			stu.stuNo     = stuNo;
			stu.stuName  = scanner.next();
			stu.gender	 = scanner.next();
			stu.age		 = scanner.nextByte();
			stu.score	 = scanner.nextInt();
			stud.updateStu(stu);
			System.out.println("ѧ����Ϣ�޸ĳɹ�������");
		}
		else{
			System.out.println("�������ѧ����Ų����ڣ���ѡ����һ������");
			System.out.println("1�������޸�  2���˳�ϵͳ");
			i = scanner.nextInt();
			if(i == 1){
				insertStu(scanner); 
			}
			else if(i == 2){
				System.exit(0);
			}
			
			else{
				
				System.out.println("����������ݲ��Ϲ棡����");
			}
			
		}
	}
	
	void showStuInfo(Scanner scanner){
		int i = 0;
		Student stu = new Student();
		System.out.println("������鿴ѧ���ı��");
		String stuNo = scanner.next();
		if((stu = stud.checkStuNo(stuNo)) != null){
			stud.printStu(stu);
		}
		else{
			System.out.println("�������ѧ�Ų����ڣ���ѡ����һ������");
			System.out.println("1�������鿴 2���˳�ϵͳ");
			i = scanner.nextInt();
			if(i == 1){
				showStuInfo(scanner); 
			}
			
			else if(i == 2){
				System.exit(0);
			}
			
			else{
				System.out.println("����������ݲ��Ϲ棡����");
			}
		}
	}
	void showAllStuInfo(){
		stud.printAllstuInf();
	}
}
