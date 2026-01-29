package day2;

public class Java19_반복문퀴즈 {

	public static void main(String[] args) {

		// for + if 퀴즈
		// 1. 1부터 100까지 숫자 중 3의 배수만 출력
		
//		for(int i = 1; i <= 100; i++) { // i=1,2,...100
//			
//			if (i % 3 == 0) {             // i가 3의 배수라면
//				System.out.println(i);    // i를 출력
//			}
//			
//		}
		
		// 2. 10부터 1까지 숫자 출력
//		for(int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
		
		// 3. 1부터 100까지 숫자 중 홀수들의 합과 짝수들의 합
		
		//짝수 = evenNum,  홀수 = oddNum
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1; i <= 100; i++) {  //i = 1,2, .. ,100
			if(i % 2 == 0) {             //i 가 짝수라면
				evenSum = evenSum + i;   //evenSum = 0 + 2 + 4... +100
			} else {
				oddSum = oddSum + i;     //oddSum = 0 + 1 + 3... +99
			}
		}
		System.out.println("1부터 100까지 홀수들의 합 : " + oddSum);
		System.out.println("1부터 100까지 짝수들의 합 : " + evenSum);
		
		
//		int oddSum = 0;
//		int evenSum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 1) {
//				//System.out.println(i);
//				oddSum = oddSum + i;
//			} else {
//				evenSum = evenSum + i;
//			}
//		}
//		System.out.println(oddSum);
//		System.out.println(evenSum);
//		
		
		
		
	} // main

}
