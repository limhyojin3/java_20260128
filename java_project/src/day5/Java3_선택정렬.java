package day5;

import java.util.Arrays;

public class Java3_선택정렬 {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 5, 1, 4};
		/// 선택정렬
		/// 내림차순 : 가장 큰숫자가 맨 앞에.
		// 1회차 {2, 3, 5, 1, 4} -> {5, 3, 2, 1, 4}
		// 2회차 0번 인덱스까지 고정 {5, 3, 2, 1, 4} -> {5, 4, 2, 1, 3} 
		// 3회차 1번 인덱스까지 고정 {5, 4, 2, 1, 3} -> {5, 4, 3, 1, 2}
		// 4회차 2번 인덱스까지 고정 {5, 4, 3, 1, 2} -> {5, 4, 3, 2, 1}
		
		
		for(int j = 0; j < arr.length - 1; j++) {
			int maxIndex = j;
			for(int i = j + 1; i < arr.length; i++) {  //i 는 위치인덱스
				
				//검증
				if(arr[maxIndex] < arr[i]) {
					maxIndex = i;//가장 큰 숫자를 가리키는 위치인덱스를 갱신
				}
			} //for 문 종료되면 maxIndex가 갱신되어있음
			
			int temp = arr[j]; 
			arr[j] = arr[maxIndex]; 
			arr[maxIndex] = temp; 
			System.out.println(Arrays.toString(arr));
		}
		
//		// 1회차
//		int maxIndex = 0;
//		for(int i = 1; i < arr.length; i++) {  //i는 위치인덱스
//			
//			//검증
//			if(arr[maxIndex] < arr[i]) {
//				maxIndex = i;//가장 큰 숫자를 가리키는 위치인덱스를 갱신
//			}
//		} //for문 종료되면 maxIndex가 갱신되어있음
//		
//		int temp = arr[0]; //temp = 2;
//		arr[0] = arr[maxIndex]; //arr[0] = 5; {2, 3, 5, 1, 4} -> {5, 3, 5, 1, 4}
//		arr[maxIndex] = temp; //arr[2] = 2; {5, 3, 5, 1, 4} -> {5, 3, 2, 1, 4}
//		System.out.println(Arrays.toString(arr));
//		
//		// 2회차
//		maxIndex = 1;
//		for(int i = 2; i < 5; i++) {
//			if(arr[maxIndex] < arr[i]) {
//				maxIndex = i;
//			}
//		}
//		
//		temp = arr[1];
//		arr[1] = arr[maxIndex];
//		arr[maxIndex] = temp;
//		System.out.println(Arrays.toString(arr));
//		
//		// 3회차
//		maxIndex = 2;
//		for(int i = 3; i < 5; i++) {
//			if(arr[maxIndex] < arr[i]) {
//				maxIndex = i;
//			}
//		}
//		
//		temp = arr[2];
//		arr[2] = arr[maxIndex];
//		arr[maxIndex] = temp;
//		System.out.println(Arrays.toString(arr));
//		
//		// 4회차
//		maxIndex = 3;
//		for(int i = 4; i < 5; i++) {
//			if(arr[maxIndex] < arr[i]) {
//				maxIndex = i;
//			}
//		}
//		
//		temp = arr[3];
//		arr[3] = arr[maxIndex];
//		arr[maxIndex] = temp;
//		System.out.println(Arrays.toString(arr));
	}

}
