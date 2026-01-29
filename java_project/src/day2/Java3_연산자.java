package day2;

public class Java3_연산자 {

	public static void main(String[] args) {

		// +, -, *, /
		
		int a = 10;
		int b = 5;
		int c = 13;
		double d = 13;
		// int + int => int형 결과
		System.out.println(a + b); // 15
		System.out.println(c - b); // 8
		System.out.println(a * c); // 130
		System.out.println(c / b); // 몫이 나옴
		System.out.println(c % b); // 나머지가 나옴 (13을 5로 나눈 나머지)
		
		// 사칙연산의 결과는 더 큰 데이터 타입을 따른다.
		System.out.println(d / b); // double / int => double형 결과
		System.out.println((double) c / b); 
	}

}
