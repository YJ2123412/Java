package day04;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      // 입력한 주민번호를 저장할 변수
//	      String socialNum = sc.next();
//	      // 주민번호 뒷자리에서 첫글자를 저장할 변수
//	      char first = socialNum.charAt(0);
	      
	      char first = sc.next().charAt(0);
	      System.out.println(first);
	      
	      switch(first) {
	      case '1': case '3':
	         System.out.println("남성입니다");
	         break;
	      case '2': case '4':
	         System.out.println("여성입니다");
	         break;
	      default:
	         System.out.println("잘못된 입력입니다");
	      }
	      
	      
	      

		
	}

}
