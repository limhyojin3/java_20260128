package day6.classEx;

import java.util.Random;
import java.util.Scanner;

public class ArrayFunc {
	
	public int max(int[] arr) {
		
		int max = arr[0];
		//{3, 10, 5, 9, 2}
		for(int i = 1; i < arr.length; i++) {
			
			max = Math.max(max, arr[i]);
		}
		
		return max;
	}
	
	public int arrSum(int[] arr){
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	
	public int[] createRanArr(int size, int first, int last) {
		
		Random ran = new Random();
		
		int arr[] = new int[size];
//		{0,0,0,0,0}
		
		
											  // ran(last - first + 1) + first 
		for(int i = 0; i < arr.length; i++) { //50~90 사이 숫자 : 0~40 + 50 -> ran(41) + 50
			arr[i] = ran.nextInt(last - first + 1) + first; //0~19+1 => 1~20 사이 숫자
		}
		return arr;
	}
	
	
	public int[] createArr(int size) {
		
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int[size];
		System.out.println("=== 숫자 " + size + "개를 입력합니다. ===");
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print((i+1) + "번째 숫자를 입력하세요 : ");
			int input = s.nextInt();
			
			//검증
			if(!(1 <= input && input <= 30)) {
				System.out.println("1~30 사이의 숫자를 입력해주세요.");
				System.out.println();
				i--; //i++ 로 가기전에 i--해준다.
				continue; //i++로 이동
			}
			//정상 로직
			arr[i] = input;
		}
		
		return arr;
		
	}
	
	//{3, 5, -4, -2, 6, -8}
	public int[] createPositiveArr(int[] list) {
			
		int size = 0;
		
		
		for(int i = 0; i < list.length; i++) { //i=0~5까지 반복
			
			if(list[i] > 0) {
				size++;
			}
		}
		
		int[] positiveArr = new int[size];  //배열 자체의 크기는 한번 만들어지면 바뀔수없다.
		
		int j = 0;
		//{3, 5, -4, -2, 6, -8}
		for(int i = 0; i < list.length; i++) { //i=0~5까지 반복
			
			if(list[i] > 0) {
				positiveArr[j] = list[i];
				j++;
			}
		}
		
		return positiveArr;
	}
	
	
	public int[] createOddArr(int[] arr) {
		
		int[] oddArr;
		
		int size = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 1) {
				size++;
			}
		}
		
		oddArr = new int[size];
		
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 1) {
				
				oddArr[j] = arr[i]; 
				j++;
			}
		} //oddArr 완성
		
		return oddArr;
	}

}
