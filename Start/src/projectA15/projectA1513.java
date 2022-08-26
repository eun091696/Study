package projectA15;

class Person4 {
	String name;
	String id;
	
	public Person4(String name) {
		this.name = name;
	}
}

class Student4 extends Person4 {
	String grade;
	String department;
	
	public Student4(String name) {
		super(name);
	}
}


public class projectA1513 {

	public static void main(String[] args) {
		Person4 p;
		Student4 s = new Student4("이재문");
		p = s;
		
		System.out.println(p.name);
		

	}

}
