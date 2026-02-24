package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Test6 {
	
	public static void main(String[] args) {
		
//		6. (10점) 20개의 공간을 가지는 배열을 생성하고(+), 랜덤한 숫자 1~20사이의 값을 20개의 공간에 모두 넣으시오.(+)
//				단, 중복된 숫자는 최대 3개까지만 허용하며(+), 작업이 끝난 후 한번도 나오지 않는 숫자 목록을 출력할 것.(+)
//				(파일명 : Test6.java)
//
//			결과 : '배열에 없는 숫자 :  o o o ' (+)
		
		Random ran = new Random();
		
		int[] arr = new int[20];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(20) + 1; //0~19+1 => 1~20   //17
			
			if(map.get(arr[i]) == null) {  //map.get(17)==null;
				map.put(arr[i], 1);   //map.put(17,1);
				continue;
			}
			
			if(map.get(arr[i]) > 2) {  //map.get(17) > 3  =>map.get(17)==3
				//System.out.println("중복된 숫자는 3개까지만 가능");
				
				continue; //map.put(17,4)(X)
			}
			
			map.put(arr[i], map.get(arr[i]) + 1);  //map.put(17,1+1)=> map.put(17,2);
			
		}
		
		System.out.println("배열 목록 : " + Arrays.toString(arr));
		//[17, 13, 10, 9, 7, 9, 16, 18, 11, 7, 17, 18, 3, 10, 19, 3, 15, 10, 1, 11]
		//{1=1,3=2,7=2..} 해시맵
		
		System.out.println("숫자와 그 숫자의 갯수 : " + map);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int key : map.keySet()) {
			list.add(key);
		}
		System.out.println("나온 숫자들 : " + list); //[3, 7, 8, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20]
	
		ArrayList<Integer> totalList = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			
			totalList.add(i + 1);
		}
		
///		System.out.println(totalList); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		
		for(int i = 0; i < list.size(); i++) { // list.size() 만큼 반복.
			
			totalList.remove(list.get(i));
		}
		
		System.out.println("배열에 없는 숫자 목록(한번도 나오지않은 숫자목록) : " + totalList);
		
//		for(int i = 0; i < totalList.size(); i++) {
//			
//			for(int j = 0; j < list.size(); j++) {
//				
//				if(totalList.get(i) == list.get(j)) { //////////// 이거안된다
//					
//					totalList.remove(list.get(j));
//				}
//			}
//			
//		}
		
		
		
		
		
//		ArrayList<Integer> notVisible = new ArrayList<>();
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = 0; j < list.size(); j++) {
//				
//				if(arr[i] == list.get(j)) {
//					
//					continue;
//				}										//////////////이거 안된다.
//			}
//			
//			notVisible.add(arr[i]);
//			
//			
//		}
//		
//		System.out.println(notVisible);
		
		
	}
}
