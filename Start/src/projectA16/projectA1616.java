package projectA16;

class TheRunnable implements Runnable {
	int tag = 0;
	TheRunnable(int tag) {
		this.tag = tag;
	}
	@Override
	public void run() {
		if(this.tag == 3) {
			int sum = 0;
			for(int i = 1; i <= 1000; i++) {
				if(i % 3 ==0) {
					sum += i;				
				}
			}
			System.out.println("3의 배수:" + sum);
		}
	}
}
public class projectA1616 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
