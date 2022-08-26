package projectA02;

public class projectA0203 {

	public static void main(String[] args) {
		int sum = 10 + 20;
		int value = 10;
		
		int value1 = sum + value;
		System.out.println(value1);
		
		long sum1 = (10L + 10L + 10L + 10L + 10L + 10L + 10L + 10L + 2147483647L);
		long sum2 = (10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 2147483647);
		long sum3 = (10L + 10L + 10L + 10 + 10 + 10 + 10 + 10 + 2147483647);
		long sum4 = (2147483647 + 10L + 10L + 10L + 10 + 10 + 10 + 10 + 10);
		
		int sum5 = (10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 2147483647);
	
		System.out.println(sum1);
		System.out.println(sum2); // 오버플로우에 의해 값이 -가 됨.
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5); // 오버플로우에 의해 값이 -가 됨.
	}

}
