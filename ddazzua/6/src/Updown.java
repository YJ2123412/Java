import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {
	
		int target = (int)(Math.random()*50)+1;
		Scanner scan = new Scanner(System.in);
		
		int user = 0;
		int count = 0;
		
		while(target != user) {
			System.out.println("숫자를 입력: ");
			user = scan.nextInt(); //정수값 입력
			
			if(target > user) {
				System.out.println("UP");
			}else if(target < user) {
			System.out.println("DOWN");
			}else {
				System.out.println("정답 값은"+target+"입니다.");
				System.out.println(count + "번만에 맞췄습니다");
			}		
			count++;
		}
		scan.close();
		}
		
	
	}
