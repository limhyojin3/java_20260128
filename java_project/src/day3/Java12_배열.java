package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java12_배열 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		// ===== 입력받은 5개의 숫자의 평균을 구하기 =====
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		double avg = (double) sum / arr.length;
		System.out.println("5개 숫자의 평균은 " + avg + "입니다.");
		
		
		
		
		
		
	}

}
