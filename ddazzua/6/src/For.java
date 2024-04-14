
public class For {

	public static void main(String[] args) {
		
		/*
		 * int sum =0; for(int i = 1; i<=10; i++) {sum=sum+i;} System.out.println(sum);
		 */
		
		int sum=0;
		for(int i=1; i<=100; i++) {
		if(i % 2==0)
			{sum = sum+i;} }
		System.out.println("짝수의 합!: " + sum);
		
		int num=0;
		for(int e=1; e<=100; e++) {if (e % 2==1) {num=num+e;}}
		System.out.println("홀수의 합! " +num);
		
		
	}

}
