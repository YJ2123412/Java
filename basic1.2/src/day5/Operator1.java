package day03;

public class Operator1 {

	public static void main(String[] args) {
		//단항연산자(양수, 음수)
		int num = 10;
		System.out.println(+num);
		System.out.println(-num);// ->해당 코드 내에서만 달라지는 것임. 변수에 저장된 값은 변경되지 않음, 대입연산자가 있어야만 저장됨
		num = -num;
		System.out.println(num);
		
		//논리부정(!)
		boolean isTrue = true;
		System.out.println(isTrue);
		System.out.println(!isTrue);
		
		//증감연산자 - >기존 값을 변경함, 저장	
		int num2= 5;
		
		System.out.println(num2++);
		System.out.println(num2);
		System.out.println(++num2);
		System.out.println(num2);
		
		//변수에 담기지 않은 값에 바로 사용할 수 없다
		//System.out.println(5++);
		

		
		
		
		
		
		
		
		
		
	}

}
