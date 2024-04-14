package ab;

public class Pasta extends Receipt {

	public Pasta(String chef) {
		super(chef);
	}
	
	public void makeSource() {
		System.out.println("파스타 소스는 직접 만듭니다.");
	}

}
