package day7;

import java.util.Arrays;
import java.util.Random;

public class Java98_문제풀이 {

	public static void main(String[] args) {

		// 1~30 사이 숫자를 10개의 공간을 가지는 배열에 넣기
		
		Random ran = new Random();
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(30)+1; //0~29+1 => 1~30
		}
		System.out.println(Arrays.toString(arr));
		
		//arr = {17,1,9,17,14,28,28,6,14,10};
		
		int oddArr[]; // 홀수들 {17,1,9,17}
		int evenArr[]; // 짝수들 {14,28,28,6,14,10}
		
		int oddCnt = 0;
		int evenCnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 1) {
				oddCnt++;
			} else {
				evenCnt++;
			}
		}
		
		oddArr = new int[oddCnt];
		evenArr = new int[evenCnt];
		
		int oddIndex = 0;
		int evenIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 1) {
				oddArr[oddIndex] = arr[i];
				oddIndex++;
			} else {
				evenArr[evenIndex] = arr[i];
				evenIndex++;
			}
		}
		
		System.out.println("홀수만으로 이루어진 배열 : " + Arrays.toString(oddArr));
		System.out.println("짝수만으로 이루어진 배열 : " + Arrays.toString(evenArr));
		
		
		
	}

}
