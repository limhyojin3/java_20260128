package day2;

import java.util.Scanner;

public class Java12_조건문 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int input = s.nextInt();
		int a = 10;
		
		if(input > a) {
			System.out.println("입력한 값이 a보다 큽니다.");
		} else {
			System.out.println("입력한 값이 a 보다 작거나 같습니다.");
		}
		
	}

}
