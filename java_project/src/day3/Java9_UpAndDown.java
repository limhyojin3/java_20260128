package day3;

import java.util.Random;
import java.util.Scanner;

public class Java9_UpAndDown {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int random = ran.nextInt(100) + 1; // 1~100
		int count = 1;
		
		while(true) {
			System.out.print(count + "번째 시도 : ");
			int answer = s.nextInt();
			
			// 검증
			if(!(1 <= answer && answer <= 100)) {
				System.out.println("1~100 사이 값을 입력해주세요.");
				continue; // while 조건식으로 돌아감.
			}
			
			// 검증
			if(random == answer) {
				System.out.println("정답입니다!" + count + "번째만에 맞추셨습니다.");
				break; // while 문을 빠져나감
			}
			
			// 정상로직
			if(random > answer) {  // 71 > 50
				System.out.println("Up!");
				count++;
			} else {
				System.out.println("Down!");
				count++;
			}
		}
	}
}
