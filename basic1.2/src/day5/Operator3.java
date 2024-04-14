package day05;

public class Operator3 {

	public static void main(String[] args) {
		
		//비트 연산자
		System.out.println(10&11);
		
		//십진법을 이진법으로 바꿔줌
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(11));
		
		// & (논리곱)
		System.out.println(10&11);
		// | (논리합)
		System.out.println(10|11);
		//^(베타 논리합): 서로 다르면 1,같으면 0
		System.out.println(10^11);
		// ~ 논리의 부정
		System.out.println(~10);
		
		
		//쉬프트 연산자
		System.out.println(10 >> 1);
		System.out.println(10 << 1);
		
		
		
		
		
		
	}

}
