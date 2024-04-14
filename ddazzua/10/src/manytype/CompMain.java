package manytype;

public class CompMain {

	public static void main(String[] args) {

		ComputerRoom room = new ComputerRoom();
		
		room.setCom1(new Lg());
		room.setCom2(new SamSong());

		room.allPowerOn();
		room.allPowerOff();
	}

}
