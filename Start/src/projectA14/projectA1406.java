package projectA14;

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}

public class projectA1406 {
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
		}
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		System.out.println("Dog");
		
		Cat cat = new Cat();
		changeDog(cat);
		System.out.println("Cat");
	}

}
