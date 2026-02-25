package day17.ex;

public interface CarManager {

//	조건 1. 인터페이스 생성. 인터페이스명 : CarManager (+)
//	조건 2. 인터페이스에 다음 추상 메소드를 추가
//	       -- 메소드명 : SpeedUp, 리턴타입 : void, 매개변수 : int형 변수 1개 (+)
//	       -- 메소드명 : SpeedDown, 리턴타입 : void, 매개변수 : int형 변수 1개 (+)
//	       -- 메소드명 : getSpeed, 리턴타입 : int, 매개변수 : 없음 (+)

	void SpeedUp(int speed);
	void SpeedDown(int speed);
	int getSpeed();




}
