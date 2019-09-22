//定义接口Animal
interface Animal{
	void shout();   //定义抽象shout()方法
}
//定义Cat类实现Animal接口
class Cat implements Animal{
	public void shout(){
		System.out.println("喵喵...");
	}
}
class Dog implements Animal{
	public void shout(){
		System.out.println("汪汪...");
	}
}
public class Example413 {

	public static void main(String[] args) {
		Animal an1=new Cat();
		Animal an2=new Dog();
		animalShout(an1);
		animalShout(an2);

	}
	//定义静态的animalShout()方法，接收一个Animal类型的参数
	public static void animalShout(Animal an){
		an.shout();  //调用实际参数的shout()方法
	}

}
