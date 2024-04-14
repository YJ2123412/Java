package day5;

	import java.util.Scanner;

	public class HomeWork3 {

		public static void main(String[] args) {
			
			//사용자가 입력한 숫자까지의 합, 홀수의 합, 짝수의 합 구하기
			Scanner scan = new Scanner(System.in);
			int num = 0;
			int sum = 0;
			int sum2 = 0;
			int sum3 = 0;
			//사용자가 숫자를 입력하고
			
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();
			//홀수 or 짝수의 합을 구한다.
			for(int i = 0; i<= num; i++) {
				
				if(i%2==0) {
					sum= sum+i;
				} else if(i%2==1){
					sum2 = sum2+i;
				}  
					sum3=sum3+i;
				
			}
			System.out.println("짝수의 합: "+sum);
			System.out.println("홀수의 합: "+sum2);
			System.out.println("숫자의 합: "+sum3);

		}

	}



