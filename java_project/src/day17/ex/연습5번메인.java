package day17.ex;

public class 연습5번메인 {

	public static void main(String[] args) {
		
//		main 메소드에서 아래 코드를 실행하고 결과를 캡처
//		Car c = new Car("소나타", 0, "검정");
//		System.out.println(c);  // '차 종류는 소나타, 색은 검정 입니다'
//		c.SpeedUp(100);
//		System.out.println(c.getSpeed()); // 100
//		c.SpeedUp(150);
//		System.out.println(c.getSpeed()); // 200
//		c.SpeedDown(30);
//		System.out.println(c.getSpeed()); // 170

		Car c = new Car("소나타", 0, "검정");
		System.out.println(c);
		c.SpeedUp(100);
		System.out.println(c.getSpeed()); // 100
		c.SpeedUp(150);
		System.out.println(c.getSpeed()); // 200
		c.SpeedDown(30);
		System.out.println(c.getSpeed()); // 170
	}

}
