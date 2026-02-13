package day13;

import java.util.Arrays;

public class Java4_2차원배열 { // 복습(+)

	public static void main(String[] args) {

		int arr[][] = new int[3][5]; // 3행 5열
		int arr2[][] = {
				{5,4,1,2,3},     // 크기가 5인 배열(1차원 배열이 int 형을 5개 갖고있음)
				{10,5,8,7,1},    // 크기가 5인 배열
				{15,30,40,20,16} // 크기가 5인 배열
			};  //크기가 3인 배열(2차원 배열이 '1차원 int 형 배열'을 '3'개 갖고있음)
		
		
		for(int j = 0; j < arr2.length; j++) {   //arr2크기만큼반복
			
			for(int i = 0; i < arr2[j].length; i++) {
				System.out.print(arr2[j][i] + " ");
			}
			
			System.out.println();
			
		}
		
		for(int array[] : arr2) {

			for(int num : array) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
//		for(int i = 0; i < arr2[0].length; i++) {
//			System.out.print(arr2[0][i] + " ");
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < arr2[1].length; i++) {
//			System.out.print(arr2[1][i] + " ");
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < arr2[2].length; i++) {
//			System.out.print(arr2[2][i] + " ");
//		}
//		
//		System.out.println();
//		System.out.println(arr2[0][2]);
//		System.out.println(Arrays.toString(arr2[1])); //[10, 5, 8, 7, 1]
		
//		    [
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//			]
	
	
	}

}
