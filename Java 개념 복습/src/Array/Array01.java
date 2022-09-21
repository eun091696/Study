package Array;

public class Array01 {

	public static void main(String[] args) {
		int[] score = new int[3];
		score[0] = 100;
		score[1] = 80;
		score[2] = 70;
		for(int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "번째 학생의 점수:" + score[i] + "점");
		}

	}

}
