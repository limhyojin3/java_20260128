package day7;

import java.util.Arrays;

public class ArrayFunc {
	
	static void sort(int[] arr) {
		
		
		
		for(int j = 1; j < arr.length; j++) { //j=1~4까지 반복
			for(int i = 0; i < arr.length - j; i++) { //i=0~3까지 반복
				
				if(arr[i] > arr[i + 1]) {
					
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		
//		return arr; // 참조값 반환
	}

}
