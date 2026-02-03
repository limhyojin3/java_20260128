package day5;

import java.util.Arrays;

public class Java1_선택정렬 {

	public static void main(String[] args) {

		// 선택정렬
		// 배열의 값들 중 가장 작은 수를 찾아서
		// 맨 앞의 값과 위치 변경

		int arr[] = {2, 3, 5, 1, 4};
		
		
		// 1회차 {2, 3, 5, 1, 4} -> {1, 3, 5, 2, 4}
		int minIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[minIndex] > arr[i]) {  //나름고정된값 > 계속바뀌는값
				minIndex = i;   //실제 작은 숫자의 위치인덱스(i)
					//minIndex(가장 작은 숫자를 가리키는 위치인덱스를 의미함)를 갱신
			}
		} //이 과정이 끝나면 minIndex가 갱신된 상태.
		
		int temp = arr[0]; //2
		arr[0] = arr[minIndex]; //arr[0] = 1; {2, 3, 5, 1, 4} ->{1, 3, 5, 1, 4}
		arr[minIndex] = temp;  //arr[3] = 2; {1, 3, 5, 1, 4} -> {1, 3, 5, 2, 4}
		System.out.println(Arrays.toString(arr)); //{1, 3, 5, 2, 4}
		
		
		
		// 2회차 {1, 3, 5, 2, 4} -> {1, 2, 5, 3, 4}
		
		minIndex = 1;
		for(int i = 2; i < arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[1];
		arr[1] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		
		// 3회차 {1, 2, 5, 3, 4} -> {1, 2, 3, 5, 4}
		
		minIndex = 2;
		for(int i = 3; i < arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[2];
		arr[2] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		// 4회차 {1, 2, 3, 5, 4} -> {1, 2, 3, 4, 5}
		
		minIndex = 3;
		for(int i = 4; i < arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[3];
		arr[3] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
