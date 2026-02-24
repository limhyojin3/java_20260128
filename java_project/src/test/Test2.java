package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

//		2. (20점) 1부터 스캐너로 입력받은 숫자까지의 합을 구하시오. (+)
//		   단, 스캐너로 입력받은 숫자가 2~1000사이의 숫자가 아니거나(+) 짝수일 경우(+)
//		   '계산할 수 없습니다' 출력 후 프로그램을 종료하시오.(+)
//		(파일명 : Test2.java)
		
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자입력 : ");
		int num = s.nextInt();
		
		if(!(2 <= num && num <= 1000)) {
			System.out.println("계산할 수 없습니다.");
			return;
		}
		
		if(num % 2 == 0) {
			System.out.println("계산할 수 없습니다.");
			return;
		}
		
		
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		
		System.out.println("1부터 입력받은 숫자까지의 합은 " + sum + "입니다.");
		


		
		
		
		
		
	}

}
