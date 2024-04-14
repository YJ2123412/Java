package day01;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
	
		//사용자에게 두자리 정수를 입력받는다.  98

		System.out.println("두자리 정수를 입력하세요");
		//입력클래스 코드를 작성한다.

		int user = scan.nextInt();
		
		if(user==98) {
		System.out.println("십의 자리는 9, 일의 자리는 8입니다.");}
		
		
		//1. []로 해보기 -x
		//2. String으로 바꿔보기 - x-> 방법이 잘못됨
		//3. char로 바꿔보기 -x
	
		scan.close();
	}
	
}
