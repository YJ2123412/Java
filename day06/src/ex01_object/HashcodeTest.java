package ex01_object;

public class HashcodeTest {

	public static void main(String[] args) {

		User user1 = new User(1,"min");
		User user2 = new User(1,"min");
		
		//두 객체는 동일하지도, 동등하지도 않기에 다른 값이 나옴
		System.out.println(user1==user2);
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		
		//두 객체는 동일하지는 않지만 hashcode 재정의를 통해 동등한 객체이므로 hashcode 같다고 판단
		NewUser newUser1 = new NewUser(2, "kim");
		NewUser newUser2 = new NewUser(2, "kim");
		
		System.out.println(newUser1.hashCode());
		System.out.println(newUser2.hashCode());
		
		
	}

}
