package Break;

import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum = 0;
		while(true) {
			System.out.println("더할 숫자를 입력해주세요:(종료0)");
			i = sc.nextInt();
			if(i == 0) {
				break;
			}
			sum = sum + i;
		}
		System.out.println("현재까지의 총합=" + sum);
	}

}
