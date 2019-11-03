
public class Example502 {
	public static void main(String[] args) {
         MyThread mythread1=new MyThread();
         MyThread mythread2=new MyThread();
         mythread1.setName("线程1");
         mythread2.setName("线程2");
         mythread1.start();
         mythread2.start();


	}

}
class MyThread extends Thread{
	public void run(){
		while(true){
			Thread th=Thread.currentThread();
			String th_name=th.getName();
			System.out.println(th_name);
		}
	}
}