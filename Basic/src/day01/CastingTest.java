package day01;

public class CastingTest {

	public static void main(String[] args) {
		//강제형변환 (명시적 형변환)
		
//		double의 값을 ->float으로
		float floatVar= (float)10.3;  //10.3f가 붙지않아서 더블인 상태 ㅇㅇ-> L ,f 는 붙이지 않으면 기본 단위로 인식함.
		System.out.println((float)10.9);
		System.out.println((float)9.123456789);
		
		//long-> int
		int intVar = (int)3L;
		System.out.println((int)3L);
		System.out.println((int)2147483648L);
		
		//실수형 -> 정수형
		int intVar2 =(int) 13.7; 
		System.out.println(intVar2); 
		
		
		//문자형
		System.out.println((int)'A');
		System.out.println((char)65);
		
		//논리형 - 변환 자체가 불가능
		
		//문자열
		System.out.println(13+"ABC"); //연산이 안되면 연결을 시킴 / 빈 문자열이 포함될 경우- >String 이 됨..
		String strVar = 13+"";
		
		//다른 자료형 -> 문자열
		
		String doubleStr = 13.9 +"";
		String booStr = true + "";
		String charStr = 'a' +"";
		
		System.out.println(doubleStr);
		
		int strInt = Integer.parseInt("19");
		double strDou = Double.parseDouble("13.7");
		double srtDou3 = Double.valueOf("1.25");
		System.out.println(strDou);
		
		
		//문자형
		
		String msg = "가나다라";
		char spell = msg.charAt(0); //문자열에서 존재하지 않는 자리번호를 사용하면 에러 발생
		
		System.out.println(strInt);
		
	}

}
