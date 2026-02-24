package day17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class 연습6번문제 {

	public static void main(String[] args) {

//		20개의 공간을 가지는 배열을 생성하고(+), 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.(+)
//		그 후, 중복된 숫자가 3개이상인 수의 숫자와 개수를 출력하시오. (15점)
//		ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//		위처럼 배열이 생성된 1은 4개, 2는 6개, 3은 4개 있으므로 // 해시맵 {1:4, 2:6, 3:4... }
//		' 1 => 4개
//		  2 => 6개
//		  3 => 4개
//		' 형태로 출력
	
		Random ran = new Random();
		int[] arr = new int[20];
		
		HashMap<Integer, Integer> map = new HashMap<>(); //{1:4, 2:6, 3:4... }
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = ran.nextInt(10) + 1; //0~9+1 => 1~10  //arr[0] = 9
			
			if(map.get(arr[i]) == null) {
				map.put(arr[i], 1);
				continue;
			}
			
			map.put(arr[i], map.get(arr[i]) + 1);  //map.put(9, 1+1); => map.put(9,2);
			
			
			
//			if(map.get(arr[i]) != null) {
//				map.put(arr[i], map.get(arr[i]) + 1);  //map.put(9, 1+1); => map.put(9,2);
//			} else {
//				map.put(arr[i], 1);
//			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(map);

		//{1=5, 3=2, 4=1, 5=3, 6=1, 7=2, 8=4, 9=1, 10=1}

		System.out.println(map.keySet());
		
		for(int key : map.keySet()) {  ///map.keySet() => 해시맵의 키들을 배열로 반환해줌.
			
			if(map.get(key) >= 3) {
				String str = key + " => " + map.get(key) + "개";
				System.out.println(str);
			}
		}
		
	
	
	
	
	
	
	}

}
