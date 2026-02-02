package day4.cleassEx;

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.intro();
		
		System.out.println("-----------------------");
		int a = calc.abs(-10);
		System.out.println("절대값은 " + a + "입니다.");
		
		int sum = calc.sum(5, 10);
		System.out.println("덧셈의 결과값은 " + sum + "입니다.");
		
		double sum2 = calc.sum(5, 10.8);
		System.out.println("덧셈의 결과값은 " + sum2 + "입니다.");
	}

}
