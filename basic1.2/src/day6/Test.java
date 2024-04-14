package day6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//실습1
		//아이디 중복체크
		//만약 중복된다면 중복 아이디라고 출력
		//기존아이디와 중복되지 않는다면 사용가능한 아이디라고 출력
		
		Scanner scan = new Scanner(System.in);
		
		String[] idList = {"kim1234","hong1234","seo1234"};
		
		/*
		 * //비교해야해 for(String i = null; i <3; i++) { System.out.println("id를 입력하세요");
		 * String user = scan.next(); if(idList[i] == user) {
		 * System.out.println("중복된 아이디 입니다"); } else {
		 * System.out.println("사용가능한 아이디입니다."); break; }
		 * 
		 * 
		 * }
		 
		 for(String id: idList) { System.out.println("id를 입력하세요"); String user =
		 scan.next(); if(id == user) { System.out.println("중복된 아이디 입니다"); } else {
		 System.out.println("사용가능한 아이디입니다."); break; }
		 
		  }
		 */
		
		System.out.println("id를 입력하세요");
		String user = scan.nextLine();
		if(user.equals(idList[0])) {
			System.out.println("중복된 아이디입니다.");
		} else if(user.equals(idList[1])) {
			System.out.println("중복된 아이디입니다.");
		} else if(user.equals(idList[2])) {
			System.out.println("중복된 아이디입니다.");
		} else {
			System.out.println("사용가능한 아이디입니다");
		}
				
				//-------------------------------------------강사님
		//증복여부를 저장할 변수
		boolean isDupulicated = false;
		
		String id = null;
		for(String userId: idList) {
			if(userId.equals(user)) {
				isDupulicated = true;
				break;
			} 
			
		if(isDupulicated){
			System.out.println("중복된 아이디입니다.");
		} else {
			System.out.println("사용가능한 아이디입니다.");
		}
		String result = null;
		result = isDupulicated ? "중복된 아이디" : "사용가능한 아이디";
		System.out.println(result);
			
		}
		
	}

}
