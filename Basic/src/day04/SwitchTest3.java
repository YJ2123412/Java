package day04;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);		
		//실습2
		//주민번호 7자리를 입력받고 여성인지, 남성인지 출력하기
		//뒷자리의 첫글자가 2,4 : 여성 , 1,3: 남성
		
		System.out.println("주민번호 뒷자리 7자리를 입력해주세요");
		//String age2 = scan.next();
		//주민번호 첫글자를 저장할 변수 
		char first = scan.next().charAt(0);
	
		
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
