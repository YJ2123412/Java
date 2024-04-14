package ex01_object;

import java.util.Scanner;

public class EqualsTest {

	public static void main(String[] args) {
		System.out.println(1 == 1);
		System.out.println("ab".equals("ab"));
		
		User user1 = new User(1,"min");
		User user2 = new User(1,"min");
		
		
		//동일성(identity) == : 객체의 주소값을 비교 
		//동등성(equality) equals: 객체의 주소값은 다르지만 가지고 있는 정보의 동등성 비교
		
		
		System.out.println(user1==user2);
		System.out.println(user1.equals(user2));
		
		NewUser newUser1 = new NewUser(2,"kim");
		NewUser newUser2 = new NewUser(2,"kim");
		
		//동일성
		System.out.println(newUser1 == newUser2);
		//동등성
		//두 객체가 NewUSer타입이고, 가지고 있는 피드값이 같다면 동등한 객체이다
		System.out.println(newUser1.equals(newUser2));
		
		
		
		
		
		
	}

}
