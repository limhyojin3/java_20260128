package day2;

import java.util.Scanner;

public class Java14_조건문퀴즈 {

	public static void main(String[] args) {

		// 숫자를 1개 입력받아서 홀수면 '홀수 입니다.', 짝수면 '짝수 입니다.' 출력
		// 단, 1~100 사이의 값이 아니면 '1부터 100사이의 값을 입력해주세요'출력
		
		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 : ");
//		int input = s.nextInt();
		
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
		
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			int input = s.nextInt();
			
			if(!(1 <= input && input <= 100)) {
				System.out.println("1부터 100사이의 값을 입력해주세요");	
				continue; //조건문으로 되돌아감.
			}
			
			if(input % 2 == 1) {
				System.out.println("홀수 입니다.");
				break;
			} else {
				System.out.println("짝수 입니다.");
				break; //반복문 빠져나감.
			}
			
		}
		
	}

}
