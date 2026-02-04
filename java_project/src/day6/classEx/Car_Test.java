package day6.classEx;

public class Car_Test {

	private String name; // 자동차 이름
	private String color; // 색상
	private int speed; // 속도
	
	Car_Test(){
		this("기본차", "하얀색", 0);
	}
	
	Car_Test(String name, String color, int speed){
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	void carInfo(){
		System.out.println("자동차의 이름은 " + name + ", 색상은 " + color + "입니다.");
	}
	
	void setInfo(String name, String color, int speed){
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	void speedUp(int speed){
		
		this.speed = this.speed + speed;
		
		// 검증
		if(this.speed >= 200) {
			System.out.println("200 초과의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		}
		
	}
	
	int getSpeed() {
		return speed;
	}
	
	void speedDown(int speed) {
		
		this.speed = this.speed - speed;
		
		// 검증 
		if(this.speed < 0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		}
		
	}
	
	
}
