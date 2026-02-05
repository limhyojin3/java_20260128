package day7.quiz;

public class Quiz_5 {

	public static void main(String[] args) {
		
//		5. 2단부터 9단까지 구구단 출력
//		단, 짝수(2,4,6,8)단만 출력
	
		for(int i = 2; i <= 9; i=i+2) {
			
			System.out.println("===" + i + "단===");
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
			System.out.println();
			
		}
	}

}
