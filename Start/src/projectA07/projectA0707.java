package projectA07;

public class projectA0707 {

	public static void main(String[] args) {
		int i0, i1, i2 , i3, i4, i5 , i6 ,i7 ,i8 ,i9;
		i0 = 4;
		i1 = 55;
		i2 = 32;
		i3 = 28;
		i4 = 35;
		i5 = 2;
		i6 = 99;
		i7 = 13;
		i8 = 43;
		i9 = 65;
		int sum = i0 + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9;
		System.out.println(sum);
		
		int[] i = new int[10];
		i[0] = 4;
		i[1] = 55;
		i[2] = 32;
		i[3] = 28;
		i[4] = 35;
		i[5] = 2;
		i[6] = 99;
		i[7] = 13;
		i[8] = 43;
		i[9] = 65;
		int n ;
		sum = 0;
		for(n = 0; n < 10; n++) {
			sum = sum + i[n];
		}
		System.out.println(sum);
		
		int[] a = {4, 55 ,32, 28, 35, 2, 99, 13, 43, 65};
		sum  = 0;
		for(n = 0; n < 10; n++) {
			sum = sum + a[n];
		}
		System.out.println(sum);
	}

}






























