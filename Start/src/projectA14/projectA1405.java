package projectA14;

public class projectA1405 {

	public static void main(String[] args) {
		String data = null;
		
				
			try {
				System.out.println("결과는" + data.toString());
				
			}catch(NullPointerException e) {
				data = "확인용";
			}
			System.out.println(data);
		

	}

}
