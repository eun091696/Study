package projectA12;

abstract class Shape {
	public Shape() {
		
	}
	public void Paint() {
		draw();
	}
	abstract public void draw();
}

//abstract class ShapeC {
//	String name;
//	public void paint() {
//		System.out.println("도형을 드립니다.");
//	}
//}

abstract class Line extends Shape {
	public String toString() {
		return "Line";
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect 그립니다.");
	}
}

public class projectA1203 {

	public static void main(String[] args) {
		

	}

}
