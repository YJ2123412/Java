package day03;

import java.util.Scanner;

public class Operator5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		/*
		 * //실습1 //사용자에게 두자리 정수를 입력받는다 (nextInt)사용 System.out.println("두 자리 정수를 입력하세요");
		 * int user = scan.nextInt(); String user2 = Integer.toString(user);
		 * 
		 * //입력받은 두자리 정수에서 십의 자리, 일의자리 출력하기 char one = user2.charAt(1); char ten =
		 * user2.charAt(0);
		 * 
		 * //결과예시: 두자리 정수를 입력: 48
		 * 
		 * System.out.println("십의자리는 :"+ ten+ ". 일의 자리는: "+one); //십의자리: 4 //일의자리:8
		 * 
		 * 
		 */
		
		/*
		 * System.out.println("두 자리 정수를 입력하세요"); int num = 0; int ten2 = 0; int one2 =
		 * 0;
		 * 
		 * num = scan.nextInt(); //나누는 단위에 따라 10(두자리) 100(세자리) 등으로 바꿀 수 있음. ten2 = num /
		 * 10; one2 = num % 10; System.out.println("십의자리는 :"+ ten2+ ". 일의 자리는: "+one2);
		 */
		
		// 48/10해서 몫과 값으로 해도 됨
		/*
		 * //실습2 //사용자에게 금액을 입력받고 부를 수 있는 곡 수와 잔돈 출력 //1곡당 300원 //결과예시: //노래 3곡을 부를 수
		 * 있으며, 잔돈은 100원입니다.
		 * 
		 * // 노래 가격 int price = 300; // 금액입력(1곡당 300원)>> 1000
		 * System.out.println("금액을 입력하세요(1곡당 300원)"); int money = scan.nextInt(); //곡 횟수
		 * int count = money/price; //잔돈 int charge = money%price;
		 * System.out.println("노래 "+(money/price)+"곡을 부를 수 있고, 잔액은 "+(money%price)+
		 * "입니다."); System.out.println("노래 "+count+"곡을 부를 수 있고, 잔액은 "+charge+"입니다.");
		 * 
		 * scan.close();
		 */ 
		 
		 //실습 2를 next로 받아서 해보기
		int charge = 0;
		String user = null;
		int sing = 0;
		int change = 0;
		//투입 가격
		System.out.println("돈을 넣으세요 (1곡당 300원)");
		user = scan.next();
		int user2 = Integer.parseInt(user);
		//노래 가격
		charge = 300;
		//곡 횟수
		sing = user2/charge;
		//잔돈
		change = user2%charge;
		System.out.println("부를 수 있는 곡은 "+sing+"이고, 잔돈은"+change+"원 입니다");
	
		
		
		
		
		
	}

}
