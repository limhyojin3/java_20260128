package day7.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz_4 {
	
	public static void main(String[] args) {
		
//		4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
//		큰 수 인지 아닌지 판별하기
//		(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 
//		  '입력한 수가 더 큽니다' 출력, 반대일 경우 '랜덤 숫자가 더 큽니다' 출력
//		  , 두 수가 같으면 '같습니다' 출력)
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int ranNum = ran.nextInt(100)+1; //1~100 -> 0~99+1 =>1~100
		
		System.out.print("1부터 100 사이의 숫자를 입력하세요. : ");
		int input = s.nextInt();
		
		if(!(1<= input && input <=100)) {
			System.out.println("잘못된 범위의 숫자를 입력하셨습니다.");
			return;
		}
		
		if(input > ranNum) {
			System.out.println("입력한 수가 더 큽니다.");
		}else if(input < ranNum) {
			System.out.println("랜덤 숫자가 더 큽니다.");
		}else {
			System.out.println("두 수가 같습니다.");
		}
		
	}
}
