package day7.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz_8 {

	public static void main(String[] args) {
//		8. 
//		기본조건
//		 - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력
//		 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력 시 안내 문구 후 다시 입력
//		 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력
//		 - 문제는 5문제 고정. 5문제 모두 푼 후 맞춘 개수 출력
//		 - 메인 메뉴에서 2번 선택 시 종료
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				
				while(true) {
					System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
					menu = s.nextInt();
					
					
					
					if(menu == 1) {
						System.out.println();
						System.out.println("=== 문제풀이를 시작합니다(5문제) ===");
						
						int count = 0;
						for(int i = 1; i <= 5; i++) {
							
							int x = ran.nextInt(4)+2; //2~5->0~3+2 ->2~5
							int y = ran.nextInt(9)+1;     //1~9 ->0~8+1 -> 1~9
							
							System.out.print(i + "번 " + x + " * " + y + " = ");
							int input = s.nextInt();
							
							if((x*y) == input) {
								System.out.println("정답입니다!");
								count++;
							}else {
								System.out.println("틀렸습니다. 정답은 " + (x*y) + "입니다.");
							}
						}
						System.out.println("총 " + count + "개 맞추셨습니다.");
						break;
						
					} else if(menu == 2) { // 2. 보통(6~9단)
						System.out.println();
						System.out.println("=== 문제풀이를 시작합니다(5문제) ===");
						
						int count = 0;
						for(int i = 1; i <= 5; i++) {
							
							int x = ran.nextInt(4)+6; //6~9 ->0~3+6 ->6~9
							int y = ran.nextInt(9)+1;     //1~9 ->0~8+1 -> 1~9
							
							System.out.print(i + "번 " + x + " * " + y + " = ");
							int input = s.nextInt();
							
							if((x*y) == input) {
								System.out.println("정답입니다!");
								count++;
							}else {
								System.out.println("틀렸습니다. 정답은 " + (x*y) + "입니다.");
							}
						}
						System.out.println("총 " + count + "개 맞추셨습니다.");
						break;
						
					} else if(menu ==3) { // 3. 어려움(12~19단)
						
						System.out.println();
						System.out.println("=== 문제풀이를 시작합니다(5문제) ===");
						
						int count = 0;
						for(int i = 1; i <= 5; i++) {
							
							int x = ran.nextInt(8)+12; //12~19 ->0~7+12 =>12~19
							int y = ran.nextInt(9)+1;     //1~9 ->0~8+1 -> 1~9
							
							System.out.print(i + "번 " + x + " * " + y + " = ");
							int input = s.nextInt();
							
							if((x*y) == input) {
								System.out.println("정답입니다!");
								count++;
							}else {
								System.out.println("틀렸습니다. 정답은 " + (x*y) + "입니다.");
							}
						}
						System.out.println("총 " + count + "개 맞추셨습니다.");
						break;
						
					} else {
						System.out.println("난이도는 1~3 사이를 선택해주세요.");
						
					}
				}
			} else if(menu ==2) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("메뉴는 1~2 중에 선택해주세요.");
			}
			
		}
		
		
		
	}

}
