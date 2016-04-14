package mytest;

public class Calculator {
	private int result;

	public void add(int n) {
		result = result + n;
	}

	public void substract(int n) {
		result = result - 1;
	}
	
	public void multiply(int n) {
		// do nothing
	}
	
	public void divide(int n) {
		result = result / n;
	}
	
	public void squareRoot(int n) {
		for(;;);
	}
	
	public void clear() {
		result = 0;
	}
	
	public int getResult() {
		return result;
	}
}
