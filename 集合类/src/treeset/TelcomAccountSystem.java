package treeset;
public class TelcomAccountSystem{
	public static void main(String[] args){
		//ʵ����һ�������û���TelcomUser
		TelcomUser telcomUser=new TelcomUser("15515109728");
		//����ͨ����¼
		telcomUser.generateCommubicateRecord();
		//��ӡͨ���굥
		telcomUser.printDetails();
		telcomUser.printCallToNumber();
	}
}