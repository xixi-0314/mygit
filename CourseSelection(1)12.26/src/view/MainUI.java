package view;

import java.util.Scanner;
//主界面
public class MainUI {
	public static void show() {
		System.out.println("1-注册；2-修改密码；3-选课；4-登录；0-退出");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			RegisterUI.show();
			break;
		case "2":
			ModifyPasswordUI.show();
			break;
		case "3":
			//new CourseSelection().show();
			break;
		case "4":
			LoginUI.show();
		}
	}
}
