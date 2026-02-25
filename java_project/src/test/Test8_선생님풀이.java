package test;

import java.util.Arrays;

public class Test8_선생님풀이 {

	public static boolean sameNumberCounts(int[] arr1, int[] arr2) {
	
		// [5,2,3,2,1], [1,3,2,2,5]
		// [1,2,2,3,5], [1,2,2,3,5] 오름차순으로 정렬..
		
		if(arr1.length == arr2.length) {
			
			///Arrays.sort(int배열) => 배열을 오름차순으로 정렬
			Arrays.sort(arr1);  
			Arrays.sort(arr2);
			
			for(int i = 0 ; i < arr1.length; i++) {
				
				if(arr1[i] != arr2[i]) {
					return false;
				}
			}
			
			
		} else {
			return false;
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 2, 3};
		int arr2[] = {3, 2, 1, 2};
		boolean result = sameNumberCounts(arr1, arr2);
		System.out.println(result);
		
	}

}
