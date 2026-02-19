package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Java3_복습_배열_나의풀이 { //복습(+)

	public static void main(String[] args) {  

		// 랜덤한 숫자 1~10까지 arr 배열에 넣기.
		// 중복된 숫자 X
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
//		System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		Random ran = new Random();
		int arr[] = new int[10]; //공간
		
		for(int i = 0; i < arr.length; i++) {
			
			int ranNum = ran.nextInt(10) + 1; //1~10사이 랜덤숫자
			
			if(!(list.contains(ranNum))) {
				i--;
				continue;
			}
			
			arr[i] = ranNum; //[10,0, ..0] //배열에 랜덤숫자 채워넣기
//			list.remove(ranNum); 
			///-> 제미나이한테 물어보기? (+) IndexOutOfBoundsException: Index 9 out of bounds for length 9
			list.remove(Integer.valueOf(ranNum));  //인덱스로 인식되지않고 데이터값으로 인식하도록 Integer.valueOf(); //list=[1, 2, 3, 4, 5, 6, 7, 8, 9]
		} //arr 채워짐 [10,0,...]
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
