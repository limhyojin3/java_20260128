package day8;

import java.util.Scanner;

public class Java3_문자열 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		System.out.println(a == b); //true
		
		System.out.println();
		
		String c = "안녕?";
		String d = "안녕?";
		String e = new String("안녕?");
		
		System.out.println(c == d); //true
		
		System.out.println();
		
		System.out.println(d == e); //false
		System.out.println(d.equals(e)); //true
		
		System.out.println();
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("'안녕?'을 입력해주세요: ");
		String f = s.next(); //String f = new String("안녕?"); 실행됨.
		
		System.out.println(c == f); //false
		System.out.println(c.equals(f)); //true
		
	}	

}
