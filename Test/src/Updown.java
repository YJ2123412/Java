import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int user = 0;
		int count = 0;
		int target = (int)(Math.random()*10)+1;
		
		while(user != target) {
			System.out.println("숫자를 입력해주세요: ");
			user = scan.nextInt();
			
			if(user < target) {
				System.out.println("UP!");
			}else if(user > target) {
				System.out.println("down");
			}else {
				System.out.println("정답! 답은 "+target+"입니다");
				System.out.println(count+"만에 맞췄습니다.");
			}count++;
		}
		scan.close();
	}

}
