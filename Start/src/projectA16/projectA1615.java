package projectA16;

//작업이 3개이며 첫 번째는 1~1000까지의 3의 배수
//두 번째는 1~1000까지 4의 배수
//세 번째는 1~1000까지 5의 배수

class TheThreadT extends Thread {
	int tag = 0;
	TheThreadT(int tag) {
		this.tag = tag;
	}
	@Override
	public void run() {
		if(tag == 3) { //3의 배수
			int sum = 0;
			for(int i = 0; i <= 1000; i++) {
				if(i % 3 == 0) {
					sum = sum + i;
				}
			}
			System.out.println("3의 배수:" + sum);
		}else if(tag == 4) { //4의 배수
			int sum = 0;
			for(int i = 0; i <= 1000; i++) {
				if(i % 4 == 0) {
					sum = sum + i;
				}
			}
			System.out.println("4의 배수:" +sum);
		}else if(tag == 5) { //5의 배수
			int sum = 0;
			for(int i = 0; i <= 1000; i++) {
				if(i % 5 == 0) {
					sum = sum + i;
				}
			}
			System.out.println("5의 배수:" +sum);
		}
	}
}

public class projectA1615 {

	public static void main(String[] args) {
		TheThreadT th01 = new TheThreadT(3);
		TheThreadT th02 = new TheThreadT(4);
		TheThreadT th03 = new TheThreadT(5);
		
		th01.start();
		th02.start();
		th03.start();


	}

}
