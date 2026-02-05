package day7.quiz;

import java.util.Scanner;

public class Quiz_3 {
	
	public static void main(String[] args) {
		
		//3. 숫자를 하나 입력받고, 해당 숫자가 홀수인지 짝수인지 출력.
		// 단, 숫자가 1~30사이 값이 아닐 경우 다시 입력하도록 함
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("1~30 사이 숫자를 입력해주세요. : ");
			int input = s.nextInt();
			
			if(!(1<= input && input <=30)) {
				System.out.println("다시 입력해주세요.");
				continue;
				
			}
			
			if(input % 2 == 1) {
				System.out.println("홀수 입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
		}
		
		
	}

}
