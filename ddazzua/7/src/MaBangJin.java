import java.util.Arrays;
import java.util.Scanner;

public class MaBangJin {

	public static void main(String[] args) {
		
		int[][] std = new int [3][3];
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i <std.length; i++) {
//			for(j =0; j <std[i].length; j++) {
//			}
			System.out.println((i+1)+" 번째 학생의 국어점수!: ");
			std[i][0] = scan.nextInt();
			System.out.println((i+1)+" 번째 학생의 수학점수!: ");
			std[i][1] = scan.nextInt();
			System.out.println((i+1)+" 번째 학생의 영어점수!: ");
			std[i][2] = scan.nextInt();
		}
		for(int i =0; i <std.length; i++) {
			System.out.println((i+1) + "번째 학생: "+Arrays.toString(std[i]));
		}
		scan.close();
		
		//1등 뽑기
		int maxIndex =0;
		int sum = 0;
		int maxSum = 0;
		
		for(int i= 0; i <std.length; i++) {
			sum = 0;
			for(int j=0; j<std[i].length; j++) {
				sum += std[i][j];  //합산
		}
			
			if(maxSum < sum) {
				maxSum = sum;
				maxIndex = i;
			}
		}
		System.out.println("성적 최우수자: "+ (maxIndex+1)+"번째 학생"+Arrays.toString(std[maxIndex])+"총점" + maxSum);
		
		
		
	}
}
