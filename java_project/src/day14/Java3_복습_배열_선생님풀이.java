package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Java3_복습_배열_선생님풀이 {  //복습(+)

	public static void main(String[] args) {

		// 랜덤한 숫자 1~10까지 arr 배열에 넣기.
		// 중복된 숫자 X
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Random ran = new Random();
		int arr[] = new int[10]; //공간
		
		for(int i = 0; i < arr.length; i++) {
			
			int num = ran.nextInt(10) + 1; //1~10사이 랜덤숫자
			
			if(list.contains(num)) { //1
				i--;
				continue;
			}
			
			list.add(num);
			arr[i] = num;
		} //arr 배열 채워짐
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
