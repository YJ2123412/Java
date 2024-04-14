package day6;

public class MultiArray {

	public static void main(String[] args) {
		int[] ar = {10,20,30};
		
		int[][] arr = {{1,2},{3,4}};
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		/*1. i = 0;
		*2. i <arr.length;
		*3. int j = 0;
		*4. j < arr[i].length
		*5. sysout
		*6. j++
		*7. j < arr[i].length
		*8. sysout
		*9. i++
		*/
		
		for(int i = 0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		
		//별찍기, 정사각형 찍기 문제 
	}

}
