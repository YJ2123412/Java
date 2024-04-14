package A01;

import java.util.Scanner;

public class Method {
	
	Scanner scan = new Scanner(System.in);
	//선언 및 구현
	void printThree() {
		for(int i = 0; i <3; i++){
			System.out.println("hello");
		}
	}
	
	void plus (int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	void printEvenTotal () {
		int total = 0;
		for(int i =0; i<51; i++) {
			if(i%2==0) {
				total+=i;
			}
		} System.out.println("토탈: "+total);
	}
	
	
	boolean isEvenNum(int num) {
	/*
	 * if(num% 2==0) { return true; } else { return false; } }
	 */
	 return num % 2==0 ? true : false; }
	
	public static void main(String[] args) {
		
		Method mt = new Method();
		
		
		//메소드1
		//"hello" 문자열을 3번 입력한다
		//리턴타입: void
		//메소드명: printHello
		//자료형 매개변수명: x
		//실행할 코드:
		
		//호출
		mt.printThree();
		
		
		
		//메소드2.
		//두개의 정수의 합계를 출력한다
		//두개의 정수를 각각 입력받아..?
		//두개를 합해
		//리턴타입: void
		//메소드명: printSum
		//자료형 매개변수명: int num1, int num2 / 메소드의 매개변수와 타입과 수, 순서가 일치해야함
		//실행할 코드:
		mt.plus(10, 3);
		
		
		//메소드3
		//1~50까지의 정수중에 짝수의 합계를 출력한다.
		//리턴타입: void
		//메소드명: printEvenToTal
		//자료형 매개변수명: X
		//실행할 코드:
		mt.printEvenTotal();
		
		
		//메소드4
		//전달한 정수의 짝수 여부를 구한다.
		//리턴타입: boolean ->여부를 구할땐 논리형으로
		//메소드명: isEvenNum
		//자료형 매개변수명: int num
		//실행할 코드: 
		boolean result = mt.isEvenNum(17);
		System.out.println(result);

		
		
	}
	

}
