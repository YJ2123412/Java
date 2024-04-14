import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int score = 55;
		 * 
		 * if(score >= 60) {System.out.println("합격");} else {
		 * System.out.println("불합격");}
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("나이:");

		int age = scan.nextInt();
		if (age > 19) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년자입니다");
		}

		scan.close();

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요:  ");
		int score = scan.nextInt();
		if (score >= 90) {
			System.out.println("점수: " + score + "학점: A");
		} else if (score >= 80) {
			System.out.println("점수: " + score + "학점: B");
		} else if (score >= 70) {
			System.out.println("점수: " + score + "학점: C");
		} else {
			System.out.println("점수: " + score + "학점: F");
		}

		scan.close();

	}
}
