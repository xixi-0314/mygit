package tvfactory;
import tv.*;
public class HaierTVFactory implements TVFactory {
	public Tv produceTv(){
		return new HaierTv();
	}

}
