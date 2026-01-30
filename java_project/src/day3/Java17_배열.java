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
		
		for(int i = 0; i < arr.length; i++) {   //배열 전부 채울거니까.
			
			arr[i] = ran.nextInt(45) + 1;  //1~45     //랜덤숫자 뽑아내기
		
			//arr[0] = 39;
			
			
			// 중복되는게 있는지 비교할건데~~  -> 배열 순회하면서 전부 다 할 필요는 없음.
			// i=0 (j(X)), i=1(j=0), i=2(j=0,j=1)   //바로 이전에 뽑은것까지만 순회
			
			
			//안쪽 반복문
			for(int j = 0; j < i; j++) {    //바로 이전에 뽑은것까지만 순회
				
				
				
				//i=2 (j=0,j=1) -> arr[2] (arr[0] arr[1])
				
				
				//지금 뽑은거랑  이전에 뽑은 것들이랑 비교함.
				if (arr[i] == arr[j]) {    //왼쪽이 고정된거  ==  오른쪽이 바뀌는거
					
					
					i--;     //3.증감식(i++)으로 가기전에 i-- 해주면 i 그대로임.
					
					break;   //1.조건식 만족하면 (즉, 중복 찾으면) 바로 break;
							 //굳이 뒤에꺼 다 안봐도됨.
					         //2.안쪽 반복문(for 문) 빠져나감 -> 4.바깥쪽 증감식(i++)으로간다.
					
					
				}
				
			}//안쪽 반복문(for 문)
			
			
		}//바깥 반복문(for 문) -> 배열 다 채워짐.
		System.out.println(Arrays.toString(arr));
		
	}

}
