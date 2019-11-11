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
			stuArray = newArray;///��ֵʱ���ü�[]
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
	
	void delateStu(String stuNo){///�����Ҳ������� �п����Ǵ�Сд�����⣬ֻҪ˫�����۴�СдֻҪƴд��ͬ�ͱ���
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
		System.out.print("ѧ����� " + stu.stuNo + "  ");
		System.out.print("ѧ������ " + stu.stuName + "  ");
		System.out.print("ѧ���Ա� " + stu.gender + "  ");
		System.out.print("ѧ������ " + stu.age + "  ");
		System.out.println("ѧ���ɼ� " + stu.score + "  ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	void printAllstuInf(){
		for(int i  = 0; i < dataindex; i++){
			printStu(stuArray[i]);
		}
		
	}
}
