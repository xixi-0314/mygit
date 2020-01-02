package view;
import java.util.Scanner;
//麼順中
public class MainUI {
	public static void show() {
		System.out.println("，，，，，，，，，，！！，，，，，，，，，，！！，，，，，，，，，，僥伏~並暦狼由，，，，，，，，，，！！，，，，，，，，，，！！，，，，，，，，，，");
		System.out.println("\t！！，，，，，，，，，，！！，，，，，，，，，艇辛參僉夲序佩泌和孔嬬，，，，，，，，，，！！，，，，，，，，，，！！\n");
		System.out.println("\t    |\t\t        1  ！！  仟喘薩廣過  \t\t\t|\n");
		System.out.println("\t    |\t\t        2  ！！  喘 薩 鞠 村  \t\t\t|\n");
		System.out.println("\t    |\t\t        3  ！！  俐 個 畜 鷹  \t\t\t|\n");
		System.out.println("\t    |\t\t        4  ！！  僥 伏 僉 仁  \t\t\t|\n");
		System.out.println("\t    |\t\t        0  ！！  曜 竃 狼 由  \t\t\t|\n");
		System.out.println("，，，，，，，，，，！！，，，，，，，，，，！！，，，，，，，，，，~~~~~~~~~，，，，，，，，，，！！，，，，，，，，，，！！，，，，，，，，，，\n");
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
			System.out.println("，，，，，，，，，厮序秘僥伏僉仁狼由麼順中，，，，，，，，，\n");
			CourseSelection.show();
			break;
		default:
			System.out.println("，，，，，，，，，厮頼畠曜竃云狼由��湖仍云肝聞喘，，，，，，，，，");
			break;
		}
	}
}
