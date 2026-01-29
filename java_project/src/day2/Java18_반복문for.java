package day2;

import java.util.Scanner;

public class Java18_반복문for {

	public static void main(String[] args) {

//		for(1.선언부; 2.조건식; 4.증감식){    (2->3->4) 반복
//			3.내용
//		}
		
//		for(int i = 1; i <= 10; i++)
//			System.out.println("zzz");
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int input = s.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 " + input + "까지의 합은 " + sum);
		
	} //main

}
