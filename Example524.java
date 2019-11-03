
public class Example524 {


	public static void main(String[] args) {
		//Scanner input=new Scanner(System.in);
		Download file=new Download();
		Thread loading1=new Thread(file);
		Thread loading2=new Thread(file);
		loading1.start();
		loading2.start();
	}

}
class Download implements Runnable{
	boolean []data=new boolean[100];
	public void run(){
		while(true){
			int begin=(int)(Math.random()*100);
			int end=(int)(Math.random()*100);
			for(int i=begin;i<end&&i<=100;i++)
			{
				if(data[i]==false)
				{
					data[i]=true;
					System.out.println(i);
				}
					
			}
		}
	}
}
