import tv.*;
import tvfactory.*;
import utility.*;

public class Gfangfa2 {
	     public static void main(String args[]){
	    	 Tv tv;
	    	 TVFactory factory;
	    	 factory = (TVFactory)XMLUtil.getBean();
	    	 tv = factory.produceTv();
	    	 tv.play();
	     }
}
