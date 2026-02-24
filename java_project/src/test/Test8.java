package test;

import java.util.ArrayList;

public class Test8 {

//	8. (5점) 두 정수 배열이 주어졌을 때, 순서는 다르더라도 동일한 숫자들이 동일한 개수만큼 포함되어 있다면 true를 반환하는 메소드를 작성하시오(+)
//	(파일명 : Test8.java)
	
	
	public static boolean sameNumberCounts(int[] arr1, int[] arr2) {  //--> 해시맵~~~
	    // 구현
		
		ArrayList<Integer> list1 = new ArrayList<>(); //[1, 2, 2, 3]
		ArrayList<Integer> list2 = new ArrayList<>(); //[3, 2, 1, 2]

		for(int i = 0; i < arr1.length; i++) {
			
			list1.add(arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			
			list2.add(arr2[i]);
		}
		
		int count = 0;
		
		for(int i = 0; i < list2.size(); i++) {
			
			if(list1.contains(list2.get(i))) {

				count++; //같은거갯수..
			}
			
		}
		
		//System.out.println(count);  //2
		
		return count == list1.size();
		
	}
	
	// 입력: [1, 2, 2, 3], [3, 2, 1, 2]
	// 출력: true

	// 입력: [1, 2, 2], [1, 2, 3]
	// 출력: false
	
	
	
	public static void main(String[] args) {

		int[] arr1 = {1,2,2,3};
		int[] arr2 = {3,2,1,2};
		System.out.println(sameNumberCounts(arr1, arr2));
		
		int[] arr3 = {1,2,2};
		int[] arr4 = {1,2,3};
		System.out.println(sameNumberCounts(arr3, arr4));
		
	}

}
