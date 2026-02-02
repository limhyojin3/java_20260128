package day4;

import java.util.Scanner;

public class Java1_복습 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//int input = s.nextInt();
		
		System.out.println(s.nextInt()); //가능   / 한번만 쓰고 말거라면..
		
		// String <- 문자열 클래스
		
		// 21억이 넘으면 long,    double
		// char 
		
		char txt = 'a';
		System.out.println(txt + 10);
		
		int x = 10;
		int y = 5;
		
		int z;
		z = x > y ? x : y;
		System.out.println("둘중에 더 큰 값은 " + z + "입니다.");
		
		Math.max(10,  20);
		
		
	}

}
