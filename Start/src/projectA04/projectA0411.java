package projectA04;

public class projectA0411 {

	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		System.out.println((double) (a / b));
		
		int c = a / b;
		
		//c의 값이 5의 배수 인지 아닌지는 두번 비교 하도록 하시오.
		
		if(c % 5 == 0) {
			System.out.println("5의 배수 입니다.");
		}
		if(c % 5 != 0) {
			System.out.println("5의 배수가 아닙니다.");
		}
	}

}
