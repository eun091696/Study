package projectA03;

public class projectA0304 {
	int v1 = 10;
	
	
	public void method01() {
		int v1 = 15;
	}
	
	public void method02() {
		v1 = 10;
	}
	
	public static void main(String[] args) {
//		v1 = 10; static 영역에 사용되는 값은 static으로 정의되지 않으면 사용할 수 없다.
		
		int v1 = 15;
		{
			int v2 = 10;
			{
				int v3 = 20;
				System.out.println(v1 + v2 + v3);
			}
			System.out.println(v1 + v2);
			
		}
		System.out.println(v1);
		
		
	}

}
