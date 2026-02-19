package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Java4_복습_배열_나의풀이 {  //복습(+)

	public static void main(String[] args) {

		// 랜덤한 숫자 1~10까지 arr 배열에 넣기.
		// 중복된 숫자는 2개까지만 허용
		HashMap<Integer, Integer> map = new HashMap<>();
		
		Random ran = new Random();
		int arr[] = new int[15]; //공간   //해시맵
		
		for(int i = 0; i < arr.length; i++) {
			
			int num = ran.nextInt(10) + 1; //10
			
			if(map.containsKey(num)) { // map.containsKey(key);
				
				if(map.get(num) == 2) {  //map.get(key) -> value 를 리턴한다.
					
					i--;
					continue;
				}
				
				map.put(num, 2);
				arr[i] = num;
				continue;
			}
			
			map.put(num, 1);
			arr[i] = num;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		
		
	}

}
