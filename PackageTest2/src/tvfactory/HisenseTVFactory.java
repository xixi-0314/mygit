package tvfactory;
import tv.*;
public class HisenseTVFactory implements TVFactory {
     public Tv produceTv(){
    	 return new HisenseTv();
     }
}
