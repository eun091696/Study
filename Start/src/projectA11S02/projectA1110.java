package projectA11S02;

class Person {
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}

public class projectA1110 {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		p = s; //업캐스트
		
		System.out.println(p.name);
		
		Person p1 = new Student("척중경");
		Student s1;
		s1 = (Student) p1; //다운캐스트
		s1.grade = "A";
		s1.department = "컴퓨터공학";
		System.out.println(s1.name);

	}

}
