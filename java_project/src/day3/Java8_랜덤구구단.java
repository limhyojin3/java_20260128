package day3;

import java.util.Random;
import java.util.Scanner;

public class Java8_랜덤구구단 {
	
	public static void main(String[] args) {
			
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		//1. 사용자가 풀이하고 싶은 문제 수를 직접 정하도록
		// 문제풀이가 끝난 후 다시 풀이할지 말지 사용자가 결정하도록
		
		System.out.println("=== 랜덤 구구단 ===");
		
		while(true) {
			System.out.print("[ (1) 구구단 시작  (2) 종료 ] : ");
			int menu = s.nextInt();
			
			//switch 문
			switch (menu) {
			case 1: // 정상로직
				int count = 0;    // 정답 개수체크
				
				System.out.print("몇문제를 푸시겠어요? : ");
				int amount = s.nextInt(); // 문제 개수
				
//				if (amount < 0) {
//					System.out.println("입력값이 옳지않습니다. 양수만 입력해주세요.");
//					continue;
//				}
				
				for(int i = 1; i <= amount; i++) {
					int x = ran.nextInt(8) + 2;  // 2~9  //반복문 돌때마다 랜덤숫자
					int y = ran.nextInt(9) + 1;  // 1~9
					
					System.out.print("[" + i + "번 문제] ");
					System.out.print(x + " * " + y + " = ");
					
					int answer = s.nextInt();
					if((x * y) == answer) {
						System.out.println("정답!!");
						count++;
					} else {
						System.out.println("오답!!");
					}
				}
				
				System.out.println("총 " + count + "문제를 맞추셨습니다.");
				break;
			case 2:
				System.out.println("종료되었습니다.");
				break;	
			default:
				System.out.println("메뉴는 1과 2중에서 선택해주세요.");
				break; //switch 문 빠져나감
			} // switch 문
			
			System.out.println();
			
			if (menu == 2) {
				break; //반복문 빠져나감
			}
		} // while 문
		
		
	} // main

}
