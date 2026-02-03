package day5;

import java.util.Arrays;

public class Java6_퀴즈 {

	public static void main(String[] args) {

		// 문제를 풀이할 때,
		// 별다른 조건이 없으면(ex, 선택정렬을 쓰세요)
		// Arrays.sort(arr);
		
		int arr[] = {2, -4, 5, -1, -3};
		
//		Arrays.sort(arr); // 오름차순
//		System.out.println(Arrays.toString(arr));
		
		// 선택 or 버블 정렬 편한 방식 이용해서
		// 배열을 정렬. 단, 음수를 양수 취급할 것 =>{-1, 2, -3, -4, 5}
		// => 절댓값 기준으로 오름차순 정렬
		
		int negaArr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			
			if(arr[i] < 0) {
				negaArr[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(negaArr));
		
		int newArr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			newArr[i] = Math.abs(arr[i]);
		}
		System.out.println(Arrays.toString(newArr));//[4, 3, 1, 2, 5]
		
		// 선택정렬(오름차순)
		
		for(int j = 0; j < newArr.length - 1; j++) { //0~3까지 반복
			
			int minIndex = j;
			for(int i = j + 1; i < newArr.length; i++) {
				if(newArr[minIndex] > newArr[i]) {
					minIndex = i;
				}
			}
			int temp = newArr[j];
			newArr[j] = newArr[minIndex];
			newArr[minIndex] = temp;
			System.out.println(Arrays.toString(newArr));
			
		}
		System.out.println(Arrays.toString(negaArr));
		
		System.out.println(Arrays.toString(arr));
		
		
		for(int i = 0; i < 5; i++) { //i=0~4까지 반복
			
			for(int j = 0; j < 5; j++) {
				if(Math.abs(negaArr[i]) == newArr[j]) { //변수가 2개! i, j
														//존재하는지 확인~!

					newArr[j] = negaArr[i];
					
				}
			}
		}
		arr = newArr;
		System.out.println(Arrays.toString(arr));
	}
	

}
