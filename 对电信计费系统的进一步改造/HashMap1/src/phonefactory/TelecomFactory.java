package phonefactory;
import phone.Mobile;
import phone.Phone;
import phone.Telecom;
import user.*;
public class TelecomFactory implements Factory{
	public Phone producePhone(){
		return new Telecom();
	}
}
