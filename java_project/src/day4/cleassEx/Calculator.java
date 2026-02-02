package day4.cleassEx;

public class Calculator {

	double pi = 3.141592;
	
	Calculator(){
		System.out.println("계산기 생성!");
	}
	
	void intro() {
		System.out.println("아주 아주 좋은 계산기 입니다!");
	}

	int abs(int x) {
		System.out.println("절대값을 되돌려 드립니다!");
		return x >= 0 ? x : -x;
	}
	
	int sum(int x, int y) {
		return x + y;
	}
	
	double sum(int x, double y) {
		return x + y;
	}
	
	int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	
	
}
