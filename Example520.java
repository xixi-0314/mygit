class MeThread implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("new");
		}
	}
}
public class Example520 {

	public static void main(String[] args) {
		MeThread methread=new MeThread();
		Thread thread=new Thread(methread);
		thread.start();
		for(int i =0;i<100;i++){
			System.out.println("main");
		}

	}

}
