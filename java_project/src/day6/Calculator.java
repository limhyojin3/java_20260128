package day6;

public class Calculator extends CalculatorClass{

	@Override
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int multiple(int x, int y) {
		return x * y;
	}

	@Override
	public int abs(int x) {
		return x < 0? -x : x;
	}
	
}
