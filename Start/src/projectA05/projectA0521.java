package projectA05;

public class projectA0521 {

	public static void main(String[] args) {
		// 
		int sum = 0;
		
		//1~100까지 홀수의 합 %x
		
		for(int i = 1; i <= 100; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		//0~100까지 짝수의 합 %x
		for(int i = 0; i <= 100; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
