package 문제2;

public class Test1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 300; i++) {
			if(i % 2 != 0) {
				sum = sum + (i + 1);
			}
		}
		System.out.println(sum);
		
		
		
	}

}
