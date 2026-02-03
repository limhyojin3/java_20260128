package day5;

import java.util.Arrays;

public class Java5_버블정렬 {

	public static void main(String[] args) {

		int arr[] = {2, 4, 5, 1, 3};
		
		for(int j = 1; j < arr.length; j++) { //j=1~4까지 반복
			for(int i = 0; i < arr.length - j; i++) { //i=0~3까지 반복
				
				if(arr[i] > arr[i + 1]) {
					
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
