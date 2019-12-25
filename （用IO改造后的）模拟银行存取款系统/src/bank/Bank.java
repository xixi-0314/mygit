package bank;
import java.util.Scanner;
/**银行账户类*/
public class Bank {
	 int account;
	 private static User user;
	 
	 public static void main(String[] args){
		 Bank b=new Bank();
		 b.login();
		// b.operate();
	 }
	 /**
	  * 账户金额存入、取出及查询操作
	 */
	 @SuppressWarnings("resource")
	public void operate(){
		  Bank b= new Bank();
		  while(true){
			  System.out.println("请输入你要进行的操作类型，按回车键结束");
			  System.out.println("存款:1"+"\t"+"取款:2"+"\t"+"余额:3"+"\t"+"退出:0");
			  Scanner in= new Scanner(System.in);
			  String s=in.nextLine();

			  if("1".equals(s) || "2".equals(s)){
				  int num=0;
				  try{
					  System.out.print("输入存取的金额：");
					 num=Integer.parseInt(in.nextLine());
				  }catch(Exception e){
					  System.out.println("金额输入错误！");
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
				  System.out.print("退出系统！");
				  return;
			  }
			  else {
				  System.out.println("请输入0~3之间的相关数字");
			  }
		  }
	  }
	 /*
	   * 用户登录网上银行
	 */
      @SuppressWarnings("unused")
	public void login() {
    	  DBUtil dbutil = DBUtil.getInstance();
    	  Bank b=new Bank();
    	  System.out.println("欢迎进入网上银行系统!");
  		  System.out.println("请选择是否注册用户");
  		  System.out.println("开户请按4  进行其他操作请按5");
  		  @SuppressWarnings("resource")
		  Scanner in=new Scanner(System.in);
  		  String s=in.nextLine();
  		  if("4".equals(s)) {
  			 b.register();
  			 b.save();
  			 System.out.println("注册成功！");	
  		  }
  		  System.out.println("登录请按1 退出请按0");
		  @SuppressWarnings("resource")
		  Scanner in2 =new Scanner(System.in);
		  String s1 =in2.nextLine();
		  if("0".equals(s1)){
			 System.out.print("退出系统！");
			 return; 
		  }
    	  while(true) {
    		  @SuppressWarnings("resource")
			  Scanner in1 =new Scanner(System.in); //键盘录入
    		  System.out.println("请输入银行卡号：");
    		  String cardId =in1.nextLine();
    		  System.out.println("请输入银行卡密码：");
    		  String CardPwd=in1.nextLine();
    		  user = dbutil.getUser(cardId);
    		  //登录
              if(dbutil.getUsers().containsKey(cardId)
    		   && user.getCardPwd().equals(CardPwd)) {
    	            System.out.println("登录成功! 欢迎"+ user.getUserName() + "先生");
    	            b.operate();
    	            break;
              }
       		  else {
    			    System.out.println("银行卡号或密码错误！");
    			    continue;
    		 }
    	  }
      }
      private void save(){
    	  DBUtil dbUtil =DBUtil.getInstance();
    	  dbUtil.update();
      }
      //注册功能
      private void register(){
    	  User u = new User();
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.println("输入卡号： ");
    	  u.setCardId(scanner.nextLine());
    	  System.out.println("输入用户名： ");
    	  u.setUserName(scanner.nextLine());
    	  System.out.println("输入密码： ");
    	  u.setCardPwd(scanner.nextLine());
    	  System.out.println("输入手机号： ");
    	  u.setCall(scanner.nextLine());
    	  System.out.println("输入余额： ");
    	  u.setAccount(scanner.nextInt());
    	  DBUtil dbUtil = DBUtil.getInstance();
    	  dbUtil.addUser(u);
    	  
      }
      //存款
      public void income(int num) {
    	  account = user.getAccount()+ num;
    	  user.setAccount(account);
    	  System.out.println("存入金额"+num+"元成功");
      }
      //取款
      public void takeout(int num) {
    	  if(user.getAccount()>=num) {
    		  account=user.getAccount()-num;
    		  user.setAccount(account);
    		  System.out.println("取出金额"+num+"元成功");
    	  }else {
    		  System.out.println("余额不足，取款失败");  
    	  }
      }
      //余额
      public void show() {
    	  account=user.getAccount();
    	  System.out.println("账户总余额为"+account+"元");
      }
}