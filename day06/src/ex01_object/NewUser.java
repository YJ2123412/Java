package ex01_object;

import java.util.Objects;

public class NewUser {
	//필드
	private int userNumber; //회원 번호
	private String userName; //회원 이름
	
	//생성자
	public NewUser(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}

	//게터와 세터
	public int getUserNubmer() {
		return userNumber;
	}

	public void setUserNubmer(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "NewUser [userNumber=" + userNumber + ", userName=" + userName + "]";
	}


	/*
	 * @Override public String toString() {
	 * 
	 * return "userName= "+userName+"userNubmer = "+userNumber; }
	 */
	
	//equals 재정의 만약전달된 캑체와 타입이 같고, 넘버와 네임이 같다면 동등한 객체로 정의
	//Object obj : 자바의 모든 클래스는 Object 클래스를 상속받기에 
	//obj 매개변수에 모든 클래스의 객체가 전달될 수 있음(up casting)
	/*
	 * @Override public boolean equals(Object obj) { //객체 타입 체크 //전달된 객체가 NesUser가
	 * 아니라면 false 리턴 if(!(obj instanceof NewUser)){ return false; } //객체가 가지고 있는 값
	 * //전달된 객체의 number와 name 체크 //obj에는 업캐스팅된 상태의 Newuser ->다운캐스팅 필요 NewUser other
	 * = (NewUser)obj; boolean result = userNumber == other.userNumber &&
	 * userName.equals(other.userName);
	 * 
	 * return result; //return = userNumber == other.userNumber &&
	 * userName.equals(other.userName); //둘이 같음 }
	 * 
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(userName, userNumber);
	}
	
	@Override
	public boolean equals(Object obj) {
		//전달된 객체와 해당 객체가 동일하다면(자기자신)
		if (this == obj)
			return true;
		
		//전달된 객체가 null이라면(객체가 아니라면)
		if (obj == null)
			return false;
		
		//전달된 객체와 해당 객체가 동일한 타입이 아니라면(클래스가 같지 않다면)
		//instanceof와 유사
		if (getClass() != obj.getClass())
			return false;
		//전달된객체의 필드와 해당 객체의 필드값을 비교
		NewUser other = (NewUser) obj;
		return Objects.equals(userName, other.userName) && userNumber == other.userNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
