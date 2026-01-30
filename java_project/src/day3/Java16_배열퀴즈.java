package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java16_배열퀴즈 {

	public static void main(String[] args) {

		//1. 5개의 공간을 가지는 배열을 선언
		//2. 해당 배열에 숫자를 입력받아서 넣기
		//3. 1미만(0이하)의 숫자는 입력하면 배열에 넣지 말고 다시 입력하도록
		
		Scanner s = new Scanner(System.in);
		
		//반복문을 맨 나중에 도입.
		
		while(true) {
			System.out.println("[1. 배열 만들기 2. 종료하기]");
			int menu = s.nextInt();
			
			switch (menu) {
			case 1 :
				// 정상 로직
				int[] arr = new int[5];
				System.out.println("배열에 숫자를 차례대로 입력합니다. ");
				
				for(int i = 0; i < arr.length; i++) {
					
					System.out.print((i+1) + "번째 숫자 입력 : ");
					int num = s.nextInt();
					
					
					// 검증
					if(num < 1) {
						System.out.println("1 이상의 숫자를 입력해주세요.");
						System.out.println();
						i--;
						continue; //곧바로 증감식으로 간다.
						
					}
					
					//정상 로직
					arr[i] = num;
					
					
				}
				
				System.out.println("만들어진 배열은 다음과 같습니다. : " + Arrays.toString(arr));
				System.out.println();
				break; // switch 문을 빠져나간다.
			case 2 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("1번 또는 2번을 선택해주세요.");
				break;
			} // switch 문
		
			if(menu == 2) {
				break; //while 문을 빠져나간다
			}
		}//while 문

	}

}
