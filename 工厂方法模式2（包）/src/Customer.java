import chanpin.*;
import factory.*;
public class Customer {

	public static void main(String[] args) {
		 FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		 BMW320 bm = factoryBMW320.createBMW();
		 
		 FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		 BMW523 bmw = factoryBMW523.createBMW();

	}

}
