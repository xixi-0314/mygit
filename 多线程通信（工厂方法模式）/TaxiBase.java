import car.*;
import factory.*;
import utility.*;
public class TaxiBase {
		private Car [] car = new Car [10];
		private int inpos,outpos;
		private int count;
		TaxiBase(){
			Factory carFactory=(Factory)XMLUtility.getBean();
			for(int i=0;i<10;i++){
				car[i]=carFactory.produceCar();
			}
		}
		public synchronized void come (){
			try{
			while (count==car.length){
				this.wait();
			}
			System.out.println("车辆" + inpos + ", " + car[inpos].toString() + "入库");
			inpos++;
			if (inpos==car.length)
				inpos=0;
			count++;
			this.notify();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	 public  synchronized void go(){
		 try{
		 while (count==0) {
			 this.wait();
		 } 
		 System.out.println("车辆" + outpos + ", " + car[outpos].toString() + "出库。计费费率" + car[outpos].getRatio());
		 outpos++;
		 if(outpos==car.length)
			 outpos=0;
		 count--;
		 this.notify();
	} catch (Exception e){
		e.printStackTrace();
	}
}
}
	 
