package Thread2;

public class AddBank2 implements Runnable{
		
	private Bank2 b;
	private String worker;
	
	public AddBank2(String worker, Bank2 b) {
		this.worker = worker;
		this.b = b;
	}

	@Override
	public void run() {
		synchronized (b) {//순서대로 진행되게끔....
			
		
		
		for( int i= 0; i <10; i++) {
			b.addMoney(1000);
			System.out.println(this.worker+", 현재 잔고: ,"+b.getMoney());
		}
	}
	}
	
	
	
}
