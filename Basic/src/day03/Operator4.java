package day03;

public class Operator4 {

	public static void main(String[] args) {
		//관계 연산자 - 문자열 x
		System.out.println( 1== 3);
		System.out.println( 1!= 3);
		System.out.println( 1> 3);
		System.out.println( 1>= 3);
		
		//문자열은 equals() 메소드를 사용한다
		System.out.println("AB"=="AB");
		System.out.println("AB".equals("AB"));
		System.out.println(!"AB".equals("AB"));
		
		String msg1 = "안녕하세요";
		String msg2 = "안녕하세요";
		
		System.out.println(msg1.equals(msg2));
		
		//논리연산자 &&(and) ||(or)
		System.out.println(true&&true);
		System.out.println(false&&true);
		System.out.println(true||true);
		System.out.println(false||true);
		
		System.out.println(1==3 && 1==1);
		System.out.println(1==3 || 1==1);
		
		String id = "min";
		String pw = "min1234";
		
		System.out.println(id.equals("min") && pw.equals("min12"));

		 
		int num = 15;
		System.out.println(10 >= num && num<=20 );
		
		//대입연산자
		
		int num2 =10;
		num2 +=1;  
		num2 -= 1;
		num2 *= 10;
		num2 /= 10;
		num2 %= 3;
		
	}

}
