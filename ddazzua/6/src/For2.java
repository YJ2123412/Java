
public class For2 {

	public static void main(String[] args) {
		
		/*
		 * int sum =0; for(int i = 1; i<=10; i++) {sum=sum+i;} System.out.println(sum);
		 */
		
		int sum=0;
		for(int i=1; i<=100; i++) {
		if(i % 2==0)
			{sum = sum+i;} 
		else if(i%2==1) {System.out.println("홀수의 합! "+sum);}}
		System.out.println("짝수의 합!: " + sum);
		
		
		
	}

}
