class TeacherWindow implements Runnable{
	private int ben=80;
	public void run(){
		while (true){
			if(ben>0){
				Thread te =Thread.currentThread();
				String te_name=te.getName();
				System.out.println(te_name+"���ڷ���"+ben--+"����");
			}
		}
	}
}
public class Example521 {

	public static void main(String[] args) {
		TeacherWindow te = new TeacherWindow();
		new Thread(te,"��ʦһ").start();
		new Thread(te,"��ʦ��").start();
		new Thread(te,"��ʦ��").start();

	}
}
