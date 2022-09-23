package 객체타입배열;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		User user[] = new User[4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			user[i] = new User();
			System.out.print("이름: ");
			user[i].name = sc.next();
			System.out.print("번호: ");
			user[i].phone = sc.next();
			System.out.print("나이: ");
			user[i].age = sc.nextInt();
			System.out.print("성별: ");
			user[i].gender = sc.next();
			
		}
		for(int i = 0; i < 4; i++) {
			user[i].info();
			System.out.println();
		}
	}

}
class User{
	String name;
	String phone;
	int age;
	String gender;
	
	void info() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
	}
}