package ex02_Wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		Integer intNum = new Integer(10);
		Integer intNum2 = Integer.valueOf(10);
		//auto boxing
		Integer intNum3 = 10;
		
		System.out.println(intNum);
		System.out.println(intNum2);
		System.out.println(intNum3);
		
		System.out.println(intNum.toString());
		
		Double doubleNum = 10.7;
		Double doubleNum2 = Double.valueOf(10.3);
		
		//실수는 정확한 값을 표현하지 못하는 경우가 있어 연산결과가 실제 연산의 값과 다를 수 있다
		System.out.println(1.0+1.32);
		
		
		//unboxing
		
		int intVar1 = intNum.intValue();
		int intVar2 = intNum3;
		
		
		
		
		
	}

}
