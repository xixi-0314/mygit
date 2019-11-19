 package user;
import java.text.*;
import utility.Utility;
import java.util.*;

import telcomfactory.TelcomFactory;
import telcom.Telcom;

public class TelcomUser {
	private String phoneNumber;    //主叫号码
	private String callTo;         //被叫号码
	private StringBuffer communicationRecords;
	Telcom Zuser;
	
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
		
		TelcomFactory telcomfactory = (TelcomFactory)Utility.getBean();
		Zuser = telcomfactory.createTelcom();
		
	}
	//模拟通话记录的生成
	 public void generateCommunicateRecord() {
		//随机生成通话记录数目
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//随机生成第i条通话记录
			
			//开始时间
			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
			//结束时间
			long timeEnd = timeStart + 60000 +new Random().nextInt(600000);
			//被叫号码
			
			getCallToPhoneNumber();
			callTo = getCallToPhoneNumber();
			
			//插入通话记录
			this.communicationRecords.append(this.phoneNumber + "," + timeStart + "," + 
			                                 timeEnd + "," + this.callTo + ";");
			
		}
		
	}
	
	//随机生成被叫号码（后四位随机）并返回
    public String getCallToPhoneNumber() {
		return "1380372" +String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10));
		
	}
	
	//模拟计费办法，以字符串的形式返回保留4位小数的计费结果
	public  String accountFee(long timeStart,long timeEnd) {
		//每分钟收费N元
		double feePerMinute = Zuser.feePerMinute();
		//通话每分钟数按四舍五入计算
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double  feeTotal = feePerMinute*minutes;
		return String.format("%.4f", feeTotal);
		
		
	}
	
	//打印通话记录
	public void printDetails() {
		//获取全部通话记录
		String allRecords = this.communicationRecords.toString();
		//分割通话记录
		String [] recordArray = allRecords.split(";");
		//循环分割记录内的每一项并输出
		for(int i=0;i<recordArray.length;i++) {
			String [] recordField = recordArray[i].split(",");
			SimpleDateFormat date1 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 点 mm 分 ss 秒");
			
			//DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
			System.out.println("-----------通话记录分割线----------");
			System.out.println("主叫："+recordField[0]);
			System.out.println("被叫："+recordField[3]);
			System.out.println("通话开始时间：" +date1.format(Long.parseLong(recordField[1])));
			System.out.println("通话结束时间：" +date1.format(Long.parseLong(recordField[2])));
			System.out.println("计费：" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) ) + "元");
			
			
			
			
		}
	}

}

