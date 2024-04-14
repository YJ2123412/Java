package day04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// 실습5
		// 0부터 사용자가 입력한 정수까지 이어붙여서 출력하기
		// 만약 정수가 홀수인 경우에는 숫자뒤에 ! 를 붙여서 출력한다
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
		
		for(int i = 0; i <=num; i++) {
			System.out.print(i+"  ");
			if(i%2 == 1){
			System.out.print("!");
			}
		}
		

	}

}
