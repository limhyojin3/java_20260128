package day3;

public class Java15_배열퀴즈 {

	public static void main(String[] args) {

		// 가장 작은 숫자의 위치 값(index) 찾기
		int[] arr = {5, 3, 8, 4, 2};
		
		int min = 0;  // arr[0] = 5;
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] < arr[min]) {  //arr[1] < arr[0] == 3 < 5 --> min = 1;
				min = i;
			}
		}  //min => 4
		
		System.out.println("가장 작은 숫자는 " + arr[min] + "이고, 인덱스는 " + min + "입니다.");
		
	} //main
	//  arr[2] < arr[1] == 8 < 3 --> min = 1;
	

}
