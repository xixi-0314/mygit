package factory;
import car.*;
public class BMWFactory implements Factory{
	public Car produceCar(){
		return new BMW();
	}
}
