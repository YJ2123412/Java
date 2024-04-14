package day5;

public class ArrayTest {

	public static void main(String[] args) {
		
		//1. 자료형[] 배열명 = new 자료형[칸수];
		int[] ar = new int[3];
		
		//2. new 자료형 = {값1, 값2, 값3};
		int[] ar2 = {10,20,30};
		System.out.println(ar2[2]);
		
		
		//3. null 
		int[] ar3 = null;
		 
		//ar3 = new int[2];
		ar3= new int[] {50,20};
		System.out.println(ar3[0]);
		
		
		//배열명[인덱스번호] //java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3 -> 오류코드
		//System.out.println(ar2[100]);
		
		//배열의 길이
		System.out.println(ar.length);
		System.out.println(ar2.length);
		System.out.println(ar3.length);
		
		for (int i = 0; i < ar3.length; i++) {
			System.out.println(ar3[i]);
		}
		
		
	}

}
