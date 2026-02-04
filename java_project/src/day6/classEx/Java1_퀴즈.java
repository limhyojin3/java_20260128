package day6.classEx;

import java.util.Arrays;
import java.util.Scanner;

public class Java1_퀴즈 {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 10, 5, 9, 2};
		ArrayFunc func = new ArrayFunc();
		int max = func.max(arr);
		System.out.println(max); // 10
		
		
		int sum = func.arrSum(arr);
		System.out.println(sum); // 배열의 모든 수의 합
		
		
		// 5개의 공간을 가지는 배열 생성 후 
		// 랜덤한 숫자(1~20) 5개 넣기
		int[] ranArr = func.createRanArr(5, 50, 90);
		System.out.println(Arrays.toString(ranArr));
		System.out.println();
		
		// 5개의 공간(인자)을 가지는 배열을 리턴
		// 배열의 값들은 사용자가 직접 입력해서 넣도록
		// ex) 공간이 5면 5개 입력받아서 순서대로 넣기
		// 1~30 사이 숫자가 아니면 다시 입력하도록
		
//		int newArr[] = func.createArr(5);
//		System.out.println("완성된 배열은 다음과 같습니다. : " + Arrays.toString(newArr));
		
		
		
		int list[] = {3, 5, -4, -2, 6, -8};
		int positiveArr[] = func.createPositiveArr(list);
		System.out.println(Arrays.toString(positiveArr));
		System.out.println();
		
		// 양수들만 담긴 배열 리턴
		// {3, 5, 6}
		
		
		// int arr[] = {3, 10, 5, 9, 2};
		int oddArr[] = func.createOddArr(arr);
		System.out.println(Arrays.toString(oddArr));
		// 홀수들의 배열로 리턴
		// {3, 5, 9}
		
		
	}
}

//class ArrayFunc1 {
//	
//}
