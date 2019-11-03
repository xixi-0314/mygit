package factory;
import car.*;
public class AudiFactory implements Factory{
	public Car produceCar(){
		return new Audi();
	}
}
