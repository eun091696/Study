package 문제2;

public class Test5 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 16; i ++) {
			if(i < 8) {
				count++;
			}else {
				count--;
			}for(int j = 0; j < count + 1; j++) {
				System.out.print(j + 1);
			}for(int k = 0; k < count ; k++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
