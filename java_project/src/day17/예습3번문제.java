package day17;

import java.util.Arrays;
import java.util.Scanner;

public class 예습3번문제 {

	public static void main(String[] args) {

//		3. 6개의 공간을 가지는 int형 배열을 생성하고(+) 스캐너를 통해(+) 아래 조건에 맞게 숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		 - 조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		 - 조건2. 5의 배수는 넣지 말 것.
//		( 결과 화면 캡처 및 첨부 )
		
		int[] arr = new int[6];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~100사이의 숫자를 입력해주세요. 5의 배수는 입력하지마세요.");
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print((i+1) + "번째 숫자 : ");
			int num = s.nextInt();
			
			if(!(1 <= num && num <= 100)) {
				System.out.println("1~100사이의 숫자를 입력해주세요.");
				i--;
				continue;
			}
			
			if(num % 5 == 0) {
				System.out.println("5의 배수는 입력하지마세요.");
				i--;
				continue;
			}
			
			arr[i] = num;
		
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	

}
