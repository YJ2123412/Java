package A01;

public class Sample {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 10;
		a=b;
		System.out.println(a+"!");
		System.out.println(b);
		
		while(b<30) {
			b++;
		}
		
		System.out.println(a+"?");
		System.out.println(b);
		
		
		for(int i=0; i<10; i++) {
			b++;
		}
		System.out.println(a+"@");
		System.out.println(b);
		
		
	}

}
