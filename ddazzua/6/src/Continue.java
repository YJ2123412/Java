
public class Continue {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {
				System.out.println(i);
				continue; //실행문 종료
			}
			
			sum += i;
		}
		System.out.println(sum);
		
	}

}
