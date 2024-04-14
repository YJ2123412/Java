package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Listsort2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//랜덤클래스선언
		Random rand = new Random();
		
		for( int i =0; i <10; i++) {
			//rand.nextInt(값) 0<= x< 값  +1.. +1해야 원하는 값까지 나옴.  -> 1 <= x <= 50
		 list.add(rand.nextInt(30)+1);
		}
		System.out.println("정렬 전: "+ list);
		
		//collection 이용 정리
		Collections.sort(list);
		System.out.println("오름차순 정렬 후 : "+ list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("내림차순 정렬 후 : "+ list);
		
		
		
	}
}
