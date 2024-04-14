package day01;

public class VariableTest {
	public static void main(String[] args) {
		
		//정수형 - 자동형변환 O 
		int month = 12;
		long date = 10L;
		
		//실수형 - 자동형변환 X
		float min = 8.6f;
		double max = 16.3;
		
		
		//논리형 -> is를 붙이지 않으면 키워드 이기에 true 쓸수없음
		boolean isTrue = false;
		
		
		//문자형- 한개이상
		char gender = 'F';
		
		//참조자료형 - 문자열 - 0개이상 (빈문자열 O)
		String name = "홍길동";
		
		//상수 - 값을 변경할 수 없음, 선언시 고정 ->바꿀 수 없음을 컴파일(작성시)시점에 알 수 있게 됨.. 
		
		final int AGE2 = 15;
		System.out.println(AGE2);

		
		String PASSWORD = "abcd";
		PASSWORD = "가나다라";
		System.out.println(PASSWORD);
		
		System.out.printf("오늘의 날씨는 %s입니다.","맑음");

		
		
	}
}
