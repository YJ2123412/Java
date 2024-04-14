package Thread;

public class ThreadMain {

	public static void main(String[] args) {

		
		MyThread th = new MyThread();
		//스레드 시작
		th.setName("더하기 스레드");
		th.start();
		System.out.println(th.isAlive());
		//start와 alive는 동시에 작동..
		
	}

}
