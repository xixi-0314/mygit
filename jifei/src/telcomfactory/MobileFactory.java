package telcomfactory;
import telcom.Mobile;
import telcom.Telcom;
import user.*;

public class MobileFactory implements TelcomFactory{
	public Telcom createTelcom() {
		return (Telcom) new Mobile();
	}

}
