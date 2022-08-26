package projectA06;

import java.util.Scanner;

public class projectA0609 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	label: while(true) {
			System.out.println("명령문을 입력하세요: ");
			String input = in.nextLine();
			switch(input) {
			case "1count" :
				for(int i = 1; i <= 100; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case "exit" :
				System.out.println("프로그램 종료");
				break label;
			case "2count" :
				int sum = 0;
				for(int i = 0; i <= 300; i++) {
					sum = sum + i;
				}
				System.out.println("0에서 부터 300까지의 합: " + sum);
				break;
			case "3count" :
				continue;
				
			}
			int sum = 0;
			for(int i = 0; i <= 100; i++) {
				if(i % 2 == 0) {
					sum = sum + i;
				}
			}
			System.out.println("0에서 부터 100까지 짝수의 합은: " + sum);
			
		}
		
	}

}
