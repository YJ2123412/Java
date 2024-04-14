import java.util.ArrayList;
import java.util.List;

public class New {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.get
		
		
		int temp =0;
		
		for(int i =(list.size()-1); i>0; i--) { //i--인 이유는 마지막 칸을 없애가면서 진행해가기에..
			for(int j=0; j< i; j++) {
				if(list.get(j) > list. get(j+1)) {
					temp = list.get(j+1);
					list.set(j+1,list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("정렬 후 : "+ list);
	}

}
