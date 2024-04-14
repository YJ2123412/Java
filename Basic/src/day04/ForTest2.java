package day04;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		//1. 1부터 50까지 출력
		for(int i = 1; i<51; i++) {
			System.out.println(i);
		}
		
		//2. 50부터 1까지 출력
		for(int i = 50; i>0; i--) {
			System.out.println(i);
		}
		
		//3. 5부터 1까지 출력
		for(int i = 0; i<5; i++) {
			System.out.println(5-i);
		}
		System.out.println("==============================================");
		
		//1부터 10까지의 정수중 짝수만 출력 
		for(int i=1; i <11; i++) {
			if(i %2 ==0) {
				System.out.println(i);
			}
		}
		for(int i=2; i <11; i+=2) {
			System.out.println(i);
		}
		
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("숫자를 입력하세요"); int num = scan.nextInt(); for( int i = 1; i
		 * <=num; i++) { System.out.println("i="+i);}
		 */
		
		
		//4. 1부터 사용자가 입력한 정수까지의 합계 구하기
		
		System.out.println("1부터 몇까지의 숫자를 더할까요?");
		int num = scan.nextInt();
		//변화하는 정수, 값을 저장해야할때는 외부에서 가져와야함(사이클이 돌더라도 저장될 수 있도록)
		
		int total = 0; 
		
		for(int i = 1; i <=num; i++){
			total+=i;}
		System.out.println(total);
		

		
		
			
			
		

	}

}
