package day4;

import java.util.Arrays;

public class Java3_문제풀이 {

	public static void main(String[] args) {

		int[] arr = {3, 5, 2, 4, 1};
		
		// 배열에서 가장 큰 숫자와 가장 작은 숫자의 위치 바꾸기
		// 결과 : {3, 1, 2, 4, 5};
		
		int minIndex = 0;
		int maxIndex = 0;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
