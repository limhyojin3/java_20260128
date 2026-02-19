package day5;

import java.util.Arrays;

public class Java6_퀴즈_선생님풀이 {

	public static void main(String[] args) {

		int arr[] = {2, -4, 5, -1, -3}; //->[-1, 2, -3, -4, 5]
		
		//버블정렬 개념을 이용함!
//		for(int j = 1; j < arr.length; j++) { //j=1~4까지 반복
//			for(int i = 0; i < arr.length - j; i++) { //i=0~3까지 반복
//				
//				// 변수를 새로 선언해서, 원래의 배열에는 영향을 미치지않는다.
//				int x = arr[i] < 0 ? -arr[i] : arr[i];
//				int y = arr[i+1] < 0 ? -arr[i+1] : arr[i+1];
//				
//				if(x > y) {  // 마이너스를 떼고 비교.  더 큰수를 뒤로 보낸다~
//					
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(arr)); //[-1, 2, -3, -4, 5]
//		}
		
		//버블정렬 개념을 이용함!
//		for(int j = 1; j < arr.length; j++) { //j=1~4까지 반복
//			for(int i = 0; i < arr.length - j; i++) { //i=0~3까지 반복
//				
//				if(Math.abs(arr[i]) > Math.abs(arr[i + 1])) { 
//										//비교할때만 절대값 씌우고 비교. 더 큰수를 뒤로보낸다
//					
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(arr));//[-1, 2, -3, -4, 5]
//		}
		
		// {2, 4, 1, 3, 5}, {2, -4, -1, -3, 5}
		
		//선택정렬을 이용함!
		for(int j = 0; j < arr.length - 1; j++) { //0~3까지 반복
			
			int minIndex = j;
			for(int i = j + 1; i < arr.length; i++) {
				if(Math.abs(arr[minIndex]) > Math.abs(arr[i])) {
					minIndex = i;
				}
			}
			//가장 작은 값이랑 자리바꿈..
			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
			
		}
	}

}
