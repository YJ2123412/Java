package ab;

public abstract class Phone {

	public abstract void  openingLogo();
	
	public void powerOn() {
		this.openingLogo();
		System.out.println("핸드폰이 켜집니다");
	}
	public void powerOff() {
		System.out.println("핸드폰이 꺼집니다");
	}
}
