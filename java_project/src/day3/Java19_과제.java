package day3;

import java.util.Arrays;

public class Java19_과제 {

	public static void main(String[] args) {

		// 풀이시간 : 30분이내. 
		
		// 배열에서 가장 큰 숫자와 가장 작은 숫자의 위치 바꾸기
		// 결과 : {3, 1, 2, 4, 5};
		
		//1. 배열에서 큰 숫자의 위치 구하기
		//   배열에서 작은 숫자의 위치 구하기
		//2. 위치 바꾸기
		
		int[] arr = {3, 5, 2, 4, 1};
		
		int maxIndex = 0;
		int minIndex = 0;
		
		//순회
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {  // 바뀌는값   >  고정된값
				maxIndex = i;
			}
			
			if(arr[i] < arr[minIndex]) {  //33 < 77
				minIndex = i;    //작은숫자의 위치인덱스 변수에, 실제로 작은 숫자의 위치인덱스를 담는다.
			}
		}
		
		System.out.println("가장 큰 숫자는 " + arr[maxIndex] + "이고, 위치인덱스는 " + maxIndex + "입니다.");
		System.out.println("가장 작은 숫자는 " + arr[minIndex] + "이고, 위치인덱스는 " + minIndex + "입니다.");
		
		
		
		int temp = arr[maxIndex]; //arr[2] = 5       {3, 5, 2, 4, 1}
		arr[maxIndex] = arr[minIndex]; //arr[2] = 1     {3, 1, 2, 4, 1}
		arr[minIndex] = temp; //arr[4] = 5       {3, 1, 2, 4, 5}    
		
		
		System.out.println("배열에서 가장 큰 숫자와 가장 작은 숫자를 바꾼 결과는 다음과 같습니다. : ");
		System.out.println(Arrays.toString(arr));  //{3, 1, 2, 4, 5}
		
		
		
		
		
		
		//버블정렬, 선택정렬
		
	}//main

}
