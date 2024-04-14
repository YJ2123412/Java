package day6;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {

	public static void main(String[] args) {
	
		int[] ar = {40,10,30,20};
		//하나의 문자열로 가져와서 보여줄 뿐, ar에 새로 저장할 수 없음
		System.out.println(Arrays.toString(ar));
		
		//오름차순
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		//내림차순(Integer 타입으로만 사용가능)
		Integer[] ar2 = {40,10,30,20};
		Arrays.sort(ar2,Comparator.reverseOrder());
		System.out.println(Arrays.toString(ar2));
		
		//얕은복사 ->주소 값을 복사 (값이 아니라)
		int num1= 50;
		int num2 = num1;
		System.out.println(num2);
		
		int[] ar3 = {10,20,30};
		int[] ar4 = ar3;
		System.out.println(ar3);
		System.out.println(ar4);
		
		//ar3의 0번째 값을 변경한다 ->ar4[0]도 같이 변경 - 같은 주소값으로 찾아가기에
		ar3[0] = 100;
		System.out.println(Arrays.toString(ar4));
		
		
		
		//깊은복사 - 새로운 배열을 만듬(값만 복사) - 주소값이 다름
		int[] ar5 = {20,30};
		int[] newAr = Arrays.copyOf(ar5, 1);
		
		
		System.out.println(Arrays.toString(ar5));
		System.out.println(Arrays.toString(newAr));
		
		
		
		
		
		
		
		
		
		
	}

}
