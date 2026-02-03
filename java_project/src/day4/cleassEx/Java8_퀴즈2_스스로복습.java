package day4.cleassEx;

import java.util.Arrays;
import java.util.Random;

public class Java8_퀴즈2_스스로복습 {

	public static void main(String[] args) {

		// 랜덤한 숫자 10개를 arr 배열에 넣기
		// * 홀수와 짝수의 개수는 무조건 5개씩
		// * 랜덤한 숫자의 범위는 1~20
		// 중복은 허용한다.

	
		int[] arr = new int[10];
		
		Random ran = new Random();
		
		//int arr[0] = ran.nextInt(20) + 1; //0~19+1 = 1~20
		//int arr[1] = ran.nextInt(20) + 1;
		
		int oddCnt = 0;
		int evenCnt = 0;
		
		// 정상로직부터 쭉 다 적어보고, 검증을 사이사이에 함. 
		for(int i = 0; i < arr.length; i++) {
			
			int random = ran.nextInt(20) + 1; //1~20  랜덤한 숫자 뽑기
			
			//검증
			if(random % 2 == 1) {
				
				if(oddCnt == 5) {
					i--;  //i++로 가기전에 i--해준다.
					continue; //i++ 로 간다.
				}
				
				//정상로직
				oddCnt++;
				
			} else { // 짝수인경우,,
				
				if(evenCnt == 5) {
					i--;  //i++로 가기전에 i--해준다.
					continue; //i++ 로 간다.
				}
				
				
				//정상로직
				evenCnt++;
			}
			
			//정상로직
			arr[i] = random;
		} //for문 종료
		
		System.out.println("홀수의 개수: " + oddCnt);
		System.out.println("짝수의 개수: " + evenCnt);
		
		System.out.println(Arrays.toString(arr));
	
	
	}

}
