package 문제1;

class IThread1 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Hi");
		}
		
	}
}

class IThread2 implements Runnable { 
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("안녕");
		}
		
	}
}

class IThread3 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("반가워");		
		}
	}
}

public class Project1602 {

	public static void main(String[] args) {
		Thread th01 = new Thread(new IThread1());
		Thread th02 = new Thread(new IThread2());
		Thread th03 = new Thread(new IThread3());
		
		th01.start();
		th02.start();
		th03.start();
	}

}
