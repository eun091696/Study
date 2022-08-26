package projectA16;

class TRTh01 extends Object implements Runnable {
	@Override
	public void run() {
		int i = 0;
		do {//Runnable로 만듦
			System.out.println("Read");
			i++;
		}while(i < 1000);
	}
}

class TRTh02 extends Thread {
	@Override
	public void run() {
		int i = 0;
		do {//Thread로 만듦
			System.out.println("Write");
			i++;
		}while(i < 1000);
	}
}

class TRTh03 extends Object implements Runnable {
	@Override
	public void run() {
		int i = 0;
		do {//Runnable로 만듦
			System.out.println("Send");
			i++;
		}while(i < 1000);
	}
	
}
public class projectA1610 {

	public static void main(String[] args) {
		Thread the01 = new Thread(new TRTh01());
		Thread the02 = new TRTh02();
		Thread the03 = new Thread(new TRTh03());
		
		the01.start();
		the02.start();
		the03.start();

	}

}

