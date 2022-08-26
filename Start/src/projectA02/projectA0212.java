package projectA02;

import java.util.Scanner;

public class projectA0212 {

	public static void main(String[] args) {
		System.out.println("이름 입력: ");
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		
		System.out.println("나이 입력: ");
		String age = in.nextLine();
		
		System.out.println("사는 곳: ");
		String palce = in.nextLine();
		
		System.out.println("이름: " + name + "나이: " + age + "사는 곳: " + palce);
		
		
	}


}
