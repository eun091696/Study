package projectA08;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[][] intArray = new int[2][3];
		for(int i = 0, k = 1; i < intArray.length;i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(intArray));
	}

}





























