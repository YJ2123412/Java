package Inter;

public class Sam implements Phone  {

	private int batteryCapacity = 20;
	private boolean isOn = false;   //d이따 트루로 먼저바꿔놓고 해보기
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("Power On");
			isOn = true;
		}else {
			System.out.println("LowBattery on");
			isOn = false;
			
		}
		
		
	}

	@Override
	public void powerOff() {
			System.out.println("Power Off");
			isOn = false;
	}

	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchYoutube() {
		if(batteryCapacity > 10) {
			System.out.println("watching Youtube");
			batteryCapacity-=10;
			System.out.println("Battery is " +this.batteryCapacity +"%");
		} else {
			System.out.println("Low Battery");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if(this.batteryCapacity < Phone.MAX_BETTERY_CAPACITY) {
			System.out.println("Start Charging");
			//5프로 이상 차이날때는 5를 더하고, 아니면 100에서 현재 값을뺀만큼 더하기
			if(Phone.MAX_BETTERY_CAPACITY + this.batteryCapacity >= 5){
				this.batteryCapacity += 5;
			} else {
				this.batteryCapacity += (Phone.MAX_BETTERY_CAPACITY - this.batteryCapacity);
			}
		}
	}

}
