package eg;
import java.util.*;
import java.text.*;
import java.io.*;
class TelcomUser{
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
	}
	
	public void generateCommunicateRecord() {
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
	
			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
			long timeEnd = timeStart+60000+new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.communicationRecords.append(this.phoneNumber+","+timeStart+","+timeEnd+","+this.callTo+";");
		}
	}
	private String getCallToPhoneNumber() {
		return "1380372"+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))
                        +String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10));
	}
	private String accountFee(long timeStart,long timeEnd) {
		double feePerMinute = 0.2;
		int minutes = Math.round((timeEnd-timeStart)/60000);
		double feeTotal = feePerMinute*minutes;
		return String.format("%.4f",feeTotal);
	}
	public void printDetails() {
		String allRecords = this.communicationRecords.toString();
		String [] recordArray = allRecords.split(";");
		for(int i=0;i<recordArray.length;i++) {
			System.out.println("----------通话记录分割线-------------");
			String [] recordField = recordArray[i].split(",");
			System.out.println("主叫："+recordField[0]);
			System.out.println("被叫："+recordField[3]);
			System.out.println("通话开始时间："+new Date(Long.parseLong(recordField[1])));
			System.out.println("通话结束时间："+new Date(Long.parseLong(recordField[2])));
			System.out.println("计费："+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))+"元");
		}
	}
}