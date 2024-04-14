package studyIter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratoerTset {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set = new HashSet<>(list);
		
		//list를 iterator 이용하여 출력
		
		Iterator<Integer> intIter = list.iterator();
		while(intIter.hasNext()) {
			System.out.println(intIter.next());
		}
		
		//set를 iterator 이용하여 출력
		Iterator<Integer> setIter = set.iterator();
		while(setIter.hasNext()) {
			System.out.println(setIter.next());
		}
		
		
		
	}

}
