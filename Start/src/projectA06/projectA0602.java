package projectA06;

import java.util.Scanner;

public class projectA0602 {

	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하시오: ");
		Scanner in = new Scanner(System.in);
		
		int int1 = in.nextInt();
		int int2 = in.nextInt();
		
		//입력된 두 수 사이의 합
		int sum = 0;
		for(int i = int1; i <=int2; i++) {
			sum = sum + i;
		}
		System.out.println("두 수 사이의 합: " + sum);
		
		//입력된 두 수 사이의 수를 출력
		for(int i = int1; i <= int2; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//입력된 두 수 사이의 8의 배수를 출력 하시오.
		System.out.println("8의 배수는: ");
		for(int i = int1; i <= int2; i++) {
			if(i % 8 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//입력된 두 수 사이의 짝수를 출려 하시오. 
		System.out.println("짝수는: ");
		for(int i = int1; i <= int2; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//입력된 두 수 사이의 홀수의 합은
		System.out.println("홀수의 합은:");
		sum = 0;
		for(int i = int1; i <= int2; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		//입력된 두 수 사이의 4의 배수를 출력하고 그 합을 구하여 출력하시오.
		sum = 0;
		for(int i = int1; i <= int2; i++) {
			if(i % 4 == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println();
		System.out.println("4의 배수의 합: " + sum);
	}

}





























