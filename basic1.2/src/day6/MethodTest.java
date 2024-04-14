package day6;

public class MethodTest {//클래스 시작
	
	//전달해준 문자열을 5번 출력하는 기능 사용을 원함
	//리턴타입은 보이드. 출력만 하기에.. 전달 받을 내용 없음
	void printFiveTimes(String msg) {
		for(int i = 0; i<5; i++) {
			System.out.println(msg);
		}
		return;
	}
	
	
	public static void main(String[] args) {
	
		
	MethodTest mt = new MethodTest();
	mt.printFiveTimes("Hello");
		
		
		
	}
}
