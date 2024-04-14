package day5;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		//실습1
		//사용자에게 양의 정수 3개를 입력받기(1개씩 입력받는다) ->누적입력 3번씩 종료
		//음수 입력시 음의정수를 입력하였습니다. 출력하고 다시 입력받기
		//누적된 양의 정수 개수가 3개가 아니라면 다시 입력받기
		
		Scanner scan = new Scanner(System.in);
		/*
		 * int user1 = 0; int user2 = 0; int user3 = 0;
		 * 
		 * //양수가 되면 멈춰야함 while(user1<0 && user2<0 && user3<0) {
		 * System.out.println("수를 입력하세요"); user1 = scan.nextInt();
		 * System.out.println("수를 입력하세요"); user2 = scan.nextInt();
		 * System.out.println("수를 입력하세요"); user3 = scan.nextInt();
		 * 
		 * 
		 * } System.out.println("프로그램 종료");
		 * 
		 * 
		 */

		//양의 정수를 개수를 저장할 변수
		int userCount = 0;
		//입력받은 정수를 저장할 변수
		int userNum = 0;
		
		//정수를 입력받는다
		while (userCount<3) {
			System.out.println("양의 정수를 입력하세요");
			userNum = scan.nextInt();
			if(userNum >0) {
				userCount++;
			} else {
				System.out.println("음의 정수를 입력하셨습니다.");
			}
		}System.out.println("시스템이 종료됩니다");
		//입력된 정수의 양수 음수 여부를 판별한다
		
		//입력받은 양의 정수 개수를 기억해야한다
		
		//기타제어문
		int count2 = 0;
		
		while(true) {
			if(count2 ==3) {
				break;
			}
			System.out.println("안녕");
			count2++;
		}
		
		
		
		
		
	}

}
