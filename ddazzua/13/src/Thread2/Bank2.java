package Thread2;

public class Bank2 {
	private int money;
	
	public int getMoney() {
		return this.money;
	}
	public synchronized void addMoney(int money) {
		this.money +=money;
	}
} //이전에는 2만원이 안채워지는 경우가 있었으나 현재는 2만원이 다채워짐
