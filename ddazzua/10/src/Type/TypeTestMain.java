package Type;

public class TypeTestMain {
	public static void main(String[] args) {
		Bus b= new Bus("버스");
		Taxi t1 = new Taxi("개인택시");
		
		Car car = t1;
		
		b.getInfo();
		t1.getInfo();
		
		//강제형변환
		Taxi t2 = (Taxi)car;
		t2.getInfo();
	}
}
