package day04;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// 실습5
		// 0부터 사용자가 입력한 정수까지 이어붙여서 출력하기
		// 만약 정수가 홀수인 경우에는 숫자뒤에 ! 를 붙여서 출력한다
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int user = scan.nextInt();

		for (int i = 0; i <= user; i++) {
			if (i % 2 == 1) {
				System.out.print(i + "!");
			}

			else {
				System.out.print(i);
			}
		}

	}
}//else로 잡아야할지를 잘 고민해야함
