package day6;

import java.util.Random;
import java.util.Scanner;

public class Java98_퀴즈풀이 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("****** 랜덤 구구단 문제 ******");
		
		int correctAns = 0;
		int wrongAns = 0;
		
		while(true) {
			System.out.println("===== 메뉴 선택 =====");
			System.out.print("[ (1)문제풀이 (2)현재스코어 (3)종료 ] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				
				System.out.println("문제 풀이를 선택하셨습니다. 정답에 0을 입력하면 메뉴로 이동합니다.");
				
				
				while(true) {
					
					int x = ran.nextInt(8) + 2; //2~9  0~7+2
					int y = ran.nextInt(9) + 1; //1~9  0~8+1
					
					System.out.print(x + "*" + y + " = ");
					int answer = s.nextInt();
					
					//검증
					if(answer == 0) {
						System.out.println("0을 입력하셨으므로 메뉴로 이동합니다.");
						break; //while 문 빠져나감
					}
					
					if(x * y == answer) {
						System.out.println("정답입니다 !");
						correctAns++;
					} else {
						System.out.println("오답입니다 ! 정답은 " + (x*y) + "입니다." );
						wrongAns++;
					}
				}
			} else if (menu == 2) {
				
				System.out.println("현재까지 맞춘 정답 개수 : " + correctAns);
				System.out.println("현재까지 틀린 정답 개수 : " + wrongAns);
			} else if (menu == 3) {
				
				System.out.println("종료합니다.");
				break;
			} else {
				
				System.out.println("1~3번 메뉴를 선택해주세요.");
			}
			
			
		}
		
	}

}
