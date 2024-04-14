package Exam;

import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		//ArrayList<Integer> list01 = new ArrayList<>();
			
		//컬렉션 프레임워크
		List<Integer> list = new ArrayList<>(); //List라고 시작하면 제일 범위가 크기에 뒤에만(Array..) 갈아끼워서 쓸 수 있음
		
		//추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//중간삽입 - >기존 데이터는 옆으로 밀려남, 크기가 늘어남
		list.add(5, 10); //쟤네는 4칸이고 , 추가는 5이기에 맨끝에 추가됨
		list.add(1, 20);
		
		//치환
		list.set(0, 5);
		list.set(4, 13);
		
		System.out.println(list);
		
		//삭제 - 공간도 지워짐.. 하나씩 당겨짐
		list.remove(4);
		list.remove(3);
		
		System.out.println(list);
		
		//출력
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		} System.out.println("\n==========================");
		for(int val : list) {
			System.out.print(val+"\t");
		}System.out.println("\n==========================");
		
		//iterator ->배열을 순환하는 커서의 이름
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {              //iter가 있는지 확인 후, 값을 내보냄
			System.out.print(iter.next()+"\t");
		}
		
		
		
	}

}
