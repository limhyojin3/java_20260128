package day7.quiz;

public class Quiz_1 {
	
	
	public static void main(String[] args) {
		//1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
		
		for(int i = 10; i <= 50; i++) {
			
			if(i % 3 == 0) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
	}
	
}
