package projectA08;

import java.util.Arrays;

public class projectA0809 {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		System.out.println(Arrays.toString(newIntArray));
		
		int[] new2IntArray = new int[5];
		
		System.arraycopy(oldIntArray, 0, new2IntArray, 0, oldIntArray.length);
		System.out.println(Arrays.toString(new2IntArray));
		
	}

}
