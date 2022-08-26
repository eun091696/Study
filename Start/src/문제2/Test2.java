package 문제2;

public class Test2 {

	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1; i <= 500; i++) {
			if(i % 2 == 1) {
				sum = sum * i ;
			}
		}
		System.out.println(sum);

	}

}
