package study.code.set;

import java.util.HashSet;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {
		//선언
		Set<Integer> set = new HashSet<>();
		
		//추가
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		//삭제
		set.remove(3);
		System.out.println(set);
		
		
		System.out.println("set의 크기: "+ set.size());
		System.out.println("set에 3이 포함되는지: "+ set.contains(3));
		
		
		
		
		

		
	}

}
