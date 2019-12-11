package user;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import utility.Utility;
import java.util.*;

import phone.*;
import phonefactory.Factory;
public class TelcomUser {
	public String phoneNumber;
	public String callTo;
	public Phone ZUser;
	public ArrayList communicationRecords;
	private TreeSet callToNumber;
	private TreeMap singleRecord;
	public TelcomUser(String phoneNumber){
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new ArrayList();
		this.callToNumber=new TreeSet();
		//�ٶ�ͨ����¼���������ԷֺŸ�����ÿ����¼�ڲ��������кͱ��С���ʼ�ͽ���ʱ��
		Factory phonefactory=(Factory)Utility.getBean();
		ZUser=phonefactory.producePhone();
	}
	public void generateCommubicateRecord(){
		//�������ͨ����¼��Ŀ
		int recordNum=new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++){
			//this.callTo = getCallToPhoneNumber();
			this.callTo=getCallTophoneNumber();
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.singleRecord = new TreeMap();
			this.singleRecord.put("����",this.phoneNumber);
			this.singleRecord.put("��ʼʱ��",new Date(timeStart));
			this.singleRecord.put("����ʱ��",new Date(timeEnd));
			this.singleRecord.put("���к���",this.callTo);
			this.singleRecord.put("�Ʒ�",this.accountFee(timeStart,timeEnd));
			this.communicationRecords.add(this.singleRecord);
			//������ɵ�i��ͨ����¼
			//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
			//��System.currentTimeMillis()��ȷ������
			//long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			//long timeEnd=timeStart+60000+new Random().nextInt(600000);
			//��Calendar��ȡ��ǰʱ��
			//Calendar cal=Calendar.getInstance();
			//�����ȥ����Сʱ��10Сʱ���ڣ�
			//cal.add(Calendar.HOUR,-new Random().nextInt(10));
			//��ö�Ӧ����
			//long timeStart=cal.getTimeInMillis();
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			//long timeEnd=timeStart+60000+new Random().nextInt(600000);
			
			//���к���
			//this.callTo=getCallTophoneNumber();
			//����ͨ����¼
			//this.communicationRecords.append(this.phoneNumber+
				//	","+timeStart+","+timeEnd+
					//","+this.callTo+
					//";");
	}
	}
	//������ɱ��к��루����λ�����������
	public String getCallTophoneNumber(){
		return "1378216000"+String.valueOf(new Random().nextInt(10));
	}
	//ģ��Ʒѷ��������ַ�������ʽ���ر�����λС����Ʒѽ��
	public String accountFee(long timeStart,long timeEnd){
		//ÿ���ӼƷ�NԪ
		double feePerMinute=ZUser.feePerMinute();
		//ͨ���������������������
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute * minutes;
		return String.format("%.4f",feeTotal);
	}
	//��ӡͨ����¼s
	public void printDetails(){
		/*//��ȡȫ��ͨ����¼
		String allRecords=this.communicationRecords.toString();
		//�ָ�ͨ����¼
		String [] recordArray=allRecords.split(";");
		//ѭ���ָ��¼�ڵ�ÿһ����
		for(int i=0;i<recordArray.length;i++){
			System.out.println("---------ͨ����¼�ָ���------");
			String [] recordField=recordArray[i].split(",");
			System.out.println("���У�"+recordField[0]);
			System.out.println("���У�"+recordField[3]);
			Date timeStart=new Date(Long.parseLong(recordField[1]));
			Date timeEnd=new Date(Long.parseLong(recordField[2]));
			DateFormat mediumFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		//	System.out.println("ͨ����ʼʱ�䣺"+new Date(Long.parseLong(recordField[1])));
			//System.out.println("ͨ������ʱ�䣺"+new Date(Long.parseLong(recordField[2])));
			System.out.println("ͨ����ʼʱ�䣺"+simpleDateFormat.format(timeStart));
			System.out.println("ͨ������ʱ�䣺" + simpleDateFormat.format(timeEnd));
		//	System.out.println("ͨ������ʱ�䣺"+new Date(Long.parseLong(recordField[2])));
			System.out.println("�Ʒѣ�"
					+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
					+"Ԫ ��");
			//��װ��Long��larseLong���������Խ�Stringת��Long 
		}*/
		Iterator itRecords = this.communicationRecords.iterator();
		while(itRecords.hasNext()) {
			System.out.println("ͨ����¼�ָ���");
			this.singleRecord = ((TreeMap)itRecords.next());
			Set keySet = this.singleRecord.keySet();
			Iterator itKey = keySet.iterator();
			while(itKey.hasNext()) {
				Object key = itKey.next();
				Object value = this.singleRecord.get(key);
				System.out.println(key+":"+value);
				}
		}
	}
	
}
