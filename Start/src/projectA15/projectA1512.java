package projectA15;

class Point9 {
	private int x, y;
	public Point9() {
		this.x = 0;
		this.y = 0;
	}
	public Point9(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint9() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint9 extends Point9{
	private String color;
	public ColorPoint9(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint9() {
		System.out.print(color);
		showPoint9();
	}
}
public class projectA1512 {

	public static void main(String[] args) {
		ColorPoint9 cp = new ColorPoint9(5, 6, "blue");
		cp.showColorPoint9();

	}

}
