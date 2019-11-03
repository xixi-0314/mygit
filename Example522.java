 class CarWindow implements Runnable{
	private int cheng=1;
	public void run(){
		while (true){
			if(cheng<=100){
				Thread car =Thread.currentThread();
				String car_name=car.getName();
				System.out.println(car_name+"正在接送第"+ cheng++ +"个乘客");
			}
		}
	}
}
public class Example522 {

	public static void main(String[] args) {
		CarWindow car = new CarWindow();
		new Thread(car,"第一辆出租车").start();
		new Thread(car,"第二辆出租车").start();
		new Thread(car,"第三辆出租车").start();
		new Thread(car,"第四辆出租车").start();
		new Thread(car,"第五辆出租车").start();

	}
}
