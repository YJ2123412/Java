package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 실습3
		// 사용자에게 양의 정수 3개를 입력받기(1개씩 입력받는다) ->누적입력 3번씩 종료
		// 음수 입력시 음의정수를 입력하였습니다. 출력하고 다시 입력받기
		// 누적된 양의 정수 개수가 3개가 아니라면 다시 입력받기
		// 누적된 양의 정수를 출력한 뒤 프로그램 종료 출력하기

		Scanner scan = new Scanner(System.in);

		int user = 0;
		int[] user2 = new int[3];
		int count = 0;

		while (count < 3) {
			System.out.println("정수를 입력하세요");
			user = scan.nextInt();
			if (user > 0) {
				user2[count] = user;
				count++;
			} else if (user < 0) {
				System.out.println("음수를 입력하셨습니다");
			}
		}
		System.out.println("입력한 수는 " + Arrays.toString(user2) + "입니다. 프로그램이 종료되었습니다");

	}

}
