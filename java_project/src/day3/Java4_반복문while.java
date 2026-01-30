package day3;

public class Java4_반복문while {

	public static void main(String[] args) {

		// for(1선언부;2조건식;4증감식)
		// while(조건식) , 선언은 밖, 증감은 안(while문을 빠져나갈 조건)
		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//			
//		}
		
		//while 문 이용해서 구구단 짜기
		
		int i = 2;
		while(i <= 9) {
			System.out.println("===" + i + "단===");
			
			int j = 1; // 1로 초기화.
			while(j <= 9) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			System.out.println();
			i++;
		}
	} // main

}
