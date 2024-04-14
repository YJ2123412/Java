package day6;

public class ForEach {

	public static void main(String[] args) {
		//for-each
		String[] ar = {"홍길동","나훈아","김철수","나훈아"};
		
		//꺼낼 변수를 저장할 변수가 필요
		for(String name: ar) {
			System.out.println(name);
		}
		
		
		
	}

}
