package day17.ex;

public class Car implements CarManager {

//	조건 3. 클래스 생성. 클래스명 : Car
//	조건 4. 아래 조건에 맞게 클래스 작성
//	       -- 필드(변수) 생성, kind(String), speed(int), color(String) (+)
//	       -- Car c = new Car("소나타", 0, "검정"); 코드가 정상 동작하도록 생성자 작성 (+)
//	       -- System.out.println(c); 해당 코드 실행 시 '차 종류는 소나타, 색은 검정 입니다' 출력되도록 toString 메소드 재정의(+)
//	       -- CarManager를 implements하여(+) 아래 조건에 맞게 추상메소드 모두 오버라이딩할 것(+)
//	       	-- SpeedUp -> 기존 speed변수 값에 매개변수로 받은 값만큼 증가 (+)
//	                     단, 매개변수로 음수는 입력되지 않는다고 가정하며(+), 증가된 speed가 200이 초과할 경우 200으로 고정(+)
//	       	-- SpeedDown -> 기존 speed변수 값에 매개변수로 받은 값만큼 감소(+)
//	                     단, 매개변수로 음수는 입력되지 않는다고 가정하며(+), 감소된 speed가 0이 미만일 경우 0으로 고정(+)
//	         -- getSpeed -> speed값을 리턴(+)

	private String kind;
	private int speed;
	private String color;
	
	public Car(String kind, int speed, String color) {
		this.kind = kind;
		this.speed = speed;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "차 종류는 " + kind + ", 색은 " + color + " 입니다."; 
	}

	@Override
	public void SpeedUp(int speed) {
		
		while(true) {
			
			if(speed < 0) {
				System.out.println("음수는 입력될수 없습니다.");
				continue;
			}
			
			if(this.speed + speed > 200) {
				//System.out.println("speed가 200을 초과하므로 speed를 200으로 고정합니다.");
				this.speed = 200;
				break;
			}
		
			this.speed += speed;
			break;
		}
		
	}

	@Override
	public void SpeedDown(int speed) {
		
		while(true) {
			
			if(speed < 0) {
				System.out.println("음수는 입력될수 없습니다.");
				continue;
			}//(+)
			
			if(this.speed - speed < 0) {
				//System.out.println("speed가 0 미만이므로 speed를 0으로 고정합니다.");
				this.speed = 0;
				break;
			}
		
			this.speed -= speed;
			break;
		}
	}

	@Override
	public int getSpeed() {
		return this.speed;
		
	}




}
