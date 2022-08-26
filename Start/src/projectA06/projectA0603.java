package projectA06;

public class projectA0603 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) { // while문은 조건이 참이면 실행, 거짓이면 종료된다.
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		int ia = 0;
		while(true) {
//			System.out.println(ia + " "); // 100까지 출력
			if(ia == 100) {
				break;
			}
			System.out.print(ia + " "); // 99까지 출력
			ia++; 
		}
		System.out.println();
		
		
		
	}

}
