package 다차원배열;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[4][3];
		String subject[] = {"국어", "영어", "수학"};
		
		for(int i = 0; i < 4; i++) {
			System.out.println(i + 1 + "번 학생의 점수-----");
			for(int j = 0; j < 3; j++) {
				System.out.print(subject[j] + ":");
				score[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < 3; i++) {
			System.out.print("\t" + subject[i]);
		}
		System.out.println();
		for(int i = 0; i < 4; i++) {
			System.out.print(i + 1 + "번: \t");
			for(int j = 0; j < 3; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
