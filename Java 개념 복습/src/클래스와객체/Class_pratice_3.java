package 클래스와객체;

public class Class_pratice_3 {

	public static void main(String[] args) {
		System.out.println(Car01.wheel);
		
		Car01 myCar1 = new Car01();
		System.out.println(myCar1.speed);
		
		Car01 myCar2 = new Car01();
		System.out.println("<변경전>");
		System.out.println("myCar1.speed:" + myCar1.speed);
		System.out.println("myCar2.speed:" + myCar2.speed);
		System.out.println("myCar1.speed:" + myCar1.wheel);
		System.out.println("myCar2.speed:" + myCar2.wheel);
		
		myCar2.speed = 100;
		myCar2.wheel = 5; //클래스 변수가 변경되어 myCar1의 값도 같이 변경된다.
		
		System.out.println("<변경gn>");
		System.out.println("myCar1.speed:" + myCar1.speed);
		System.out.println("myCar2.speed:" + myCar2.speed);
		System.out.println("myCar1.speed:" + myCar1.wheel);
		System.out.println("myCar2.speed:" + myCar2.wheel);
	}

}
class Car01{
	static int wheel = 4; //static이 있으므로 클래스 변수
	int speed; //인스턴스 변수
}
