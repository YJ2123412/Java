package Sort.Study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjComparaExam01 {

	public static void main(String[] args) {
		
		Student1 st01 = new Student1("김철수", 260);
		Student1 st02 = new Student1("김영희", 290);
		Student1 st03 = new Student1("김대리", 288);
		
		List<Student1> list = new ArrayList<>();
		list.add(st01);
		list.add(st02);
		list.add(st03);
		System.out.println("정렬전 : "+list);
		
		Collections.sort(list);
		System.out.println("정렬후1 : "+list);
		

		System.out.println("정렬후2 : ");
		for(Student1 st :list) {
			System.out.println(st);
		}
		
		
		
	}

}
