package day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 실습1
		// 아이디 중복체크
		// 만약 중복된다면 중복 아이디라고 출력
		// 기존아이디와 중복되지 않는다면 사용가능한 아이디라고 출력

		Scanner scan = new Scanner(System.in);

		String[] idList = { "kim1234", "hong1234", "seo1234" };

		// 비교해야해 for(String i = null; i <3; i++) { System.out.println("id를 입력하세요");

		System.out.println("id를 입력하세요");
		String user = scan.next();

		for (String id : idList) {
			if (id.equals(user)) {
				System.out.println("중복된 아이디 입니다");
			} else {
				System.out.println("사용가능한 아이디입니다.");
			} break;

		}
	}

}
