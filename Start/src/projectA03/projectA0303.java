package projectA03;

public class projectA0303 {
	static int ib = 20;
	{
		int ia = 10;
	}
	static {
		int ic = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(ib);
			
		int var1;
		if(true) {
			int var2;
			var1 = 10;
			var2 = 20;
		}
		{
			int var3;
			var1 = 30;
//			var2 = 30; var2는 사용할 수 없음
			var3 = 30;
			
		}

	}

}
