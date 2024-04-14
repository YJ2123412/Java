package override;

public class Samsong extends Computer implements manytype.Computer {
	
	
	public void powerOn() {
		super.powerOn();
		System.out.println("헬로! 삼송!");
		System.out.println("컴퓨터가 실행됩니다");
	}
	public void powerOff() {
		super.powerOff();
		System.out.println("굿바이! 삼송!");
		System.out.println("컴퓨터가 종료됩니다");
	}
}
