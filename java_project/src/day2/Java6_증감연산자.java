package day2;

public class Java6_증감연산자 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		// a++; // a = a + 1;
		
		// 증감연산자가 뒤에 있으면 먼저 값을 넣고 증감이 된다.
		int c = a++; // c = 10; a = 11;
		System.out.println(c);
		System.out.println(a);
		
		int d = ++b; // b = 6; d = 6;
		System.out.println(d);
		System.out.println(b);
		
		int e = b--; // e = 6; b = 5;
		System.out.println(e);
		System.out.println(b);
		
		
	}

}
