package day6;

import java.util.Iterator;

public class MultiArray2 {

	public static void main(String[] args) {
		//실습1
		//for문을 이용하여 아래와 같은 출력결과 만들기
		//****
		//****
		//****
		
//		char[][] arr2 = {{****}{***}};
		
		int[][] arr = new int[3][4];
		
		
		
		for (int i = arr.length; i > arr.length; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
