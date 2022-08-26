package projectA09;

public class projectA0905 {

	public static void main(String[] args) {
		Circle pizza; //인스턴스 변수 지정
		
		//인스턴트화, 객체화
		pizza = new Circle(); //객체가 만들어짐
		pizza.radius = 10; //반지름 10
		pizza.name = "불고기피자"; //피자의 이름을 정함
		double area = pizza.getArea(); //피자의 면적을 구함
		
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); //인스턴트화, 객체화  donut -> 인스턴스 변수
		donut.radius = 2; //반지름 2
		donut.name = "찐빵도넛"; //도넛의 이름 정함
		area = donut.getArea(); // 도넛의 면적을 구함
		
		System.out.println(donut.name + "의 면적은 " + area);
		
		
	}

}
