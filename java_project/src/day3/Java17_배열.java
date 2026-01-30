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
			
			arr[i] = ran.nextInt(45) + 1;  //1~45   //arr[0]=39   //랜덤숫자
		
			// i=0 (j(X)), i=1(j=0), i=2(j=0,j=1)
			
			
			// 중복되는게 있는지 비교
			
			for(int j = 0; j < i; j++) {
				// 검증
				if (arr[i] == arr[j]) { //i=2 (j=0,j=1) -> arr[2] (arr[0] arr[1])
					i--;    
					break;  //중복 찾으면 바로 break;
							//안쪽 반복문(for 문) 빠져나감 ->바깥쪽 증감식으로간다.
				}
			}//안쪽 반복문(for 문)
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
