package day01;

public class PrintTest {

	public static void main(String[] args) {

		String name = "홍길동";
		
		//출력메소드
		System.out.println("안녕하세요");
		System.out.print("여러분");
		System.out.print("여러분");
		System.out.println("안녕하세요");

		//서식문자
		String wether = "맑음";
		int month =12;
		int date =10;
		double max = 16.123456789;
		double min = 8.123;
		
		System.out.println("오늘의 날씨는"+wether+" 입니다.");
		System.out.printf("오늘은 %d 월 입니다.\n",month);
		
		//실수는 소수점 7번째 자리에서 반올림, 6번째 자리까지 출력
		
		System.out.printf("오늘의 최고 기온은 %f입니다.\n",max);
		System.out.printf("오늘의 최고 기온은 %.3f입니다.\n",max);
		
		//문자열: 문자의 나열이다 (나열에는 순서가 있다) -인덱스랑 세는 법 x 갯수 O
		String menu = "코카콜라";
		System.out.printf("%.2s의 가격은 1000원입니다.\n", menu);
		System.out.println("---------------");
		
		double perimeter = 3.141592;
		System.out.printf("숫자는 : %.4f\n", perimeter);//지정한 자리까지 반올림해서 출력함

		System.out.println("---------------");
		
		//제어문자
		
		System.out.println("줄바꿈\n");
		System.out.println("\t연습");
		System.out.println("\'이것\'을 강조");
		System.out.print("안녕은 \"hello\"입니다.");
		
		System.out.println("\n---------------");
		//실습1
		System.out.println("봄\n\t여름\n가을\n\t겨울");
		
		
		

		

		
		
	}

}
