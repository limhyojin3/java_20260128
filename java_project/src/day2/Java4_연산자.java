package day2;

public class Java4_연산자 {

	public static void main(String[] args) {
		
		// 나머지 연산(%)
		int a = 10;
		int b = a % 3;
		System.out.println(b); // 10을 3으로 나눈 나머지 : 1
		
		String name = "홍길동";
		int age = 30;
		
		// 문자열과 다른 데이터 타입을 더하면, 결과는 문자열이 된다.
		System.out.println(name + age);
		System.out.println(name + "의 나이는 " + age + "살 입니다.");
		System.out.println(name + "의 나이는 " + age + 1 + "살 입니다.");
		System.out.println(name + "의 나이는 " + (age + 1) + "살 입니다.");
	}

}
