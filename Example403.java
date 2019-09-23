class Animal{
	String name="动物";
	void shout(){
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	String name="犬类";
	//重写父亲的shout()代码
	void shout (){
		super.shout();
	}
	void printName(){
		System.out.println("name="+super.name);
	}
}
public class Example403 {

	public static void main(String[] args) {
		Dog dog =new Dog();
		dog.shout();
		dog.printName();

	}

}
