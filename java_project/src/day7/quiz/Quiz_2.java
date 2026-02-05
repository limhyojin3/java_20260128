package day7.quiz;

import java.util.Scanner;

public class Quiz_2 {

	public static void main(String[] args) {

		//2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 두개를 입력해주세요.");
		System.out.print("첫번째 숫자 : ");
		int first = s.nextInt();
		System.out.print("두번째 숫자: ");
		int second = s.nextInt();
		
		if((first + second) > 10) {
			System.out.println("큰 수 입니다.");
		} else {
			System.out.println("작은 수 입니다.");
		}
		
	}

}
