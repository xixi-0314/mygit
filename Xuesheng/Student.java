 package Xuesheng;

public class Student {
    Student(){
		
	}
	Student (String stuNo, String stuName, String gender, byte age, int score){
		this.stuNo   = stuNo;
		this.stuName = stuName;
		this.gender  = gender;
		this.age     =  age;
		this.score   =  score;
	}
	String stuNo;
	String stuName;
	String gender;
	byte   age;
	int    score;
}
