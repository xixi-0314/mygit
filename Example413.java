//����ӿ�Animal
interface Animal{
	void shout();   //�������shout()����
}
//����Cat��ʵ��Animal�ӿ�
class Cat implements Animal{
	public void shout(){
		System.out.println("����...");
	}
}
class Dog implements Animal{
	public void shout(){
		System.out.println("����...");
	}
}
public class Example413 {

	public static void main(String[] args) {
		Animal an1=new Cat();
		Animal an2=new Dog();
		animalShout(an1);
		animalShout(an2);

	}
	//���徲̬��animalShout()����������һ��Animal���͵Ĳ���
	public static void animalShout(Animal an){
		an.shout();  //����ʵ�ʲ�����shout()����
	}

}
