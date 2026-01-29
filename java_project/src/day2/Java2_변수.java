package day2;

public class Java2_변수 {

	public static void main(String[] args) {

		// 변수는 언제든 값이 변경 될 수 있다.
		double height = 170.5;
		height = 170.5 + 1;
		
		// final 키워드를 붙이면 값을 변경 할 수 없다. =>'상수' 라고 한다.
		final double PI = 3.14;
		// pi = 3.141592; 수정불가
		
		int number = 50;
		int number2 = number + 10; //60
		
		int weight = 50; //50.0
		double weight2 = weight; 
		
		//강제 형변환 가능. but 값의 손실이 발생
		double weight3 = 50.5;
		int weight4 = (int)weight3;
		System.out.println(weight4);
	}

}
