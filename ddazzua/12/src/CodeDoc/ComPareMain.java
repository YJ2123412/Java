package CodeDoc;

public class ComPareMain {

	public static void main(String[] args) {
		Data val01 = new Data(20);
		Data val02 = new Data(20);
		
		System.out.println("val01 == val02: "+ (val01 == val02));
		System.out.println("val01 == val02: "+ (val01.equals(val02)));

		
	}

}
