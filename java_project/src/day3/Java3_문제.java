package day3;

public class Java3_문제 {

	public static void main(String[] args) {

		// 구구단을 역순으로 출력  9단~2단
		for(int i = 9; i >=2; i--) {
			System.out.println("===" + i + "단===");
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
	}

}
