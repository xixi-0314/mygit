 class Window implements Runnable{
	private int [] x=new int[100];
	private int t=0;
	public void run(){
		while (true){
			if(t<100){
				Thread th =Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"�������ص�"+ ++t +"���ļ�");
			}
		}
	}
}
public class Example523 {

	public static void main(String[] args) {
		Window car = new Window();
		new Thread(car,"��1��������").start();
		new Thread(car,"��2��������").start();

	}
}
