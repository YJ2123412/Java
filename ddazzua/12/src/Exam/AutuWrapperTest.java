package Exam;

public class AutuWrapperTest {

	public static void main(String[] args) {

		Integer num01 = 10;//오토박싱
		//Integer num02 = new Integer(10); ->이제 쓰지마
		Integer num03 = Integer.valueOf(10);
		Integer num04 = Integer.valueOf("10");  //-> 정수타입만 가능, 실수타입 불가능
		
		System.out.println(num03);
		System.out.println(num04);
		
		Double dnum01 = 10.11;
		Double dnum02 = Double.valueOf("10.11"); //->실수타입도 가능
		
		String intstr = "70";
		String doublestr = "60.77";
		
		int myScore = Integer.parseInt(intstr);
		double cutline = Double.parseDouble(doublestr);
		
			
		//valuOf() ->   정수, 문자형 타입 정수, 리턴타입 :Integer     
		//parseInt() -> 문자형 타입 정수, 리턴타입: int    ->String만 가능
		//Wrapper -> 문자로 받은걸(숫자) 형변환할때 주로 씀
		
		
	}

}
