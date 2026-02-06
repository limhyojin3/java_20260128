package day8;

import java.util.Random;
import java.util.Scanner;

public class Java99_문제풀이 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		
		while(true) {
			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				
				while(true) {
					System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
					menu = s.nextInt();
					
					System.out.println();
					
					
					if(1<= menu && menu <= 3) { 
						
						System.out.println("=== 문제풀이를 시작합니다(5문제) ===");
						
						
						int count = 0;
						
						for(int i = 1; i <= 5; i++) {
							
							int x; //선언부터
							
							if(menu ==1) {
								x = ran.nextInt(4)+2;
							} else if (menu ==2) {
								x = ran.nextInt(4)+6;
							} else {
								x = ran.nextInt(8)+12;
							}
							
							int y = ran.nextInt(9)+1;     //1~9 ->0~8+1 -> 1~9
							
							System.out.print(i + "번 " + x + " * " + y + " = ");
							int input = s.nextInt();
							
							if((x*y) == input) {
								System.out.println("정답입니다!");
								count++;
							}else {
								System.out.println("틀렸습니다. 정답은 " + (x*y) + "입니다.");
							}
						} //for 문 종료
						System.out.println("총 " + count + "개 맞추셨습니다.");
						break; //안쪽 while 문 종료

						
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
