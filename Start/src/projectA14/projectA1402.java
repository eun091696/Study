package projectA14;

public class projectA1402 {

	public static void main(String[] args) {
		Integer[] intValue = new Integer[10];
		
		for(int i = 0; i < 10; i++) {
			intValue[i] = i;
		}
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println(intValue[i]);			
			}
		}catch(ArrayIndexOutOfBoundsException e) {
		}
		
		System.out.println("실행 프로그램 다음 내용들...");
	}

}
