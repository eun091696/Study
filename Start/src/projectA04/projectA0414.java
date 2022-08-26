package projectA04;

import java.util.Scanner;

public class projectA0414 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요: ");
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		//100~95 A++
		//94~90 A
		//89~85 B++
		//84~80 B
		//C
		if(num <= 100 && num >= 95) {
			System.out.println("A++");
		}else if(num <= 94 && num >= 90) {
			System.out.println("A");
		}else if(num <= 89 && num >= 85) {
			System.out.println("B++");
		}else if(num <= 84 && num >= 80) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		in.close();
		
	}

}
