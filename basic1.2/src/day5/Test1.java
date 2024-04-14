package day03;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//사물함 번호 11 비밀번호 kim를 지정한다.
		int lockerNumber = 11;
		int userNumber = 0;
		String lockerPw = "kim";
		String userPw = null;
		
		//user에게 입력을 받는다. 11번 /seo
		System.out.println("사물함 번호 입력");
		userNumber = scan.nextInt();
		System.out.println("비밀번호 입력");
		userPw = scan.next();
		
		//지정값과 user를 비교한다.
		System.out.println("사물함 번호: "+(lockerNumber == userNumber));
		System.out.println("비밀번호: "+ (lockerPw.equals(userPw)));
		
		scan.close();
	}
}
