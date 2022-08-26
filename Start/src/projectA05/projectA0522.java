package projectA05;

public class projectA0522 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.print(j + (i + 1) + " ");
			}
			System.out.println();
		}

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
			
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 1 2 3 4
		// 2 4 6 8
		// 3 6 9 12
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print((i + 1) * (j + 1) + " ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}

}






























