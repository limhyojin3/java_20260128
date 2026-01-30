package day3;

import java.util.Arrays;
import java.util.Random;

public class Java17_배열 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] arr = new int[6];
		
		//1~45 사이 숫자 넣어주기
		//중복추첨되지않도록
		
		//[39,29,29,11,12,13]
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = ran.nextInt(45) + 1;  //1~45   //arr[0]=39
		
			// i=0 (j(X)), i=1(j=0), i=2(j=0,j=1)
			
			for(int j = 0; j < i; j++) {
				// 검증
				if (arr[i] == arr[j]) {
					i--;
					break; //안쪽 반복문(for 문) 빠져나감
				}
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
