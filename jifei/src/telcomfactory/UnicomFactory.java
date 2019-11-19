package telcomfactory;
import telcomfactory.TelcomFactory;
import telcom.Unicom;
import telcom.Telcom;
import user.*;

public class UnicomFactory implements TelcomFactory{
	public Telcom createTelcom(){
		return (Telcom) new Unicom();
	}

}
