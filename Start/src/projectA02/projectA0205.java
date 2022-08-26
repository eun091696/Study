package projectA02;

public class projectA0205 {
	
	public static void main(String[] args) {
		char name1 = '곽';
		char name2 = '정';
		char name3 = '필';
		System.out.println(name1 + name2 + name3);
		System.out.println("" +name1 + name2 + name3);
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		System.out.println();
		
		String name = "곽정필";
		System.out.println(name);
		
		System.out.println(10 + 20 + "안녕하세요");
		System.out.println("안녕하세요" + 10 + 20); //앞에 문자열이 있어 뒤의 숫자도 문자열로 나타남
		
		System.out.println(10 + 30 + 40 + "Hi");
		System.out.println("HI" + (10 + 30 + 40));
		System.out.println(10 + 30 + "Hi" + 40 * 100);
		
		System.out.println("(" + 10 + 20 + ")");
		System.out.println((10 + 20));
		char c1 = '가';
		char c2 = '나';
		System.out.println(c1 + c2);
		System.out.println("" + c1 + c2);
		
		String str = 10 + 20 + "안녕하세요";
		String str1 = "안녕하세요" + 10 + 20;
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(10); // 10진수
		System.out.println(017); // 8진수
		System.out.println(0x1F); //16진수
		System.out.println(0b01010101010); //2진수
		
		char c = '\u0041'; //유니코드로 지정된 숫자를 문자로 바꾸는 방법
		System.out.println(c);
		char cc = '\u0042';
		System.out.println(cc);
		char cc2 = '\uae00';
		System.out.println(cc2);
		
		String string1 = "안녕 \t 안녕하세요 \t 나는 \n \"곽정필\" 입니다.";
		System.out.println(string1);
		String string2 = "안녕 \b 안녕하세요 \t 나는 \'곽정필\' 입니다.";
		System.out.println(string2);
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean b3 = 10 > 1;
		boolean b4 = 10 == 10;
		boolean b5 = 10 < 1;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		String s1 = null;
		String s2 = "";
		int[] a1 = null;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(a1);
		
	}
}





















