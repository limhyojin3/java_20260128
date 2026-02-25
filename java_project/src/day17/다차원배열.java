package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class 다차원배열 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int arr[][] = new int[3][5];
		
		ArrayList<HashMap<int[], Integer>> list = new ArrayList<>(); //[{arr1=합}, {arr2=합}, {arr3=합}]
		
		
		
		for(int j = 0; j < arr.length; j++) {
			
			HashMap<int[], Integer> map = new HashMap<>(); //{arr1=합}
			
			int sum = 0;
			for(int i = 0; i < arr[j].length; i++) {
				
				arr[j][i] = ran.nextInt(10)+1;
				sum = sum + arr[j][i];
			}
			
			map.put(arr[j], sum);
			list.add(map);
			
			System.out.println((j+1) + "번째 배열 = " + Arrays.toString(arr[j]) + ", 그 배열안의 숫자들의 합 : " + sum);
			
		}
		
//		int maxSum = map.get(arr[0]); //합1
		
		for(int i = 0; i < list.size(); i++) {
			
			HashMap<int[], Integer> map = list.get(i);  //list.get(0)=> arr1
			
			
			
			
			
		}
	
		
		//합이 모두 다르다고 가정 => 합이 가장 큰 배열 하나
		
		
	}

}
