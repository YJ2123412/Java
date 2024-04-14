package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// 실습3
		// 사용자에게 양의 정수 3개를 입력받기(1개씩 입력받는다) ->누적입력 3번씩 종료
		// 음수 입력시 음의정수를 입력하였습니다. 출력하고 다시 입력받기
		// 누적된 양의 정수 개수가 3개가 아니라면 다시 입력받기
		// 누적된 양의 정수를 출력한 뒤 프로그램 종료 출력하기
		
		Scanner scan = new Scanner(System.in);
		//사용자에게 입력받은 정수를 저장할 변수
		int num = 0;
		//입력한 양의 정수를 저장할 배열
		int[] ar = new int[3];
		//배열의 인덱스 번호를 저장할 변수
		int idx = 0;
		
		while(idx < 3) {
			System.out.println("정수를 입력하세요");
			num = scan.nextInt();
			
			//양의 정수를 입력했다면
			if(num > 0) {
				//배열의 빈칸에다가 입력한 양의 정수를 저장한다.
				ar[idx] = num;
				//다음 칸에 정수를 저장하기 위해 인덱스 번호를 증가시킨다.
				idx++;
			} else {
				System.out.println("음의 정수를 입력하였습니다.");
			}
		}
		System.out.println("프로그램 종료");
		//출력1
		for(int i = 0; i< ar.length; i++) {
			System.out.println(ar[i]);
		}
		//출력2
		System.out.println(Arrays.toString(ar));
	}
}
