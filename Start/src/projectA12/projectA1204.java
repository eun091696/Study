package projectA12;

public class projectA1204 {

	void Calculation(Calculator calc) {
		calc.add(5, 5);
	}
	
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.subtract(2, 3));
		System.out.println(calc.average(new int[] {1, 2, 3}));
		System.out.println();
		
		BadCalc bcalc = new BadCalc();
		System.out.println(bcalc.add(2, 3));
		System.out.println(bcalc.subtract(2, 3));
		System.out.println(bcalc.average(new int[] {1, 2, 3}));
		System.out.println();
		
		Calculator allCalc = new GoodCalc();
		System.out.println(allCalc.add(2, 3));
		System.out.println(allCalc.subtract(2, 3));
		System.out.println(allCalc.average(new int[] {1, 2, 3}));
		System.out.println();
		
		allCalc = new BadCalc();
		System.out.println(allCalc.add(2, 3));
		System.out.println(allCalc.subtract(2, 3));
		System.out.println(allCalc.average(new int[] {1, 2, 3}));
		
		Calculationsum(new GoodCalc());
		Calculationsum(new BadCalc());
	}

	private static void Calculationsum(GoodCalc goodCalc) {
		// TODO Auto-generated method stub
		
	}
	private static void Calculationsum(BadCalc badCalc) {
		// TODO Auto-generated method stub
		
	}

	

}
