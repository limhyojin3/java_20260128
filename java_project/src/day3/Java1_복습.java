package day3;

public class Java1_복습 {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		System.out.println(a / b); //3
		double c = 3;
		System.out.println(a / c); //3.333...
		
		System.out.println((double) a / b); // 3.333..
		
		String name = "홍길동";
		int age = 30;
		System.out.printf("%d살 %s입니다.\n", age, name);
		
		int num = 10;
		num += 3;
		System.out.println(num);
		
		int x = 10;
		int y = x++;
		int z = --x;
		System.out.printf("%d %d %d\n", x, y, z); //10 10 10
		
		System.out.println(x > 20 && y > 8); //false
		
		
		
		
	}

}
