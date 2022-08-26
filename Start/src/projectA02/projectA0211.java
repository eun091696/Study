package projectA02;

public class projectA0211 {

	public static void main(String[] args) {
		int inc = 10;
		int inb = ++inc;
		System.out.println("inc= " + inc + "inb= " + inb); // c 11 b 11

		inb = inc++;
		System.out.println("inc= " + inc + "inb= " + inb); // c 12 b 11
		
		int ind = 10;
		int ind1 = --ind;
		System.out.println("ind= " + ind + "ind1= " + ind1); // d 9 d1 9
		ind1 = ind--;
		System.out.println("ind= " + ind + "ind1= " + ind1); // d 8 d1 9
		
		inc = 10;
		inb = inc++;
		System.out.println("inc= " + inc + "inb= " + inb); // c 11 b 10
		inb = ++inc;
		System.out.println("inc= " + inc + "inb= " + inb); // c 12 b 12

		ind = 10;
		ind1 = ind--;
		System.out.println("ind1= " + ind1 + "ind= " + ind); // d1 10 d 9
		ind1 = --ind;
		System.out.println("ind1= " + ind1 + "ind= " + ind); // d1 8 d 8

		
		
	}

}
