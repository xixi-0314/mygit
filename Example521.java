class TeacherWindow implements Runnable{
	private int ben=80;
	public void run(){
		while (true){
			if(ben>0){
				Thread te =Thread.currentThread();
				String te_name=te.getName();
				System.out.println(te_name+"正在发第"+ben--+"个本");
			}
		}
	}
}
public class Example521 {

	public static void main(String[] args) {
		TeacherWindow te = new TeacherWindow();
		new Thread(te,"老师一").start();
		new Thread(te,"老师二").start();
		new Thread(te,"老师三").start();

	}
}
