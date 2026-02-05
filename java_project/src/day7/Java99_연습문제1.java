package day7;

import java.util.Random;
import java.util.Scanner;

public class Java99_연습문제1 {
	
	public static void main(String[] args) {
		
		// 45분까지 ->50분까지
		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while(true) {
			System.out.print("문제수를 입력해주세요 : ");
			int input = s.nextInt(); //3
			
			int correctAns = 0;
			
			for(int i = 0; i < input; i++) { //i=0,1,2
				
				int x = ran.nextInt(8)+2;  //2~9  = 0~7+2
				int y = ran.nextInt(9)+1;  //1~9 = 0~8+1
				
				
				System.out.print(x + " * " + y + " = ");
				int answer = s.nextInt();
				
				if((x*y) == answer) {
					System.out.println("정답.");
					correctAns++;
				}else {
					System.out.println("오답. 정답은 " + (x*y) + "입니다.");
				}
			}
			System.out.println("총 " + input + "문제 중 " + correctAns + "개 정답!");
			System.out.println("계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요.");
			
			input = s.nextInt();
			
			if(input == 0) {
				System.out.println("종료되었습니다.");
				break; // while 문 빠져나감
			}
		}
	} // main
}