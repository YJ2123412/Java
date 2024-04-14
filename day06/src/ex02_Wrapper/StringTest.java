package ex02_Wrapper;

public class StringTest {

	public static void main(String[] args) {

		//heap안의 같은 pool에서 사용하여 스택으로 보냄
		String str1="a";
		String str2="a";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("a");
		//new를 쓰면 매번 새로운 객체가 생김->용량 불필요 차지
		
		//동일성(주소값)을 비교하면 == 연산자의 결과는 false
		System.out.println(str1==str3);
		//동등성(값)을 비교하는 equals()메소드의 결과는 true
		System.out.println(str1.equals(str3));
		
		
		//StringBuffer,StringBuilder 클래스 - 수정 가능.. pool안에 안들어감, heap
		//가변 문자열 클래스 ->문자열 객체가 가지고 있는 값을 변경할 수 있음
		System.out.println("a"+"b");  //새로운 문자열 생성 -> 메모리에 비효율
		
		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		sb1.append("b");
		System.out.println(sb1.hashCode());
		
		
		
		
		
		
		
		
	}

}
