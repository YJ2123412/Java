package st;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.introduce();
		
		//익명클래스
		
		Person p2 = new Person() {
			@Override
			public void introduce() {
				System.out.println("나는 생각하는 사람");
				
			}
		};
		
		p2.introduce();
		
	}

}
