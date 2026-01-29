package day2;

import java.util.Scanner;

public class Java23_무한루프 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 : ");
//		int input = s.nextInt();
//		
//		if(!(1 <= input && input <= 100)) {
//			System.out.println("1부터 100사이의 값을 입력해주세요");
//			
//		} else {
//			if(input % 2 == 1) {
//				System.out.println("홀수 입니다.");
//			} else {
//				System.out.println("짝수 입니다.");
//			}
//		}
		
		for(;;) {
			System.out.print("숫자를 입력해주세요 : ");
			int input = s.nextInt();
			
			if(!(1 <= input && input <= 100)) {
				System.out.println("1부터 100사이의 값을 입력해주세요");
				
			} else {
				if(input % 2 == 1) {
					System.out.println("홀수 입니다.");
					break;
				} else {
					System.out.println("짝수 입니다.");
					break;
				}
			}
		}
		
//		Scanner s = new Scanner(System.in);
		
//		int a = 1;
//		for(;;) {
//			System.out.println(a++);
//			s.nextInt();
//			
//			if(a == 10) {
//				break;
//			}
//		}
		
//		int a = 1;
//		for(;;) {
//			System.out.println(a++);
//			
//			if(a == 10) {
//				break;
//			}
//		}
		
		
		
	} // main

}
