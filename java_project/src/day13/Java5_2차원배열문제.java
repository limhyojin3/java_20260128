package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Java5_2차원배열문제 {

	public static void main(String[] args) {

		//1. 4x4 크기의 정수형 배열을 생성해서
		// 1~16 사이의 랜덤한 숫자를 넣기
		
		//2. 위에서 만든거에서 중복이 없이 넣는 코드로 변경 -> 컬렉션 사용
		
		int[][] arr = new int[4][4];
		
		Random ran = new Random();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// 랜덤한 숫자 넣기
		for(int j = 0; j < arr.length; j++) {
			
			for(int i = 0; i < arr[j].length; i++) { //i=0,1,2,3
				
				arr[j][i] = ran.nextInt(16) + 1;
				
				if(list.contains(arr[j][i])) {
					i--;
					continue;
				}
				
				list.add(arr[j][i]);
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
//		for(int array[] : arr) {
//			
//			for(int num : array) {
//				
//				System.out.print(num + " ");
//			}
//			System.out.println();
//			
//		}
	}

}
