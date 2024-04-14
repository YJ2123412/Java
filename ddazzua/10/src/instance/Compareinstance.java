package instance;

import manytype.Computer;
import manytype.Lg;
import override.Samsong;

public class Compareinstance {

	public static void getMyType(Computer com) {
		if(com instanceof Samsong) {
			System.out.println("삼송!");
		}else if(com instanceof Lg) {
			System.out.println("lg");
		}else {
			System.out.println("넌 누구니");
		}
	}
	
	public static void main(String[] args) {
		
		Samsong sam1 = new Samsong();
		Lg lg = new Lg();

		Compareinstance.getMyType(lg);
		Compareinstance.getMyType(sam1);

		
	}

}
