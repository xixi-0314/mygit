class Animal{
	void shout (){
		System.out.println("���﷢������");
	}
}
class Dog extends Animal{
	void shout (){
		System.out.println("����...");
	}
}
public class Example402 {

	public static void main(String[] args) {
		Dog dog=new Dog();//����Dog���ʵ������
		dog.shout();      //����dog��д��shout()����

	}

}
