 package Xuesheng;
import java.util.Scanner;
public class Main {
	public static void main(String[] strs){
		System.out.println("欢迎使用tyrantfor的学生管理系统");
		
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
				
				System.out.println("输入数据不合规！！！");
			}
		}
	}
	void showMenu(){
		System.out.println("请选择操作：\n\n");
		
		System.out.println("1：增加学生信息");
		System.out.println("2：删除学生信息");
		System.out.println("3：修改学生信息");
		System.out.println("4：根据学号查看学生信息");
		System.out.println("5：查看所有学生信息");
		System.out.println("0：退出系统");
	}
}
