package day3;

public class Java14_배열퀴즈 {

	public static void main(String[] args) {

		// 가장 큰 숫자의 위치 값(index) 찾기
		int[] arr = {5, 3, 8, 4, 2};
		
		int max = 0; // 큰 숫자 위치 백업
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] > arr[max]) { // arr[2] > arr[max] == 8 > 5 -> max = 2;
				max = i;
			}
		}
		System.out.println("가장 큰 숫자는 " + arr[max] + "이고, "
				+ "인덱스는 " + max + "입니다.");
		
		
		
		
	}

}
