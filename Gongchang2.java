
public class BMW {
     public BMW(){
    	 
     }
}

public class BMW320 extends BMW {
	public BMW320(){
	          System.out.println("BMW320 was made.");
	}
}

public class BMW523 extends BMW {
	public BMW523(){
		 System.out.println("BMW523 was made.");
	}
}

public interface FactoryBMW {
     BMW createBMW();
}

public class FactoryBMW320 implements FactoryBMW{
	public BMW320 createBMW(){
		return new BMW320();
	}

}
public class FactoryBMW523 implements FactoryBMW {
	public BMW523 createBMW(){
		return new BMW523();
	}

}
public class Customer {

	public static void main(String[] args) {
		 FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		 BMW320 bm = factoryBMW320.createBMW();
		 
		 FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		 BMW523 bmw = factoryBMW523.createBMW();

	}

}
