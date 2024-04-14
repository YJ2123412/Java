package day04;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		/*
		 * int num = 100; switch(num) { //num == 1 case 1:
		 * System.out.println("num이 1이라면 실행할 코드"); break; case 2:
		 * System.out.println("num이 2이라면 실행할 코드"); break; case 37:
		 * System.out.println("num이 37이라면 실행할 코드"); break; default:
		 * System.out.println("모두 일치하지 않습니다."); }
		 */
		
		//실습 1
		//12,1,2, = 겨울
		//3,4,5= 봄
		//6,7,8=여름
		//9,10,11=가을
		
		Scanner scan = new Scanner(System.in);
	
		/*
		 * System.out.println("월을 입력하세요"); int month = scan.nextInt();
		 * 
		 * switch(month) { case 12: case 1: case 2: System.out.println("겨울"); break;
		 * case 3: case 4: case 5: System.out.println("봄"); break; case 6: case 7: case
		 * 8: System.out.println("여름"); break; case 9: case 10: case 11:
		 * System.out.println("가을"); break; default: System.out.println("잘못된 입력입니다");
		 * break; }
		 * 
		 */
		
		
		
		//실습2
		//주민번호 7자리를 입력받고 여성인지, 남성인지 출력하기
		//뒷자리의 첫글자가 2,4 : 여성 , 1,3: 남성
		
		System.out.println("주민번호 뒷자리 7자리를 입력해주세요");
		String age2 = scan.next();
		//주민번호 첫글자를 저장할 변수 
		char first = age2.charAt(0);
	
		
		//값의 데이터 타입 통일
		switch(first) {
		case '1': case '3': 
			System.out.println("남성");
		break;
		case '2': case '4': 
			System.out.println("여성");
		break;
		default: System.out.println("잘못된 입력입니다.");
		break;
		}
		
		
		
		
		
		
		
	}

}
