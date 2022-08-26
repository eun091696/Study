package projectA11S01;

public class projectA1106 {

	public static void main(String[] args) {
		Airplane airPlane = new Airplane();
		
		airPlane.takeOff();
		airPlane.fly();
		airPlane.land();
		System.out.println();
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.takeOff();
		sa.fly();
		sa.land();
		
		System.out.println();
		
		sa.flyMode = SupersonicAirplane.NORNAL;
		sa.takeOff();
		sa.fly();
		sa.land();
		
	}

}
