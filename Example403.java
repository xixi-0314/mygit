class Animal{
	String name="����";
	void shout(){
		System.out.println("���﷢������");
	}
}
class Dog extends Animal{
	String name="Ȯ��";
	//��д���׵�shout()����
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
