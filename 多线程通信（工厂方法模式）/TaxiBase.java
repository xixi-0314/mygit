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
			System.out.println("����" + inpos + ", " + car[inpos].toString() + "���");
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
		 System.out.println("����" + outpos + ", " + car[outpos].toString() + "���⡣�Ʒѷ���" + car[outpos].getRatio());
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
	 
