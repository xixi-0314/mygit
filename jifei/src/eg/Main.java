package eg;

public class Main{
	public static void main(String[] args) {
		TelcomUser telcomUser = new TelcomUser("13800138000");
		telcomUser.generateCommunicateRecord();
		telcomUser.printDetails();
	}
}
