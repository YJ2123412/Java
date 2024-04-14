package Book;

public class Novel extends Book2 {

	public Novel(String title, int price) {
		//부모 클래스의 생성자가 파라메터(매개변수)가 없는 기본생성자가 아닐 경우, 시스템이 자동으로 만들수 없어서 직접 호출해야함
		super(title, price);
	}
	
	
}
