package projectA04;

public class projectA0415 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 2;
		int d = 1;
		
		if((a + b) == (c + d)) {
			System.out.println("두 수의 합이 같다.");
		}else {
			System.out.println("두 수의 합이 같이 않다.");
		}
		
		//문자비교
		if('A' == 'B') {
			System.out.println("같은 문자입니다.");
		}else if('A' == 'A') {
			System.out.println("같은 문자입니다.");
		}
		
		if("test" == "test") {//xxxxxxxxxxxxxxxxxxxxxxxx
			System.out.println("test");
		}
		
		if("test".equals("test")) {
			System.out.println("문자열이 같습니다.");
		}
		
		String str = "ABCD";
		if(str.equals("ABCD")) {
			System.out.println("문자열이 같습니다.");
		}
		
	}

}
