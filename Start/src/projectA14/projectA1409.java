package projectA14;

class NotFindID extends Exception {
	//예외 정의...
}

public class projectA1409 {

	public void findId() throws NotFindID {
		//예외 정의...
		throw new NotFindID();
	}	
	
	public static void main(String[] args) throws Exception {
		
		throw new Exception("예외상황입니다");
		
	}

}
