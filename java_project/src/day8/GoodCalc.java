package day8;

public class GoodCalc implements Calculator {

	@Override
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int abs(int x) {
		return x < 0 ? -x : x;
	}
	
	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}
}
