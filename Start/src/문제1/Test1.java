package 문제1;

public class Test1 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 9 - 2*(i + 1); j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
