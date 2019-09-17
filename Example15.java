class Single {
    //自己创建一个对象
	private static Single INSTANCE=new Single();
	private Single (){}
	public static Single getInstance(){
		return INSTANCE;
	}
}

public class Exemple15{
	public static void main (String[]args){
		Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		System.out.println(s1==s2);
	}
}
