package method;

public class SumEx {

	public static void main(String[] args) {
	//메소드의 오버로딩
		sum(10, 20);
		sum(10.2, 11.2);
		sum(10, 20, 30);
	}
	static void sum(int x, int y) {
		System.out.println(x + y);
	}
	static void sum(double x, double y) {
		System.out.println(x + y);
	}
	static void sum(int x, int y, int z) {
		System.out.println(x + y + z);
	}

}
