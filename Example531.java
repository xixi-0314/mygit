import java.util.Scanner;
class Student{
	public String name;
	public String number;
	public String gender;
	public String grade;
	public String age;
}
public class Example531 {
	static boolean flag=true;
	static int k=0;
	static Student[] stu = new Student[100];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	 Student p = new Student();
	 System.out.println(p.name);
		while(flag) {
			System.out.println("1������ѧ����Ϣ");
			System.out.println("2��ɾ��ѧ����Ϣ");
			System.out.println("3���޸�ѧ����Ϣ");
			System.out.println("4����ѯѧ����Ϣ");
			System.out.println("5���˳�ѧ������ϵͳ");
			int num = scan.nextInt();
			switch(num) {
			case 1: add(); break;
			case 2: delete(); break;
			case 3: alter(); break;
			case 4: find(); break;
			case 5: flag=false; break;
			default: break;
			}
		}
	}
	public static void add() {
		boolean flag_1=true;
		while(flag_1) {
			stu[k] = new Student();
			System.out.println("�������������ѧ��-����-�Ա�-����-�ɼ�");
			stu[k].number = scan.next();
			stu[k].name = scan.next();
			stu[k].gender = scan.next();
			stu[k].age = scan.next();
			stu[k].grade = scan.next();
			k++;
			System.out.println("����������true,�˳�������false");
			flag_1 = scan.nextBoolean();
		}
		list();
	}
	public static void delete() {
		int i,j;
		System.out.println("��������Ҫɾ����ѧ��");
	    for(i=0;i<k;i++) {
	    	if(stu[i].number.equals(scan.next())) {
	    		break;
	    	}
	    }
	    for(j=i;j<k-1;j++) {
	    	stu[j]=stu[j+1];
	    }
	    k--;
	    list();
	}
	public static void alter() {
		int i;
		System.out.println("��������Ҫ�޸ĵ�ѧ��");
		String s1 = scan.next();
		for(i=0;i<k;i++) {
			if(stu[i].number.equals(s1)) {
//				stu[i].number.replace(stu[i].number,scan.next());
//				stu[i].name.replace(stu[i].name,scan.next());
//				stu[i].gender.replace(stu[i].gender,scan.next());
//				stu[i].age.replace(stu[i].age,scan.next());
//				stu[i].grade.replace(stu[i].grade,scan.next());
				stu[i].number = scan.next();
				stu[i].name = scan.next();
				stu[i].gender = scan.next();
				stu[i].age = scan.next();
				stu[i].grade = scan.next();
				break;
			}
		}
		list();
	}
	public static void find() {
		int i,y;
		boolean flag_1=true;
		while(flag_1==true) {
			System.out.println("��������Ҫ��ѯ��ѧ����ѧ��");
			y=0;
			String s = scan.next();
			for(i=0;i<k;i++) {
				if(stu[i].number.equals(s)) {
					y=1;
					System.out.print("����Ҫ��ѯ�ĸ�ͬѧ����ϢΪ��");
					System.out.print(stu[i].number+"---");
					System.out.print(stu[i].name+"---");
					System.out.print(stu[i].gender+"---");
					System.out.print(stu[i].age+"---");
					System.out.print(stu[i].grade+"---");
					System.out.print("\n");
					break;
				}
			}
			if(y==0) System.out.println("��ѯ�����޴�ѧ������Ϣ�������������ѧ���Ƿ�����");
			System.out.println("����������true,�˳���false");
			flag_1=scan.nextBoolean();
		}
		list();
	}
    public static void list() {
    	int i;
    	System.out.println("ϵͳ���ȹ���"+k+"��ͬѧ����Ϣ,��ϸ��Ϣ���£�");
    	for(i=0;i<k;i++) {
    	   System.out.print(stu[i].number+"---");
    	   System.out.print(stu[i].name+"---");
    	   System.out.print(stu[i].gender+"---");
    	   System.out.print(stu[i].age+"---");
    	   System.out.print(stu[i].grade+"---");
    	   System.out.print("\n");
    	}
    }
}