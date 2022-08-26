package projectA06;

public class projectA0614 {

	public static void main(String[] args) {
		int i = 0;
		
		do {
			System.out.print(i + "A");
			int j = 100;
			do {
				System.out.print(j + "B");
				j++;
			}while(j <= 200);
			
			i++;
		}while(i <= 100);
	}

}
