package manytype;

public class Lg implements Computer {

	@Override
	public void powerOn() {
		System.out.println("사랑해요 엘지");
		System.out.println("전원이 켜집니다");
		
	}

	@Override
	public void powerOff() {
		System.out.println("사랑해요 엘지");
		System.out.println("전원이 꺼집니다");
	}

}
