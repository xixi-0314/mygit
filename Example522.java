 class CarWindow implements Runnable{
	private int cheng=1;
	public void run(){
		while (true){
			if(cheng<=100){
				Thread car =Thread.currentThread();
				String car_name=car.getName();
				System.out.println(car_name+"���ڽ��͵�"+ cheng++ +"���˿�");
			}
		}
	}
}
public class Example522 {

	public static void main(String[] args) {
		CarWindow car = new CarWindow();
		new Thread(car,"��һ�����⳵").start();
		new Thread(car,"�ڶ������⳵").start();
		new Thread(car,"���������⳵").start();
		new Thread(car,"���������⳵").start();
		new Thread(car,"���������⳵").start();

	}
}
