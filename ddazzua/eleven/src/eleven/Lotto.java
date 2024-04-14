package eleven;

import java.util.Scanner;import org.w3c.dom.UserDataHandler;

public class Lotto {
	public static void main(String[] args) {
		
		int[] lottoMachine = new int[45];
		int[] lottoBalls = new int [6];
		int bonusNumber = 0;
		
		for(int i= 0; i <lottoMachine.length; i++) {
			lottoMachine[i] = i+1;
		}
		int count = 0;
		
		//count가 7인 이유는, 실제로는 0~6까지를 돌기때문에 c<7을 해도 7번임..
		while(count < 7) {
			int index = (int)(Math.random()*45);
			//+1을 안하는 이유는, 0~44이기에 민 값을 0으로 두기 위해서 ?????
			//선택된 index의 값이 0이 아니면 아직 미사용, 0이면 사용된 위치
			if (lottoMachine[index] !=0) {
				if(count<6) {
					lottoBalls[count++] = lottoMachine[index];
				} else {
					bonusNumber = lottoMachine[index];
					count++;
				}
				lottoMachine[index] = 0;
			}
		}
		for(int i= 0; i <lottoBalls.length; i++ ) {
			System.out.print(lottoBalls[i] +" ");
		}
		System.out.println("보너스 번호"+ bonusNumber);
		
		//사용자선택
		count= 0;
		Scanner scan = new Scanner (System.in);
		//사용자 로또 저장 배열
		int[] userLotto = new int [6];
		
		while(count<6) {
			System.out.println((count+1)+" 번째 로또 번호: ");
			int balls = scan.nextInt();
			//중복체크
			for(int i = 0; i<count; i++) {
				if(userLotto[i] == balls) {
					System.out.println(balls + "는 이미 존재하는 번호");
					balls = 0; //중복되었다는 의미
					break;
				}
			}
			//0은 중복의미
			if(balls !=0) {
				userLotto[count++] = balls;
			}
		}
		scan.close();
		
		System.out.println("사용자 로또: ");
		for(int i= 0; i <lottoBalls.length; i++ ) {
			System.out.print(userLotto[i] +" ");
		}
		System.out.println();
		int matchcount = 0;
		boolean isBonus = false;
		//비교
		for(int i = 0; i < userLotto.length; i++) {
			for(int j =0; j < lottoBalls.length; j++) {
				if(userLotto[i] == lottoBalls[j]) {
					matchcount++;
					break;
				}
			}
			//보너스 번호 찾기
			if(isBonus == false){
				if(userLotto[i] == bonusNumber) {
					isBonus = true;		}
			}
		}
		//등수출력
		if(matchcount == 6) {
			System.out.println("1등!");
		}else if(matchcount ==5 && isBonus) {
			System.out.println("2등!");
		}else if(matchcount ==5) {
			System.out.println("3등!");
		}else if(matchcount ==4) {
			System.out.println("4등!");
		}else if(matchcount ==3) {
			System.out.println("5등!");
		}
		else {System.out.println("낙첨입니다..");
		}
	}
}
