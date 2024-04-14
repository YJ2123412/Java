
public class Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*연산자
		 * int num = 10; int sum = 0;
		 * 
		 * sum = num++; String str=""; str = "sum ="+ sum +", num : " +num;
		 * 
		 * System.out.println(str);
		 * 
		 * sum = ++num;
		 * 
		 * System.out.println("sum ="+ sum +", num : " +num);
		 */
		
		int a =10;
		int b = 15;
		int c = 12;
		
		System.out.println( a>= b);
		System.out.println( a < b);
		System.out.println( c == b);
		System.out.println( a != b);

		//논리연산 &&(and) ||(역슬래시+시프트: OR)
		
		System.out.println( ( a < b) && (b > c));
		System.out.println(( a > b) && (b > c));
		System.out.println(( a > b) || (b > c));

		
		
		
	}

}
