package ex01_object;

public class User {
	//필드
	private int userNumer; //회원 번호
	private String userName; //회원 이름
	
	//생성자
	public User(int userNumer, String userName) {
		super();
		this.userNumer = userNumer;
		this.userName = userName;
	}

	//게터와 세터
	public int getUserNumer() {
		return userNumer;
	}

	public void setUserNumer(int userNumer) {
		this.userNumer = userNumer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	
}
