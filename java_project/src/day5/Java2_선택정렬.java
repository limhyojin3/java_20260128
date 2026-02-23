package day5;

import java.util.Arrays;

public class Java2_선택정렬 {

	public static void main(String[] args) { //2026.02.23 복습(+)

		// 1번파일에서 작성한 코드의 규칙성을 찾아서
		// 반복문으로 다시 작성해보기
		
		/// 선택정렬 (오름차순)
		/// 가장작은값을 찾아서 맨앞의값과 위치변경
		
		///처음상태:                {2,3,5,1,4}
		///1회차:   {2,3,5,1,4} -> {1,3,5,2,4}
		///2회차:   {1,3,5,2,4} -> {1,2,5,3,4}
		///3회차:   {1,2,5,3,4} -> {1,2,3,5,4}
		///4회차:   {1,2,3,5,4} -> {1,2,3,4,5}

		int arr[] = {2, 3, 5, 1, 4};
		System.out.println(Arrays.toString(arr));
		
		for(int j = 0; j < arr.length - 1; j++) { //0~3까지 반복
			
			int minIndex = j;
			
			for(int i = j + 1; i < arr.length; i++) {
				
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			
			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
			
			System.out.println(Arrays.toString(arr));
			
		}
		
	}

}
