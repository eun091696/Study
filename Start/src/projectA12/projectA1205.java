package projectA12;

public class projectA1205 {

	public static void main(String[] args) {
		RemoteControl remocon;
		
		remocon = new Television();
		remocon.turnOn();
		remocon.setVolume(5);
		remocon.turnOff();
		
		remocon = new Audio();
		remocon.turnOn();
		remocon.setVolume(9);
		remocon.turnOff();
		
		
		
		RemoteControl rRemocon = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("커기");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("끄기");
				
			}
			
			@Override
			public void setVolume(int volume) {
				/*기능 정의*/
				
				
			}

			@Override
			public void search(String url) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
