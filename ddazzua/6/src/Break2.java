import java.util.Scanner;

public class Break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = (int) (Math.random() * 50) + 1;
		Scanner scan = new Scanner(System.in);

		int user = 0;
		int count = 1;
		for (;;) {
			System.out.println("숫자를 입력: ");
			user = scan.nextInt();

			if (target == user) {
				System.out.println("정답! 숫자는" + user + "입니다." + count + "번 만에 맞췄습니다");
				break;
			} else if (target < user) {
				System.out.println("Down");
			} else if (target > user) {
				System.out.println("UP");
			}
			count++;
		}
		scan.close();
	}
}
