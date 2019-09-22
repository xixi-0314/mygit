
class Animal{
	String name;
	//定义动物叫的方法
	void shout(){
		System.out.println("动物发出叫声");
	}
}
//定义Dog类继承Animal类
class Dog extends Animal{
	public void printName(){
		System.out.println("name="+name);
	}
}
public class Example01 {
    public static void main (String[] args){
    	Dog dog =new Dog();
    	dog.name="沙皮狗";
    	dog.printName();
    	dog.shout();
    }
}
