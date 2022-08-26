package 문제1;

public class Test2 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 9; i++) {
			if(i < 5) {
				count++;
			}else {
				count--;
			}for(int j = 0; j < 5 - count; j++) {
				System.out.print(" ");
			}for(int k = 0; k < 2 * count - 1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
