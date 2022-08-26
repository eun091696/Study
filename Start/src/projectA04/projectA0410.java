package projectA04;

import java.util.Scanner;

public class projectA0410 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		// if 10의 배수인지 아닌지를 비교하여 10의 배수이면 10배 배수입니다.
		// 10의 ㅐ수가 아니면 10의 배수가 아닙니다를 출력하시오.
		
		if(number % 10 == 0) {
			System.out.println("10의 배수입니다.");
		}else {
			System.out.println("10의 배수가 아닙니다.");
		}
		
	}

}
