package day2;

import java.util.Scanner;

public class Java24_퀴즈 {

	public static void main(String[] args) {

		// 1. 사용자가 입력한 숫자의 구구단을 출력하시오.
		// 2~9 사이의 값이 아니면 다시 입력하도록 하시오.
		
		
		Scanner s = new Scanner(System.in);
		
		for(;;) {
			System.out.print("구구단의 몇단을 출력할까요? ");
			int num = s.nextInt();
			//int num = 3;
			
			// 검증
			if(!(2 <= num && num <= 9)) {
				System.out.println("2~9 사이의 숫자를 입력하세요.");
				System.out.println();
				continue;  //아래라인 무시하고 조건식으로 돌아감.
			}
			
			// 정상로직
			System.out.println("====" + num + "단====");
			
			for(int i = 1; i <= 9; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
			
			System.out.println();
			System.out.println("프로그램이 종료되었습니다.");
			break;
		}
		
	}

}
