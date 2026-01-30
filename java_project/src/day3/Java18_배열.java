package day3;

import java.util.Arrays;

public class Java18_배열 {

	public static void main(String[] args) {

		int[] arr = {3, 5, 2, 4, 1};
		
		// {2, 5, 3, 4, 1} //3과 2가 위치를 바꾸도록..
		
		int temp = arr[0]; //3
		arr[0] = arr[2]; //2  {2, 5, 2, 4, 1}
		arr[2] = temp; //3  {2, 5, 3, 4, 1}
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
