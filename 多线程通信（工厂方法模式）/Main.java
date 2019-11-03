import car.*;
import factory.*;
import utility.*;
public class Main {

	public static void main(String args[]){
		Car ca;
		Factory factory;
	    factory = (Factory)XMLUtility.getBean();
	    ca = factory.produceCar();
	    TaxiBase tb=new TaxiBase();
	    Input input=new Input(tb);
	    Output output=new Output(tb);
	    new Thread(input).start();
	    new Thread(output).start();
	 }

}
