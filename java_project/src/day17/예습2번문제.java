package day17;

public class 예습2번문제 {

	public static void main(String[] args) {

		//2. 1부터 100까지 숫자 중 짝수이면서 5의 배수인 숫자들의 합을 출력하시오.
		
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 == 0) {
				
				if(i % 5 == 0) {
					
					sum += i;
				}
			}
		}
		
		System.out.println("1부터 100까지 숫자 중 짝수이면서 5의 배수인 숫자들의 합 : " + sum);
	}

}
