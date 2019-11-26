package treeset;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.*;
public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	@SuppressWarnings("rawtypes")
	private Vector communicationRecords;
	@SuppressWarnings("rawtypes")
	//private HashSet callToNumbers;
	private TreeSet callToNumbersSet;
	private ArrayList callToNumbersList;
	private HashSet callToNumberHashSet;
	public TelcomUser(String phoneNumber){
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new Vector();
       //this.callToNumbersSet=new TreeSet(); 
       this.callToNumbersList=new ArrayList();
		this.callToNumbersSet=new TreeSet();
		this.callToNumberHashSet=new HashSet();
		
		//�ٶ�ͨ����¼���������ԷֺŸ�����ÿ����¼�ڲ��������кͱ��С���ʼ�ͽ���ʱ��
	}
	@SuppressWarnings("unchecked")
	void generateCommubicateRecord(){
		//�������ͨ����¼��Ŀ
		int recordNum=new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++){
			//������ɵ�i��ͨ����¼
			//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
			//��System.currentTimeMillis()��ȷ������
			long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			long timeEnd=timeStart+60000+new Random().nextInt(600000);
			//��Calendar��ȡ��ǰʱ��
			Calendar cal=Calendar.getInstance();
			//�����ȥ����Сʱ��10Сʱ���ڣ�
			cal.add(Calendar.HOUR,-new Random().nextInt(10));
			//��ö�Ӧ����
			//long timeStart=cal.getTimeInMillis();
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			//long timeEnd=timeStart+60000+new Random().nextInt(600000);
			
			//���к���
			this.callTo=getCallTophoneNumber();
			this.callToNumbersSet.add(this.callTo);
			//����ͨ����¼
			this.communicationRecords.add(this.phoneNumber+
					","+timeStart+","+timeEnd+
					","+this.callTo+
					";");
	}
	}
	//������ɱ��к��루����λ�����������
	private String getCallTophoneNumber(){
		return "1593916000"+String.valueOf(new Random().nextInt(10));
	}
	//ģ��Ʒѷ��������ַ�������ʽ���ر�����λС����Ʒѽ��
	private String accountFee(long timeStart,long timeEnd){
		//ÿ���ӼƷ�NԪ
		double feePerMinute=0.2;
		//ͨ���������������������
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute * minutes;
		return String.format("%.4f",feeTotal);
	}
	//��ӡͨ����¼
	void printDetails(){
		//ʹ��Enumeration�ӿڱ�����ע��Ӧ��communicationRecords����ΪVector
		Enumeration enumeration=this.communicationRecords.elements();
		while(enumeration.hasMoreElements()){
			System.out.println("---------ͨ����¼�ָ���------");
		    String [] recordField=((String)enumeration.nextElement()).split(",");
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
		}
	}
	public void printCallToNumber() {
		for(Object callTo:this.callToNumbersList){
			System.out.println((String)callTo);
		}
		System.out.println("------List/TreeSet�ָ���-------");
		for(Object callTo:this.callToNumbersSet){
		System.out.println((String)callTo);
		}
	}
}

