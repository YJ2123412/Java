package day5;

import java.util.Iterator;

public class BranchingStatements2 {

	public static void main(String[] args) {
		
		//주어진 문자열에서 ! 를 찾고, 몇번째에 있는지 출력하기
		String msg = "abcd!ef";
		
		//문자열의 길이: 문자열.length()
		
		
		for(int i = 0; i<msg.length(); i++) {
			if(msg.charAt(i)=='!'){
				System.out.println("!의 자리는 "+i+"입니다.");
				break;
			} 
		}
		String[] str = new String [5];
		str[0] = "1";
		str[1] = "1";
		str[2] = "1";
		str[3] = "1";
		str[4] = "1";
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
		}
		
		
		
	}

}
