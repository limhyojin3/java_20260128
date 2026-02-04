package day6;

public class Java99_퀴즈풀이 {

	public static void main(String[] args) {
		
		// 배열 : {3, 7, 10, 6, 15, 2}
		// 6. 위 배열을 선언하고 배열 내에서 짝수 중 가장 큰 값의 위치를 출력하시오.
		
		int arr[] = {3, 7, 10, 6, 15, 2};
		
		int evenIndex = 0; // 짝수의 위치인덱스 -> 짝수 중 가장 큰 값을 나타내는 위치 인덱스를 의미하는 변수
		
		for(int i=0; i<6; i++) { //순회
			
			if(arr[i] % 2 == 0) { // 짝수 값을 갖는 인덱스일때만.
				
				if(arr[evenIndex] < arr[i]) {  //짝수끼리 비교해서,, //나름 고정된값  .  계속 바뀌는값
					evenIndex = i;  //짝수 중 가장 큰 값의 위치 인덱스를 갱신.
				}
			}
			
		}
		System.out.println("짝수 중 가장 큰 값의 위치 인덱스는 : " + evenIndex);
	}

}
