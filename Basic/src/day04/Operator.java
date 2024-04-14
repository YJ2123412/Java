package day04;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		//삼항 연산자
		/*
		 * int num = 0; String result = num >0 ? "양수" : "음수"; String result2 = num <0 ?
		 * "양수" : num == 0? "0입니다" : "음수";
		 * 
		 * System.out.println(result); System.out.println(result2);
		 */
		//실습
		//사용자에게 나이를 입력받고 취득가능한 면허를 출력
		//19세이상 자동차, 17세 이상 오토바이 , 17세 미만 도보 가능
		//삼항연산자를 사용
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = 0;
		age = scan.nextInt();
		String result = null;
		String result2 = age >= 17 ? "오토바이 취득가능" : "도보 가능";
		
		result = age >= 19 ? "자동차 운전 면허 취득 가능" : result2;
		//result = age >= 19 ? "자동차 운전 면허 취득 가능" : age >= 17 ? "오토바이 취득가능" : "도보 가능";
		System.out.println(result);
 		
		scan.close();
		
	}

}
