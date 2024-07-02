// sum function addition
// subtract function

package exercises;

public class SumSubtract {

	int a = 10;
	int b = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumSubtract obj = new SumSubtract();
		obj.sum();
		System.out.println("Subtract : " + obj.subtract());
		System.out.println("Division : " + obj.divide());
		System.out.println("Multiplication : " + obj.multiply());
	}

	public void sum() {
		int sum = a + b;
		System.out.println("Sum  : " + sum);
	}

	public int subtract() {
		return a - b;
	}

	public double divide() {
		return a / b;
	}

	public int multiply() {
		return a * b;
	}
}
