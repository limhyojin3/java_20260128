package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Function { //복습(+)
	
	Function() {
		System.out.println("Function 객체를 생성했습니다.");
	}

	static int max(int x, int y) {
		return x > y ? x : y;
	}

	int min(int x, int y) {
		return x < y ? x : y;
	}

	static int random(int x){
		
		Random ran = new Random();
		return ran.nextInt(x) + 1; //1~x 사이 숫자
	}

	static int sum(int[] arr) {
		
		int sum = 0;
		
		for(int num : arr) {
			sum = sum + num;
		}
		
		return sum;
	}

	
	// int[] arr = {3, 5, -4, 10, -9};
	// 음수, 양수 상관없이 내림차순
	// => {10, -9, 5, -4, 3}
	
	// [-3,-5,-4,-10,-9]
	// Arrays.sort(오름차순)함수 -> [-10,-9,-5,-4,-3]
	// ArrayList = [3,5,10] 양수 담아둔다
	// ArrayList.contains(-(-10)) -> true 이면
	// arr[i] = -arr[i];
	
	static void sort(int[] arr) {  //복습(+)
		
		ArrayList<Integer> list = new ArrayList<>(); //[3, 5, 10]
		
		for(int i = 0; i < arr.length; i++) {
//			arr[i] = arr[i] > 0 ? -arr[i] : arr[i];
//			arr[i] = -Math.abs(arr[i]);
			
			if(arr[i] > 0) {
				list.add(arr[i]);
				arr[i] = -arr[i];
			}
		
		}
		//arr=[-3,-5,-4,-10,-9] ,//list=[3,5,10]
		Arrays.sort(arr); // arr=[-10,-9,-5,-4,-3]
		System.out.println(Arrays.toString(arr)); // arr = [-10,-9,-5,-4,-3]
		System.out.println(list); //list=[3, 5, 10]
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = list.contains(-arr[i]) ? -arr[i] : arr[i];
		
//			if(list.contains(-arr[i])) {
//			arr[i] = -arr[i];
//		}
			
		}// arr = [10,-9,5,-4,3]
	}
}
