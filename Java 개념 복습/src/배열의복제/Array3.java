package 배열의복제;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fruits[] = new String[3];
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.print("주문할 과일:");
			fruits[i] = sc.next();
		}
		System.out.println("--------주문받은 과일-----");
		for(String eachFruit:fruits) {
			System.out.print(eachFruit + " ");
		}
				

	}

}
