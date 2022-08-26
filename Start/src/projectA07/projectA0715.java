package projectA07;

import java.util.Scanner;

public class projectA0715 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		//입력 받는 부분
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("정수를 입력하세요: ");
			intArray[i] = Integer.parseInt(in.nextLine());
		}
		//더하기 > 배열의 합을 구함
		for(int i = 0; i < intArray.length; i++) {
			sum = sum + intArray[i]; //합
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + (sum / intArray.length));
	}

}
