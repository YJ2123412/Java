
public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 34000;
		int count = 0;
		
		while(true) {
			if(money<1500) {
				System.out.println("버스를"+count+"번만큼 탔음");
				System.out.println("버스카드: "+money+"남음. 버스카드 충전 요망");
				return;
			}
			money -= 1500;
			count++;
		}

	}

}
