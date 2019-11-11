 package Xuesheng;
import java.util.Scanner;
public class Sys {
    Data stud = new Data();
	
	void insertStu(Scanner scanner){
		System.out.println("请输入学生的学号 姓名 性别 年龄 成绩（输入出用空格分开）：");
		String stuNo    = scanner.next();
		String stuName  = scanner.next();
		String gender   = scanner.next();
		byte   age		= scanner.nextByte();
		int    score	= scanner.nextInt();
		int    i 		= 0;
		
		if(stud.checkStuNo(stuNo) == null){
			Student stu = new Student(stuNo, stuName, gender, age, score);
			stud.insertStu(stu);
			System.out.println("学生信息添加成功！！！");
		}
		else{
			System.out.println("您输入的学生编号已存在,请选择下一步操作");
			System.out.println("1、继续添加  2、退出系统");
			i = scanner.nextInt();
			if(i == 1){
				insertStu(scanner); ///递归
			}
			else if(i == 2){
				System.exit(0);
			}
			
			else{
				System.out.println("您输入的数据不合规！！！");
			}
		}
	}
	
	void delateStu(Scanner scan){
		int i = 0;///可以重复使用i吗
		System.out.println("请输入要删除学生的编号：");
		String stuNo = scan.next();
		if(stud.checkStuNo(stuNo) != null){
			stud.delateStu(stuNo);
			System.out.println("学成信息删除成功！！！");
		}
		else {
			System.out.println("您输入的学号不存在，请选择下一步操作");
			System.out.println("1、继续删除 2、退出系统");
			if(i == 1){
				delateStu(scan); 
			}
			else if(i == 2) {
				System.exit(0);
			}
			else{
				System.out.println("您输入的数据不合规！！！");
			}
		}
	}
	
	void updateStu(Scanner scanner){
		int i = 0;
		System.out.println("请输入要修改的学生的编号：");
		String stuNo = scanner.next();
		Student stu = new Student();
		///非要等与null吗？？调试后的总结：1不能直接= new student 因为构造方法里没有student（） （无参数的构造方法）
		///解决方法：加一个无参的构造方法
		if(stud.checkStuNo(stuNo) != null){
			System.out.println("请输入学生的姓名 性别 年龄 成绩 （输入时用空格分开）");
			stu.stuNo     = stuNo;
			stu.stuName  = scanner.next();
			stu.gender	 = scanner.next();
			stu.age		 = scanner.nextByte();
			stu.score	 = scanner.nextInt();
			stud.updateStu(stu);
			System.out.println("学生信息修改成功！！！");
		}
		else{
			System.out.println("您输入的学生编号不存在，请选择下一步操作");
			System.out.println("1、继续修改  2、退出系统");
			i = scanner.nextInt();
			if(i == 1){
				insertStu(scanner); 
			}
			else if(i == 2){
				System.exit(0);
			}
			
			else{
				
				System.out.println("您输入的数据不合规！！！");
			}
			
		}
	}
	
	void showStuInfo(Scanner scanner){
		int i = 0;
		Student stu = new Student();
		System.out.println("请输入查看学生的编号");
		String stuNo = scanner.next();
		if((stu = stud.checkStuNo(stuNo)) != null){
			stud.printStu(stu);
		}
		else{
			System.out.println("您输入的学号不存在，请选择下一步操作");
			System.out.println("1、继续查看 2、退出系统");
			i = scanner.nextInt();
			if(i == 1){
				showStuInfo(scanner); 
			}
			
			else if(i == 2){
				System.exit(0);
			}
			
			else{
				System.out.println("您输入的数据不合规！！！");
			}
		}
	}
	void showAllStuInfo(){
		stud.printAllstuInf();
	}
}
