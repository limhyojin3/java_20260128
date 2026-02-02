package day4;

import java.util.Arrays;

public class Java6_Math클래스 {

	public static void main(String[] args) {

//		int max = Math.max(10, 20);
//		System.out.println(max);
//		
//		Math.abs(-10);
		
		int arr[] = {5, -3, 10, -15, 6};
		// 1.배열 안에 있는 모든 숫자를 양수로 변경
		//   음수인 숫자들을 양수로 (-3 => 3)
		// 2.모두 양수인 상태에서 가장 큰 값 찾기
		
		int max = Math.abs(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Math.abs(arr[i]);  //arr[i] 의 절대값을  arr[i]에 담는다.
			
			// 갱신
			if(Math.abs(arr[i]) > max) {
				max = Math.abs(arr[i]);
			}
		}
		
		System.out.println(Arrays.toString(arr)); //arr[] = [5,3,10,15,6]
		System.out.println("위의 절댓값 배열에서 가장 큰 숫자는 " + max + "입니다.");
		
		
		
		// 2.모두 양수인 상태에서 가장 큰 값 찾기
		
//		int max = arr[0];
//		
//		for(int i = 0; i < arr.length; i++) { //배열의 첨부터 끝까지.
//			
//			if(arr[i] > max) { // arr의 i인덱스의 값 > max(arr의 0인덱스의값)  라면,
//				max = arr[i];   //max 를 갱신(더 큰값으로 갱신)
//			}
//		}
//		
//		System.out.println("이 배열에서 가장 큰 숫자는 " + max + "입니다.");
		
		
	}

}
