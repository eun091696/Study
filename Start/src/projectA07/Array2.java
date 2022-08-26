package projectA07;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] intArray = new int[100];
		for(int i = 0; i < intArray.length; i++) { // 배열 초기화
			intArray[i] = i + 1; // 배열의 값 1 ~ 100
		}
		System.out.println(Arrays.toString(intArray)); //배열 내용 출력
		
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			sum = sum + intArray[i];
		}
		System.out.println("합 : " + sum);

	}

}
