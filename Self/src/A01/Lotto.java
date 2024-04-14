package A01;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//로또 번호
		int[] num = new int[6]; 
		//사용자번호
		int[] user = new int[6];
		
		//로또 맞춘 횟수
		int count= 0;
		
		//랜덤으로 50개의 공 중에서 골라야해. num안에 50 중 5개의 숫자가 랜덤으로 들어가게끔
			for(int i = 0; i<num.length; i++) {
				num[i] = (int)(Math.random()*50+1);
			}
			
			//유저에게 번호 입력받기
			for(int i=0; i<user.length; i++) {
			System.out.println(i+1+"번째 숫자를 입력하세요");
			user[i] = scan.nextInt();
			if(0>user[i] || user[i]>=50) {
				System.out.println("1부터 50까지의 숫자를 입력하세요");
				 i--;
			}
			}
			
			for(int i = 0; i<6; i++) {
				for(int j=0; j<=i; j++) {
					if(num[i] == user [j]) {
						count++;
					}
				}
			}
			
			
			
		
		System.out.println("로또 번호는: "+Arrays.toString(num));
		System.out.println("사용자가 입력한 번호는: "+Arrays.toString(user)+"으로 맞춘 번호의 갯수는 "+count+"입니다"+"\n"+"결과는: ");
		//등수출력
				if(count == 6) {
					System.out.println("1등!");
				}else if(count ==5 ) {
					System.out.println("2등!");
				}else if(count ==5) {
					System.out.println("3등!");
				}else if(count ==4) {
					System.out.println("4등!");
				}else if(count ==3) {
					System.out.println("5등!");
				}
				else {System.out.println("낙첨입니다..");
				}
		
	}
}
