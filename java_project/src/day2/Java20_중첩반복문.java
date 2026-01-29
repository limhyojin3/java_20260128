package day2;

public class Java20_중첩반복문 {

	public static void main(String[] args) {

		// 구구단
		
		for(int i = 2; i <= 9; i++) {              // i = 2,3,... 9
			
			System.out.println("====" + i + "단====");
			
			for(int j = 1; j <= 9; j++) {          // j = 1,2,3,... 9
				System.out.println(i + "*" + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		
		
		
	} //main

}
