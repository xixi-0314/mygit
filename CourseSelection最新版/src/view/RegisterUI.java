package view;
import java.util.Scanner;
import biz.StudentBiz;
//注册界面
public class RegisterUI {
	public static void show() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("·····请输入以下信息,完成注册·····");
		System.out.println("·····  请输入学号：·····");
		String studentNo = scanner.nextLine();
		System.out.println("·····  请输入姓名：·····");
		String studentName = scanner.nextLine();
		System.out.println("·····  请输入性别：·····");
		String studentGender = scanner.nextLine();
		System.out.println("·····  请输入年龄：·····");
		int studentAge = Integer.parseInt(scanner.nextLine());
		//将字符串参数作为有符号的十进制整数进行分析
		System.out.println("·····  请输入院系：·····");
		String studentDepartment = scanner.nextLine();
		System.out.println("·····  请输入密码：·····");
		String firstPassword = scanner.nextLine();
		System.out.println("·····  请再次输入密码：·····");
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
