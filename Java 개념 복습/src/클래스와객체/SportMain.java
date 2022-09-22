package 클래스와객체;

class Member{
	static String centerName = "Hello"; //static이 붙으면 클래스 변수가 된다.
	String name;
	int age;
	String gender;
	void info() {
		System.out.println("center Name:" + centerName);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("gender:" + gender);
		System.out.println();
	}
}

public class SportMain {

	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		member1.name = "김철수";
		member1.age = 32;
		member1.gender = "남자";
		
		member2.name = "김민호";
		member2.age = 28;
		member2.gender = "남자";
		
		member3.name = "이영희";
		member3.age = 24;
		member3.gender = "여자";
		
		member4.name = "고석천";
		member4.age = 32;
		member4.gender = "남자";
		
		Member.centerName = "Bye";
		member1.info();
		member2.info();
		member3.info();
		member4.info();
	}
}