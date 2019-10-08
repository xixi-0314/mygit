package factory;
import chanpin.*;

public class FactoryBMW320 implements FactoryBMW{
	public BMW320 createBMW(){
		return new BMW320();
	}

}
