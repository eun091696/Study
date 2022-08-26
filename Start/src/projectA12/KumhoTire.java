package projectA12;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//인스턴스 멤버 메소드
	@Override
	public boolean roll() {
		++accumalatedRoation;
		if(accumalatedRoation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumalatedRoation));
			return true;
		}else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
