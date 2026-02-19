package day14;

public class GoodCalc extends Calculator1 { //확인(+)

	@Override
	int sum(int x, int y) {
		return x + y;
	}

	@Override
	int max(int x, int y) {
		return x > y ? x : y;
	}
	
}
