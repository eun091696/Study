package projectA11S03;

class Person{
	
}
class Student extends Person{
	
}
class Researcher extends Person{
	
}
class Professor extends Researcher{
	
}

public class projectA1111 {

	static void print(Person p) {
		if(p instanceof Person) {
			System.out.print("Person");
		}
		if(p instanceof Student) {
			System.out.print("Student");
		}
		if(p instanceof Researcher) {
			System.out.print("Researcher");
		}
		if(p instanceof Professor) {
			System.out.print("Professor");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() -> \t");
		print(new Student());
		System.out.print("nes REsearcher() -> \t");
		print(new Researcher());
		System.out.print("new professor() -> \t");
		print(new Professor());
	}
}
