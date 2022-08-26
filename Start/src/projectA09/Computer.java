package projectA09;

public class Computer {
	
	int sum1(int[] value) {
		int sum = 0;
		for(int i = 0; i < value.length; i++) {
			sum = sum + value[i];
		}
		return sum;
	}
	
	int sum2(int ... value) {
		int sum = 0;
		for(int i = 0; i < value.length; i++) {
			sum = sum + value[i];
		}
//		for(int i : value) {
//			sum = sum + i;
//		
//		}
		return sum;
	}
}
