

public class Calculator {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int sum = c.sum( 1, 2 );
		
		System.out.println("Sum : " + sum);

	}
	
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public int minus(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public int times(int a, int b) {
		int sum = a * b;
		return sum;
	}

}
