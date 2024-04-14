package Sort.Study;

import java.util.Comparator;

public class StdCompare implements Comparator<Student2> {

	@Override
	public int compare(Student2 obj1, Student2 obj2) {
		//내림차순 정렬
		return obj1.getScore() < obj2.getScore()? 1: -1;
		
	}

}
