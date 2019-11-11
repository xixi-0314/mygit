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
			System.out.println("1：增加学生信息");
			System.out.println("2：删除学生信息");
			System.out.println("3：修改学生信息");
			System.out.println("4：查询学生信息");
			System.out.println("5：退出学生管理系统");
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
			System.out.println("请依次输入你的学号-姓名-性别-年龄-成绩");
			stu[k].number = scan.next();
			stu[k].name = scan.next();
			stu[k].gender = scan.next();
			stu[k].age = scan.next();
			stu[k].grade = scan.next();
			k++;
			System.out.println("继续请输入true,退出请输入false");
			flag_1 = scan.nextBoolean();
		}
		list();
	}
	public static void delete() {
		int i,j;
		System.out.println("请输入你要删除的学号");
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
		System.out.println("请输入你要修改的学号");
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
			System.out.println("请输入你要查询的学生的学号");
			y=0;
			String s = scan.next();
			for(i=0;i<k;i++) {
				if(stu[i].number.equals(s)) {
					y=1;
					System.out.print("你所要查询的该同学的信息为：");
					System.out.print(stu[i].number+"---");
					System.out.print(stu[i].name+"---");
					System.out.print(stu[i].gender+"---");
					System.out.print(stu[i].age+"---");
					System.out.print(stu[i].grade+"---");
					System.out.print("\n");
					break;
				}
			}
			if(y==0) System.out.println("查询错误，无此学生的信息，请检查你输入的学号是否有误");
			System.out.println("继续请输入true,退出按false");
			flag_1=scan.nextBoolean();
		}
		list();
	}
    public static void list() {
    	int i;
    	System.out.println("系统中先共有"+k+"个同学的信息,详细信息如下：");
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