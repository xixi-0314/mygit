package factory;
import car.*;
public class BenzFactory implements Factory{
	public Car produceCar(){
		return new Benz();
	}
}
