package ex01_object;

import java.util.Arrays;

public class ToStringTest {

	public static void main(String[] args) {
		
		User user1 = new User(1,"min");
		
		//둘이 같음(출력메소드는 전달된 객체에서 toString 메소드를 자동 호출함)
		//User 클래스는 toString을 재정의 하지않았기에 기본 메소드가 호출
		System.out.println(user1);
		System.out.println(user1.toString());
		
		int[] ar = {1,2,3};
		System.out.println(Arrays.toString(ar));
		
		NewUser newUser = new NewUser(2,"kim");
		
		//객체의 필드와 클래스를 편리하게 확인하기 위해 toString을 재정의

		
		System.out.println(newUser);
		System.out.println(newUser.toString());
		
		System.out.println(newUser.getUserName());
		System.out.println(newUser.getUserNubmer());
		
		
	}

}
