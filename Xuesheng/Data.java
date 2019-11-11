package Xuesheng;
public class Data {
	Student stuArray[] = new Student[10];
	int dataindex = 0;
	
	void insertStu(Student stu){
		if(dataindex == stuArray.length){
			Student newArray[] = new Student[stuArray.length + (stuArray.length >> 1)];
			for(int i = 0; i<dataindex; i++){
				newArray[i] = stuArray[i];
			}
			stuArray = newArray;///赋值时不用加[]
		}
		stuArray[dataindex] = stu;
		dataindex++;
		
	}
	
	Student checkStuNo(String stuNo){
		for(int i = 0; i < dataindex; i++){
			if(stuArray[i].stuNo.equals(stuNo)) ///.equals
			{
				return stuArray[i]; 
			}
		}
		return null;
	}
	
	void delateStu(String stuNo){///错误：找不到符号 有可能是大小写的问题，只要双击不论大小写只要拼写相同就变绿
		boolean flag = false;
		for(int i = 0; i < dataindex; i++){
			if (stuArray[i].stuNo.equals(stuNo)){
				stuArray[i] = stuArray[i + 1];
				flag = true;
			}
		}
		if(flag){
				dataindex--;
			}
		
	}
	
	void updateStu(Student stu){
		for(int i = 0; i < dataindex; i++){
			if(stuArray[i].stuNo.equals(stu.stuNo)){
				stuArray[i] = stu;
			}
		}
	}
	
	void printStu(Student stu){
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("学生编号 " + stu.stuNo + "  ");
		System.out.print("学生姓名 " + stu.stuName + "  ");
		System.out.print("学生性别 " + stu.gender + "  ");
		System.out.print("学生年龄 " + stu.age + "  ");
		System.out.println("学生成绩 " + stu.score + "  ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	void printAllstuInf(){
		for(int i  = 0; i < dataindex; i++){
			printStu(stuArray[i]);
		}
		
	}
}
