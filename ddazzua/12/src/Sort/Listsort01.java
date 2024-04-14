package Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listsort01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//랜덤클래스선언
		Random rand = new Random();
		
		for( int i =0; i <10; i++) {
			//rand. nextInt(값) 0<= x< 값  +1.. +1해야 원하는 값까지 나옴.  -> 1 <= x <= 50
		 list.add(rand.nextInt(30)+1);
		}
		System.out.println("정렬 전: "+ list);
		
		//버블정렬
		int temp =0;
		
		for(int i =(list.size()-1); i>0; i--) { //i--인 이유는 마지막 칸을 없애가면서 진행해가기에..
			for(int j=0; j< i; j++) {
				if(list.get(j) > list. get(j+1)) { //오름차순: > , 내림차순: <   / list.get(index) / list.set(index, value)
					temp = list.get(j+1);
					list.set(j+1,list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("정렬 후 : "+ list);
	}
}
