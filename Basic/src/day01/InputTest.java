package day01;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * //단축키 컨트롤+쉬프트+O / scan 변수에 Scanner의 클래스에 정보를 저장한다. Scanner scan = new
		 * 
		 * 
		 * System.out.println("이름을 입력하세요"); String name = scan.next();
		 * System.out.println(name+"님 안녕하세요");
		 * 
		 * String firstName = scan.next(); String lasttName = scan.next();
		 * System.out.println(lasttName+firstName+"님 안녕하세요");
		 * 
		 * Strirng fullName = scan.nextLine(); System.out.println(fullName+"님 안녕하세요");
		 */
		
		
		//사용자에게 두자리 정수를 입력받는다. 
		//입력클래스 코드를 작성한다.
		//스캐너를 연다.
		System.out.println("두자리 정수를 입력하세요");
		String number = scan.next();
		//입력한 문자열의 0번째는 십의자리 숫자이다 
		//0번째를 char 변수에 담는다
		//입력한 문자열의 1번째는 십의자리 숫자이다 
		//1번째를 char 변수에 담는다
		//변수에 담긴 2개의 값을 문자열로 연결하여 출력한다.
		
		char ten = number.charAt(0);
		char one = number.charAt(1);
		
				
		System.out.println("십의 자리 숫자는"+ten+"입니다.");
		System.out.print("일의 자리 숫자는"+one+"입니다.");
				
/*		System.out.printf("십의 자리 숫자는 %.0c입니다.\n",first);
		System.out.printf("일의 자리 숫자는 %.1c입니다.",first);
*/
		
		
		nextInt() 해서 98입력해서 해보기, 연산 가능하다는걸 해보기 
		
		
	}

}
