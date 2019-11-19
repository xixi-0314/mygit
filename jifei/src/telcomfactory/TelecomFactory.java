 package telcomfactory;
import telcom.*;
import telcom.Telcom;
import user.*;

public class TelecomFactory implements TelcomFactory{
	 public Telcom createTelecom() {
		 return (Telcom) new Telecom();
	 }

	@Override
	public Telcom createTelcom() {
		// TODO Auto-generated method stub
		return null;
	}


}
