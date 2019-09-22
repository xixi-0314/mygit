class Animal{
	void shout (){
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	void shout (){
		System.out.println("汪汪...");
	}
}
public class Example402 {

	public static void main(String[] args) {
		Dog dog=new Dog();//创建Dog类的实例对象
		dog.shout();      //调用dog重写的shout()方法

	}

}
