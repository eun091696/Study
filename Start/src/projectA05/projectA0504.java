package projectA05;

public class projectA0504 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print(0 + " ");
		System.out.print(1 + " ");
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		System.out.print(4 + " ");
		System.out.print(5 + " ");
		System.out.print(6 + " ");
		System.out.print(7 + " ");
		System.out.print(8 + " ");
		System.out.print(9 + " ");
		System.out.println();
		int j;
		for(j = 0; j < 10; j ++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		System.out.println(0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
		int sum = 0;
		for(int i = 0; i <= 10; i ++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// 0~100까지 합을 계산
		sum = 0;
		for(int i = 0 ; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i == 100) {
				System.out.print(i + " = ");
			}else {
				System.out.print(i + " + ");
			}
			sum = sum + i;
		}
		System.out.print(sum);
		System.out.println();
	}
	

}


























