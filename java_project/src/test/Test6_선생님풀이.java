package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Test6_선생님풀이 {

	public static void main(String[] args) {

		
		Random ran = new Random();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[20];
		
		
		for(int i = 1; i <= arr.length; i++) {
			map.put(i, 0);
		}
		
		System.out.println("map(초기화) = " + map);
		
		
		
		
		for(int i = 0; i < arr.length; i++) {
			int ranNum = ran.nextInt(20) + 1;
			arr[i] = ranNum;
		}
		
		System.out.println("arr = " + Arrays.toString(arr));
		//[13, 3, 5, 11, 6, 11, 1, 19, 6, 1, 17, 14, 9, 16, 8, 7, 3, 12, 12, 18]
		
		
		for(int i = 0; i <arr.length; i++) {
			int ranNum = ran.nextInt(20)+1;
			
			if(map.get(ranNum) > 2) {
				i--;
				continue;
			}
			
			map.put(ranNum, map.get(ranNum) + 1);
			arr[i] = ranNum;
		}
		
		System.out.println("map = " + map);

		
		System.out.print("배열에 없는 숫자 : ");
		for(int i = 1; i <= arr.length; i++) {
			if(map.get(i) == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
	}

}
