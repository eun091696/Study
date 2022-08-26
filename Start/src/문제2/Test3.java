package 문제2;

public class Test3 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				sum1 = sum1 + i;
			}if(i % 2 !=0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println((long)sum1 * sum2);
 
	}

}
