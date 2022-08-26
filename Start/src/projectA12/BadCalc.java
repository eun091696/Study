package projectA12;

public class BadCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i : a) {
			sum = sum + i;
		}
		return (sum / a.length) / 100;
	}

}
