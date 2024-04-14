package Thread2;

public class Bank {
	private int money;
	
	public int getMoney() {
		return this.money;
	}
	public synchronized void addMoney(int money) {
		this.money +=money;
	}
} //이전에는 실행횟수가 다 안채워지는 경우가 있었으나 정렬후에는 다 채워짐
