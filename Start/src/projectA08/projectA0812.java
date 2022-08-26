package projectA08;

import java.util.Arrays;

public class projectA0812 {

	public static void main(String[] args) {
		int[][] A = {{1,2,3,4,5},{6,7,8,9,10}};
//		int[][] B = A.clone(); // -> 2차원 배열 경우 clone적용되지 않음.
		
		System.out.println(Arrays.deepToString(A));
		
//		B[0][0] = 999;
		System.out.println(Arrays.deepToString(A));
//		System.out.println(Arrays.deepToString(B));
		
		int[][] C = new int[A.length][A[0].length];
		
		for(int i = 0; i < A.length; i++) {
			System.arraycopy(A[i], 0, C[i], 0, C[i].length);	
		}
		
		C[0][0] = 777;
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(C));
		
		int[][] D = new int[2][];
		
		for(int i = 0; i < A.length; i++) {
			D[i] = new int[A[i].length];
			for(int j = 0; j < A[i].length; j++) {
				D[i][j] = A[i][j];
			}
		}
		D[0][0] = 888;
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(D));
		
		
	}

}
