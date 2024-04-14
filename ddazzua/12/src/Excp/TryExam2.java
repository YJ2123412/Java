package Excp;

public class TryExam2 {

	public static void main(String[] args) {

		try{
			int num = 15;
			int result = num /0;
		
		
		System.out.println("결과: "+result);
		
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); //내부에서 에러난 내용 전체 출력
			System.out.println(e.getMessage());// 에러 메시지만 출력
			
		
		}
		System.out.println("프로그램 종료");
	}

}
