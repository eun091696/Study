package 문제1;

public class Test4 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9 - (2 * i + 1); j++) {
				System.out.print(" ");
			}for(int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2 * (i + 1); j++) {
				System.out.print(" ");
			}for(int k = 0; k < 9 - 2 * (i + 1); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
