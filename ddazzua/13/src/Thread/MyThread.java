package Thread;

public class MyThread extends Thread {
	//스레드가 시작하면 자동으로 run이 실행됨
	@Override
	public void run() {
		int sum = 0;
		for(int i =1; i<=100; i++){
			sum = sum+i;
		}
		
		System.out.println("합: "+ sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드: "+ threadName);
				
	}
}
