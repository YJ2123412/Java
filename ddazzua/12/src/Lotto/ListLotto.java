package Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListLotto {

	public static void main(String[] args) {
		//45개의 공을 담을 리스트
		List<Integer> balls = new ArrayList<>();
		//로또 저장 리스트
		List<Integer> lotto = new ArrayList<>();
		
		//보너스 번호 저장
		int bonusNumber = 0;
		
		//45개 공 생성
		for(int i = 0; i<45; i++) {
			balls.add(i+1);
		}
		//컬렉션 프레임워크를 도와주는 클래스. Arrays와 동일 역할
		Collections.shuffle(balls);
		
		//공을 추첨
		int count = 0;
		while(count <7) {
			Collections.shuffle(balls);
			if(count <6) {
				lotto.add(balls.get(0));
				//중복제거
				balls.remove(0);
			} else {
				bonusNumber = balls.get(0);
			}count++;
		}
		System.out.println("로또: " + lotto+", 보너스번호: "+bonusNumber);
		
		//사용자
		count = 0;
		Scanner scan = new Scanner(System.in);
		List<Integer> myLotto = new ArrayList<>();
		//로또 선택
		while(count < 6) {
			try{
				System.out.println((count+1)+" 번째 로또: ");
			int ball = scan.nextInt();
			//공의 범위 체크
			if( ball< 1 || ball> 45) {
				System.out.println("입력범위는 1에서 45사이여야 합니다");
				//임의의 오류 던지기
				throw new InputMismatchException("키입력은 1에서 45사이여야 합니다");
			}
			//해당 값이 리스트에 존재하는지 확인
			if(myLotto.contains(ball)) {
				System.out.println(ball+" 이 번호는 이미 선택하셨습니다.");
				continue;
			}
			
			myLotto.add(ball);
			count++;
			}catch (InputMismatchException e) {
				//키입력 버퍼에 찌꺼기 제거 - flush -> autoflush
				scan.nextLine();
				System.out.println(e.getMessage() == null ? "키입력이 잘못되었습니다.": e.getMessage());
			}
		}
		scan.close();
		
		//비교를 위한 객체
		List<Integer> matchNumbers = new ArrayList<>();
		int matchCount = 0;
		boolean isBonus = false;
		
		for(int myBall : myLotto) {
			//내가 선택한 번호가 로또 번호중에 있다면
			if(lotto.contains(myBall)) {
				//저장
				matchNumbers.add(myBall);
			}
			//보너스 번호를 못찾았을때만 비교
			if(isBonus) {
				//일치시
				if(myBall == bonusNumber) {
					isBonus = true;
				}
			}
		}
		matchCount = matchNumbers.size();
	
		System.out.println("맞은 번호: " +matchNumbers);
		System.out.println(matchCount == 5 && isBonus ? ", 보너스 번호: "+bonusNumber: "");
		
		if(matchCount == 6) {
			System.out.println("로또 1등!");
		} else if(matchCount == 5 && isBonus) {
			System.out.println("로또 2등!");
		} else if(matchCount == 5) {
			System.out.println("로또 3등!");
		}	else if(matchCount == 4) {
			System.out.println("로또 4등!");
		} else if(matchCount == 3) {
			System.out.println("로또 4등!");
		} else {
			System.out.println("아쉽네요!");
		}
	}
}
