package day03;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//실습1
		//사용자에게 수학점수, 국어, 영어 점수를 입력받아 합계점수와 평균 점수를 출력하기
		
		Scanner scan = new Scanner(System.in);
		double avg = 0;
		
		System.out.println("수학 점수를 입력해주세요");
		int math = scan.nextInt();

		System.out.println("국어 점수를 입력해주세요");
		int kr = scan.nextInt();

		System.out.println("영어 점수를 입력해주세요");
		int eng = scan.nextInt();
		
		int sum = math+kr+eng;
		avg = sum/3;
		System.out.println("합계점수는 :"+sum+ ", 평균점수는 :"+avg);
		
		scan.close();
	      // 평균점수가 96이 나오는경우 ->총합을 담는 데이터를 int로
	      // 평균점수가 96.0이 나오는경우 -> 점수계산은 int로 하고 담는 데이터를 double로
	      // 평균점수가 정확하게 나오는 경우 -> 담는 데이터와 계산 데이터 모두 double로 하면 96.666667
	      

	}

}
