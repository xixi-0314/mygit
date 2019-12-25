package bank;
import java.util.Scanner;
/**�����˻���*/
public class Bank {
	 int account;
	 private static User user;
	 
	 public static void main(String[] args){
		 Bank b=new Bank();
		 b.login();
		// b.operate();
	 }
	 /**
	  * �˻������롢ȡ������ѯ����
	 */
	 @SuppressWarnings("resource")
	public void operate(){
		  Bank b= new Bank();
		  while(true){
			  System.out.println("��������Ҫ���еĲ������ͣ����س�������");
			  System.out.println("���:1"+"\t"+"ȡ��:2"+"\t"+"���:3"+"\t"+"�˳�:0");
			  Scanner in= new Scanner(System.in);
			  String s=in.nextLine();

			  if("1".equals(s) || "2".equals(s)){
				  int num=0;
				  try{
					  System.out.print("�����ȡ�Ľ�");
					 num=Integer.parseInt(in.nextLine());
				  }catch(Exception e){
					  System.out.println("����������");
					  continue;
				  }
				  switch(s){
				  case "1":
					  b.income(num);
					  break;
				  case "2":
					  b.takeout(num);
					  break;
				  }
			  }
			  else if("3".equals(s)){
				  b.show();
			  }
			  else if("0".equals(s)){
				  System.out.print("�˳�ϵͳ��");
				  return;
			  }
			  else {
				  System.out.println("������0~3֮����������");
			  }
		  }
	  }
	 /*
	   * �û���¼��������
	 */
      @SuppressWarnings("unused")
	public void login() {
    	  DBUtil dbutil = DBUtil.getInstance();
    	  Bank b=new Bank();
    	  System.out.println("��ӭ������������ϵͳ!");
  		  System.out.println("��ѡ���Ƿ�ע���û�");
  		  System.out.println("�����밴4  �������������밴5");
  		  @SuppressWarnings("resource")
		  Scanner in=new Scanner(System.in);
  		  String s=in.nextLine();
  		  if("4".equals(s)) {
  			 b.register();
  			 b.save();
  			 System.out.println("ע��ɹ���");	
  		  }
  		  System.out.println("��¼�밴1 �˳��밴0");
		  @SuppressWarnings("resource")
		  Scanner in2 =new Scanner(System.in);
		  String s1 =in2.nextLine();
		  if("0".equals(s1)){
			 System.out.print("�˳�ϵͳ��");
			 return; 
		  }
    	  while(true) {
    		  @SuppressWarnings("resource")
			  Scanner in1 =new Scanner(System.in); //����¼��
    		  System.out.println("���������п��ţ�");
    		  String cardId =in1.nextLine();
    		  System.out.println("���������п����룺");
    		  String CardPwd=in1.nextLine();
    		  user = dbutil.getUser(cardId);
    		  //��¼
              if(dbutil.getUsers().containsKey(cardId)
    		   && user.getCardPwd().equals(CardPwd)) {
    	            System.out.println("��¼�ɹ�! ��ӭ"+ user.getUserName() + "����");
    	            b.operate();
    	            break;
              }
       		  else {
    			    System.out.println("���п��Ż��������");
    			    continue;
    		 }
    	  }
      }
      private void save(){
    	  DBUtil dbUtil =DBUtil.getInstance();
    	  dbUtil.update();
      }
      //ע�Ṧ��
      private void register(){
    	  User u = new User();
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.println("���뿨�ţ� ");
    	  u.setCardId(scanner.nextLine());
    	  System.out.println("�����û����� ");
    	  u.setUserName(scanner.nextLine());
    	  System.out.println("�������룺 ");
    	  u.setCardPwd(scanner.nextLine());
    	  System.out.println("�����ֻ��ţ� ");
    	  u.setCall(scanner.nextLine());
    	  System.out.println("������ ");
    	  u.setAccount(scanner.nextInt());
    	  DBUtil dbUtil = DBUtil.getInstance();
    	  dbUtil.addUser(u);
    	  
      }
      //���
      public void income(int num) {
    	  account = user.getAccount()+ num;
    	  user.setAccount(account);
    	  System.out.println("������"+num+"Ԫ�ɹ�");
      }
      //ȡ��
      public void takeout(int num) {
    	  if(user.getAccount()>=num) {
    		  account=user.getAccount()-num;
    		  user.setAccount(account);
    		  System.out.println("ȡ�����"+num+"Ԫ�ɹ�");
    	  }else {
    		  System.out.println("���㣬ȡ��ʧ��");  
    	  }
      }
      //���
      public void show() {
    	  account=user.getAccount();
    	  System.out.println("�˻������Ϊ"+account+"Ԫ");
      }
}