package day5;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		//사용자에게 정수를 입력받아 정답과 비교하여
		//정답과 일치하면 입력을 종료한다
		//정답과 일치하지 않으면 다시 정수를 입력받는다.
		int answer = 23;
		int user = 0;
		Scanner scan = new Scanner(System.in);
		
		while(user != answer) { //같아지는 순간 종료됨
			System.out.println("수를 입력하세요");
			user = scan.nextInt();
		}	System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
