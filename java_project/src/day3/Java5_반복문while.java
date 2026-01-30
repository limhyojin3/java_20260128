package day3;

import java.util.Scanner;

public class Java5_반복문while {

	public static void main(String[] args) {

		// while 무한루프
		// 문제. 입력되는 숫자를 모두 더하시오.
		// 단, -1을 입력하면 더한 값을 출력하고 종료하시오.
		
		Scanner s = new Scanner(System.in);
		
		int count = 1;
		int sum = 0;
		
		// 고정-> Scanner 도입, 검증 도입 -> while 문 도입
		
		while(true) {
			System.out.print(count + "번째 숫자 입력 : ");
			int input = s.nextInt();
			
			// 검증
			if(input == -1) {
				System.out.println("모든 숫자의 합 : " + sum);
				break; //반복문 빠져나감
			}
			
			// 정상로직
			sum += input;
			
			count++;
			
		}
	}

}
