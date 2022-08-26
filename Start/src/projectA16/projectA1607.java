package projectA16;

class Value {
	static int i = 0;
	
}

class The01 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i < 100) {
			System.out.println("Test" + i);
			i++;
		} 
	}
}

class The02 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i < 100) {
			System.out.println("Send" + i);
			i++;
		} 
	}
}

class The03 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i < 100) {
			System.out.println("Read" + i);
			i++;
		} 
	}
}
public class projectA1607 {

	public static void main(String[] args) {
		The01 the01 = new The01();
		The02 the02 = new The02();
		The03 the03 = new The03();
		
		the01.start();
		the02.start();
		the03.start();
	}

}
