package day14;

import java.awt.MenuComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Java4_복습_배열_선생님풀이 { //복습(+)

	public static void main(String[] args) {  

		// 랜덤한 숫자 1~10까지 arr 배열에 넣기.
		// 중복된 숫자는 2개까지만 허용
		// {1 : 0, 2 : 0 .. , 10 : 0}
		HashMap<Integer, Integer> map = new HashMap<>(); //{key=value, key=value, ... , key=value}
		
		for(int i = 1; i <= 10; i++) {
			map.put(i, 0);
		}
		
		System.out.println(map); //{1=0, 2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0, 10=0}
		

		Random ran = new Random();
		int arr[] = new int[15]; //공간   //해시맵
		
		for(int i = 0; i < arr.length; i++) {
			
			int num = ran.nextInt(10) + 1; //1~10사이 랜덤숫자
			
			if(map.get(num) >= 2) { //value >= 2
				i--;
				continue;
			} 
			
			map.put(num, map.get(num) + 1); /// key=num, value=map.get(num) + 1;
			
			arr[i] = num;
			
			///** map.get(key); -> value 를 리턴
			///   map.put(key,value);
			
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		
	}

}
