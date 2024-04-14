package day5;

import java.util.Iterator;

public class BranchingStatements {

	public static void main(String[] args) {
		
		//break
		
		for(int i =0; i<5; i++) {
			System.out.println(i);
			if(i == 3) {
				break;
			}
		}
		//i=3일때 가장먼저 만나는 코드가 조건문의 break이므로 출력하지 않고 반복이 종료된다.
		for(int i =0; i<5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		
		
		//continue
		
		for (int i = 0; i < 5; i++) {
			System.out.println("1: "+i);
			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("2: "+i);
			continue;
			
		}
//			continue;//컨티뉴를 만나서 실행코드는 넘어가고, 증감식으로 바로넘어감. 반복이 끝난 건 아님.
		for (int i = 0; i < 5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println("3: "+i);
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("4: "+i);
			if(i==3) {
				continue;
			}
			
		}
		
		
		
		
	}

}
