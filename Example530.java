import java.util.Random;
class Storage{
	private String [] cells=new String [10];
	private int count=0,j;
	public int inpos,outpos;
	private Random r= new Random();
	//用户登录put
	public synchronized void put (int num){
		try{
			j=r.nextInt(10);
			while (j==cells.length){
				this.wait(100);
			}
			cells[inpos]=String.valueOf(num);
			System.out.print(cells[inpos]+"用户登录----");
			inpos++;
			if(inpos==cells.length)
				inpos=0;
			count++;
			System.out.println("当前在线人数为："+count);
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public synchronized void get(){ 
		try {
		    j=r.nextInt(10);
			while(j==1){
				this.wait(100);
			}
			String data=cells[outpos];
			System.out.print(data+"****用户注销********");
			cells[outpos]="\0";
			outpos++;
			if(outpos==cells.length)
				outpos=0;
			count--;
			System.out.println("当前在线人数为："+count);
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Input implements Runnable{
	private Storage st;
	private int num;
	Random r = new Random();
	Input(Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			num=r.nextInt(100);
			st.put(num);
		}
	}
}
class Output implements Runnable{
	private Storage st;
	Output (Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.get();
		}
	}
}
public class Example530 {
	public static void main(String[] args) {
		Storage st =new Storage();
		Input input =new Input(st);
		Output output =new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}
}

