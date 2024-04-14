package day04;

import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {

		//실습2
		//주민번호 7자리를 입력받고 여성인지, 남성인지 출력하기
		//뒷자리의 첫글자가 2,4 : 여성 , 1,3: 남성
		
		Scanner scan =new Scanner(System.in);
	
		System.out.println("주민번호 뒷자리를 입력하세요");
		String num = scan.next();
		
		char num2 = num.charAt(0);
		
		switch(num2) {
		case '1': case '3': 
			System.out.println("남성");
		break;
		case '2': case '4':
			System.out.println("여성");
		
		}
		scan.close();
		
		
		
		
		
		
		
	}

}
