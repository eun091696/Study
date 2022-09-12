package Continue;

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("숫자입력:");
			num = sc.nextInt();
			if(num == 0) {
				System.out.println("종료!");
				break;
			}
			if(num < 0) {
				System.out.println("아래 명령 무시하고 다음 반복 진행!");
				continue;
				/*
				 * continue는 반복문 내에서만 사용될 수 있으며, 반복이 진행되는 도중에
				 * continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
				 */
				
			}
			System.out.println("num:" + num);
		}

	}

}
