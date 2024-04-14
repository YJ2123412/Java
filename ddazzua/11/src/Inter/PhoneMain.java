package Inter;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone = new ApplePhone();
		Phone phone2 = new Sam();
		
		
		phone.powerOn();
		phone.watchYoutube();
		phone.charge();
		phone.charge();
		phone.watchYoutube();
		phone.watchYoutube();
		phone.watchYoutube();
		phone.watchYoutube();
		
		phone2.isOn();
		phone2.watchYoutube();
		

	}
}
