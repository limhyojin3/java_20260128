package day4.cleassEx;

import java.util.Scanner;

public class Java7_퀴즈 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// *****
		
		
		for(int j = 1; j <=5; j++) {
			for(int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		for(int i = 0; i < 1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int i = 0; i < 2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		//...
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		
		
		
		System.out.println("------------------------------");
		
		
		
		
		
		/// 정답		
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int input = s.nextInt();
//		
//		for(int i = 1; i <= input; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 문제2.
		int arr[] = {3, 5, 2, 4, 1};
		// ***
		// *****
		// **
		// ****
		// *
		
		for(int j = 0; j < arr.length; j++) {  //j =0,1,2,3,4
			for(int i = 0; i < arr[j]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//변수가 두개다. 수열은 일단 몇개 나열해봐라~  나열 안해보면 인간의 머리로 바로 못 푼다.
		
//		for(int i = 0; i < arr[0]; i++) {   //변수가 두개다. 수열은 일단 몇개 나열해봐라~
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int i = 0; i < arr[1]; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		//....
//		for(int i = 0; i < arr[4]; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
	} // main

}
