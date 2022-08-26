package projectA16;

class Thread_04 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("안녕하세요");
		}
	}
}

class Thread_05 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 200; i++) {
			System.out.println("Hi");
		}
	}
}

class Thread_06 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.println("반가워요");
		}
	}
}

public class projectA1604 {

	public static void main(String[] args) {
		Thread_04 th04 = new Thread_04();
		Thread_05 th05 = new Thread_05();
		Thread_06 th06 = new Thread_06();
		
		th04.start();
		th05.start();
		th06.start();
	}

}
