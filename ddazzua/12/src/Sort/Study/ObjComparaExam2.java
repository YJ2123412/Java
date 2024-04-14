package Sort.Study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjComparaExam2 {
	public static void main(String[] args) {
		
		//내림차순
		Student2 st01 = new Student2("김철수", 260);
		Student2 st02 = new Student2("김영희", 290);
		Student2 st03 = new Student2("김대리", 288);
		
		List<Student2> list = new ArrayList<>();
		list.add(st01);
		list.add(st02);
		list.add(st03);
		System.out.println("정렬전 : "+list);
		
		Collections.sort(list, new StdCompare());
		System.out.println("정렬후1 : "+list);
		

		System.out.println("정렬후2 : ");
		for(Student2 st :list) {
			System.out.println(st);
		}
	}
}
