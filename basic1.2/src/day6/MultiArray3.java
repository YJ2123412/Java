package day6;

import java.util.Iterator;

public class MultiArray3 {

	public static void main(String[] args) {
		//실습2
		//int[][] arr = {{1,2},{3,4}};를
		//1 2
		//3 4로 바꾸기
		
		int[][] arr = {{1,2},{3,4}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j= 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"   ");
			}System.out.println();
		} 
		
		
	}

}
