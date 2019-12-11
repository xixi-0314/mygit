package phonefactory;
import phone.Mobile;
import phone.Phone;
import phone.Telecom;
import user.*;
public class MobileFactory implements Factory{
	public Phone producePhone(){
		return new Mobile();
	}
}
