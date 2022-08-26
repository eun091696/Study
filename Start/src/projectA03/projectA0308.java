package projectA03;

public class projectA0308 {

	public static void main(String[] args) {
		int x = 10;
		
		x += 10; // x = x + 10
		x -= 10; // x = x - 10
		x *= 10; // x = x * 10
		x /= 10; // x = x / 10
		x %= 10; // x = x % 10
		
		int result = (x == 10) ? 1 : 0;
		
		//비트연산자 & | ^
		
		int bitx = 0x01;
		int bity = 0x01;
		int bitresult = bitx & bity; // 0x01
		bitresult = bitx | bity; // 
		
		//논리연산자 && || 
		//true false를 서로간에 연산
		System.out.println((x > 10) && (x < 11)); //논리식이 모두 참이면 참을 반환 (AND연산)
		System.out.println((x > 10) || (x < 11)); //논리식이 하나라도 참이면 참을 반환 (OR연산)
		
		
	}

}
