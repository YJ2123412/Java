package day01;

import java.util.Scanner;

public class H2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//사용자에게 두자리 정수를 입력받는다.  98

		System.out.println("두자리 정수를 입력하세요");
		//입력클래스 코드를 작성한다.

		int user = scan.nextInt();
		
		//int를 String으로 바꾼다.
		//1번
		String num03 = String.valueOf(user);
		//2번
		String count = Integer.toString(user);
		
		//9와 8을 따로 저장한다.
		char ten = count.charAt(0);
		char one = count.charAt(1);
		
		//출력
		System.out.println(num03);
		System.out.println("십의 자리 숫자는"+ten+"입니다.");
		System.out.println("일의 자리 숫자는"+one+"입니다.");
		

		scan.close();
	}

}
