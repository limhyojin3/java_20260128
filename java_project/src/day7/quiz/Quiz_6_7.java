package day7.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_6_7 {

	public static void main(String[] args) {

//		6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
//		단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
//			=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요
		
//		7. 6번에서 정의한 배열에서 홀수들의 합과 짝수들이 합의 차이 구하기
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하여 배열을 생성합니다.");
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {  //i=2
			
			System.out.print((i+1) + "번째 숫자를 입력하세요 : ");
			int input = s.nextInt();  //5
			
			//검증
			if(input <= 0) {
				System.out.println("1이상의 수를 입력해주세요.");
				i--; //i++로 가기전에 i--해준다.
				continue;//i++로간다
			}
			
			int duplicationKey = 0; //0은 거짓
			
			//중복 검증이 어렵네... ->일단 키를 만들어서해결.
			//asdsadasdadsa
			for(int j = 0; j < i; j++) { //arr[2] 0,1번  인덱스<2-> j<i
				
				if(input == arr[j]) {  
					System.out.println("중복된 숫자가 있습니다. 다른 숫자를 입력해주세요. ");
					duplicationKey = 1; //1은 참
					break; //for 문을 빠져나감.. ?(ok)
				}
			} //중복된 숫자가 있는지 확인
			
			if(duplicationKey == 1) {
				i--; //i++로 가기전에 i--해준다.
				continue; //i++로 간다.
			} 
			
			//정상로직
			arr[i] = input;
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 1) {
				oddSum += arr[i];
			}else {
				evenSum += arr[i];
			}
		}
		
		int difference = (oddSum - evenSum) < 0 ? evenSum - oddSum : oddSum - evenSum;
		
		System.out.println("홀수들의 합 : " + oddSum);
		System.out.println("짝수들의 합 : " + evenSum);
		System.out.println("홀수들의 합과 짝수들의 합의 차이 : " + difference);
		
		
		
		
	}

}
