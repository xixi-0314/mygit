package view;
import java.util.*;
import biz.SCBiz;
import view.MainUI;
public class CourseSelection {
	public static void main(String[] args) {
		MainUI.show();
	}
	public static void show() {
		String studentNo;
		int flag=0;
		while(true) {
			if(flag==1)  break;
			System.out.println("\n¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤Ñ§ÉúÑ¡¿ÎÏµÍ³¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤\n");
			System.out.println("     ¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¿ÉÒÔ½øÐÐÈçÏÂ¹¦ÄÜ:¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤\n");
			System.out.println("\t|¡¤¡¤¡¤¡¤¡¤¡¤¡¤1¡¤¡¤¡¤¡¤¡¤¡¤¡¤ ¿Î³ÌÑ¡Ôñ       \t|");
			System.out.println("\t|¡¤¡¤¡¤¡¤¡¤¡¤¡¤2¡¤¡¤¡¤¡¤¡¤¡¤¡¤ ²é¿´ÒÑÑ¡¿Î³Ì\t|");
			System.out.println("\t|¡¤¡¤¡¤¡¤¡¤¡¤¡¤3¡¤¡¤¡¤¡¤¡¤¡¤¡¤ ÍËÑ¡              \t|");
			System.out.println("\t|¡¤¡¤¡¤¡¤¡¤¡¤¡¤4¡¤¡¤¡¤¡¤¡¤¡¤¡¤ ÍË³öÑ¡¿ÎÏµÍ³\t|");
			System.out.println("\n¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤-----------¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤\n");
	        SCBiz scbiz = new SCBiz();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch(scanner.nextLine()){
			case"1":
				System.out.println("\n¡¤¡¤¡¤¡¤ÇëÊäÈëÑ§ºÅ£º");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.choose(studentNo);
				break;
			case"2":
				System.out.println("\n¡¤¡¤¡¤ÇëÊäÈëÑ§ºÅ£º");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
	        	scbiz.result(studentNo);
				break;
			case"3":
				System.out.println("\n¡¤¡¤¡¤ÇëÊäÈëÑ§ºÅ£º");
				scanner = new Scanner(System.in);
				studentNo = scanner.nextLine();
				scbiz.tuixuan(studentNo);
				break;
			default:
				flag=1;
				System.out.println("\n¡¤¡¤¡¤¡¤¡¤¡¤¡¤ÒÑÍË³öÑ¡¿ÎÏµÍ³¡¤¡¤¡¤¡¤¡¤¡¤¡¤\n");
				MainUI.show();
				break;
			}
		}
	}
}
