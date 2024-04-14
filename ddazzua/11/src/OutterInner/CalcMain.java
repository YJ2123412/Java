package OutterInner;

public class CalcMain {

	public static void main(String[] args) {

		
		Calculator ca1 = new Calculator(12, 20);
		
		//내부클래스선언   - 외부클래스.외부클래스의 메서드 이름 =  -.new --();
		Calculator.Calc calc = ca1.new Calc();
		
		//내부클래스 메서드 실행
		
		System.out.println("더하기 값:"+ calc.add());
		
		
		
	}

}
