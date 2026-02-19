package day5;

import java.util.Arrays;

public class Java2_선택정렬 {

	public static void main(String[] args) {

		/// 선택정렬 (오름차순)
		// 1번파일에서 작성한 코드의 규칙성을 찾아서
		// 반복문으로 다시 작성해보기
		
		int arr[] = {2, 3, 5, 1, 4};
		
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
