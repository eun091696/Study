package projectA02;

public class projectA0206 {

	public static void main(String[] args) {
		int inta = 100_200_100; //세자리씩 단위 표시할 때 사용, 눈에 보기 쉽게 하는것임, 언더바 사용하여 출력 해도 언더바는 안보임
		int intc = 10_0;
		int price = 20_100;
		long cardNumber = 1234_5678_1357_9998L;
		long controlBits = 0b101101100_01011011_10110011;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		int age = 2_________5;
		
		System.out.println(inta);
		System.out.println(intc);
		System.out.println(price);
		System.out.println(cardNumber);
		System.out.println(controlBits);
		System.out.println(maxLong);
		System.out.println(age);
	}

}
