package projectA12;

public class HankookTire extends Tire {
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumalatedRoation;
		if(accumalatedRoation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumalatedRoation));
			return true;
		}else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
}
