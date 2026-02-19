package day14;

public class GoodCalc2 implements Calculator2 { //확인(+)

	@Override
	public int sum(int x, int y) {
		return x + y;
	}
	
	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}
	
}
