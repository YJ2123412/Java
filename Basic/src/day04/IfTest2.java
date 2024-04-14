package day04;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		//사용자에게 나이를 입력받고, 나이에 따라 출력하기
		//20살 미만: 미성년자, 20살 이상:성인, 음수 입력시 잘못되었다고 알려주기
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("나이를 입력해주세요"); int age = scan.nextInt();
		 * 
		 * if(age>=20) { System.out.println("성인입니다."); } else if (age > 0) {
		 * System.out.println("미성년자"); } else { System.out.println("잘못된 입력입니다"); }
		 */
		
		
		//실습1
		//사용자에게 점수를 입력받고, 학점을 출력하기
		//전제조건: 최대 점수는 100점, 최하점수는 0점
		//90점 이상:A, 80점 이상:B, 70이상:C, 70미만:F
		/*
		 * System.out.println("점수를 입력하세요"); int score = scan.nextInt(); if(score >=90) {
		 * System.out.println("A등급 입니다"); } else if( score >=80) {
		 * System.out.println("B등급 입니다."); } else if( score >=70) {
		 * System.out.println("C등급 입니다."); } else { System.out.println("F등급 입니다."); }
		 */
		
		// else if( score <70)   -> 코드상 세세한 조건을 할거면 else if로 하는 것, 잡지 않아도 되면 else
		//String grade = null; 로 해서 등급을 넣어서 한번에 출력해도 됨
		
		//실습2
		//사용자에게 주민번호 맨 뒷자리를 입력받고 해당 일자에 따라 예방접종일을 출력 - 한자리 입력
		//뒷자리 -1,6 월 2,7 화 3,8 수 4,9 목 5,0 금 ->5를 나누었을때 나머지의 값으로 짝을 만들수있음

		int num = 0;
		String day = null;
		
		System.out.println("주민번호 뒷자리를 입력(한자리): ");
		num = scan.nextInt();
		
		
		if(num == 1 || num ==6) {
			day = "월요일";
		}	else if(num == 2 || num ==7) {
			day = "화요일";
		}	else if(num == 3 || num ==8) {
			day = "수요일";
		}	else if(num == 4 || num ==9) {
			day = "목요일";
		}	else if(num == 5 || num ==0) {
			day = "금요일";
		}	else if(num<0 || num>10){
				System.out.println("잘못된 입력입니다.");
		}  else if(day != null){
			System.out.println("예방 접종 요일은 "+day+"입니다");
		}
		
		if(num<0 || num>10){
			System.out.println("잘못된 입력입니다.");
		}  else if(num % 5 ==1) {
			day="월요일";
		} else if(num % 5 ==2) {
			day="화요일";
		} else if(num % 5 ==3) {
			day="수요일";
		} else if(num % 5 ==4) {
			day="목요일";
		} else if(num % 5 ==0) {
			day="금요일";
		}
	
		
		
		
		scan.close();
		
	}

}
