package projectA09S02;

public class Car {
	//멤버변수, 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//디폴터 생성자
	//생성자의 overloading
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
