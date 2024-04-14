package ThreadState;


public class Storage {
	private int stackCount = 10;
	
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		
		if(this.stackCount >=10){
			System.out.println("나르세요");
			notify(); //깨우기
		}
	}
	
	public synchronized void popStack(int leaveCount) throws InterruptedException {
		if(leaveCount > this.stackCount ) {
			this.stackCount = 0;
		}else {
			this.stackCount -= leaveCount;
		}
		if(this.stackCount ==0) {
			System.out.println("짐이 없음, 대기"); 
			wait();
		}
	}
	public int getStackCount() {
		return this.stackCount;
	}
}
