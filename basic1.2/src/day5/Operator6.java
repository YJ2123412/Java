package day03;

import java.util.Scanner;

public class Operator6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//조건식
		System.out.println(10>0);
		System.out.println(10>0 && 10>11);
		System.out.println("ABC".equals("ABC"));
		
		//삼항 연산자
		String result = 10 > 0 ? "양수" : "음수";
		System.out.println(result);
		System.out.println("숫자를 입력하시오");
		int num = scan.nextInt();
		String result2 = num%2 == 0 ? "짝수": "홀수" ;
		System.out.println(result2);
		
	}

}
