package Inter2;

public class BlutoothMIC implements MicroPhone, Speaker {

	@Override
	public void music() {
		System.out.println("마이크에 장착된 스피커에서 소리가 나옵니다");
		
	}

	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래를 부릅니다.");
		
	}

}
