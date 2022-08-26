package projectA15;

import java.util.Vector;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y +")";
	}
}

public class projectA1503 {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30,8));
		
		for(Point p : v) {
			System.out.println(p);
		}
		System.out.println();
		v.remove(1); // 첫번째 인덱션 삭제
		
		for(Point p : v) {
			System.out.println(p);
		}
		System.out.println();
		
		for(int i = 0; i < v.size(); i++) {
			Point p = v.get(i); //get 또는 elementAt 사용가능, elementAt의 처리속도가 빠르지만 일반적으로 get을 많이 사용함
			System.out.println(p);
		}
	}

}
