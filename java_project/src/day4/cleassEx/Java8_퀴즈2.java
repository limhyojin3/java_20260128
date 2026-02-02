package day4.cleassEx;

import java.util.Arrays;
import java.util.Random;

public class Java8_퀴즈2 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		
		// 랜덤한 숫자 10개를 arr 배열에 넣기
		// * 홀수와 짝수의 개수는 무조건 5개씩
		// * 랜덤한 숫자의 범위는 1~20
		// 중복은 허용한다.
		
		Random ran = new Random();
		
		int oddCnt = 0;
		int evenCnt = 0;
		
		//고정 -> 검증 -> 반복문 도입
		
		
		
		for(int i = 0; i < arr.length; i++) {  
			
			int random = ran.nextInt(20) + 1;  //13,14..
			
			if(random % 2 == 1) {  // 홀수,,
				
				if(oddCnt == 5) {   //홀수에서 검증..
					i--;      //i++ 증감식으로 가기전에 i--; 해준다.
					continue;  //바로 증감식으로 간다.
				}
				
				oddCnt++;
				
			} else {    //짝수,,
				
				if(evenCnt == 5) {  //짝수에서 검증..
					i--;
					continue;
				}
				
				evenCnt++;
			}
			
			// 정상로직 
			arr[i] = random;
			
		} // for문 종료
		
		System.out.println("짝수의 개수는 " + evenCnt);
		System.out.println("홀수의 개수는 " + oddCnt);
		System.out.println(Arrays.toString(arr));

	}//main
}
