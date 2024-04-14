package exam;

import java.util.Scanner;

public class StdService {
	private Student[] stdArray;
	 
	//생성자를 통한 초기화
	public StdService() {
		this.stdArray = new Student[3];
	}
	//학생 생성 메서드
	public void createStudent() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==학생을 생성합니다==");
		for(int i=0; i< stdArray.length; i++) {
			System.out.println((i+1)+"번째 학생 이름: ");
			String myName = scan.next();
			System.out.println((i+1)+"번째 학생 국어 점수: ");
			int kor = scan.nextInt();
			System.out.println((i+1)+"번째 학생 영어 점수: ");
			int eng = scan.nextInt();
			System.out.println((i+1)+"번째 학생 수학 점수: ");
			int math = scan.nextInt();

			Student st = new Student(myName, kor, eng, math);
			stdArray[i] = st;
			
		}
		System.out.println("학생들을 생성 완료했습니다");
		scan.close();
		
	}
	public void printStudent() {
		Student temp = null;
		for(int i = stdArray.length; i< 0; i--) {
			for(int j=0; j<i-1; j++) { //i-1인 이유는 버블정렬에서 마지막 비교값은 인덱스의마지막-1자리이기에
				if(stdArray[j].getTotal() <stdArray[j+1].getTotal()) {
					temp = stdArray[j+1];
					stdArray[j+1] = stdArray[j];
					stdArray[j] = temp;
				}
			}
		}
		for(int i=0; i<stdArray.length; i++) {
			Student st = stdArray[i];
			System.out.println("이름:" + st.getMyName()+",");
			System.out.print("국어:" + st.getKor()+", ");
			System.out.print("영어:" + st.getEng()+", ");
			System.out.print("수학:" + st.getMath()+", ");
			System.out.println("총점:" + st.getTotal()+", ");
			System.out.println("평균:" + st.getAvg()+"\n");
		}
	}
}
