package eleven;

import java.util.Arrays;
import java.util.Comparator;

public class UP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] arr = {1,3,5,7,89};
		
		System.out.println("정렬 전 : "+ Arrays.toString(arr));
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		System.out.println("정렬 후 : "+Arrays.toString(arr));
		
		
		
	}

}
