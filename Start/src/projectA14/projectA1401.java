package projectA14;

import java.util.Scanner;

public class projectA1401 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dividend; //나뉨수
		int divisor; // 나눗수
		
		while(true) {
			
		System.out.println("나뉨수를 입력하시오: ");
		dividend = in.nextInt();
		System.out.println("나눗수를 입력하시오: ");
		divisor = in.nextInt(); //0이되면 프로그램 강제종료
		try {
			System.out.println("결과 " + dividend / divisor);
			break;
		}catch(Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("프로그램 종료");
		}
		System.out.println("프로그램 종료");
		in.close();
	}
}
