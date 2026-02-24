package test;

public class Goblin extends Monster {

	
//	5. (15점) 4번에서 만든 클래스를 상속받는 Goblin 클래스(+)를 아래 조건에 맞게 생성하시오.
//	 - 조건 1. 부모 클래스 4개의 변수를 초기화 할 수 있는 생성자 작성 (+)
//	 - 조건 2. attack 메소드를 오버라이딩 하여, 호출 시 'ooo(name값)이 독침을 사용하여 oo(damage값) 데미지를 입혔습니다!' 출력 되도록 변경
//	(파일명 : Goblin.java)
	
	
	public Goblin(String name, int hp, int mp, int damage) {
		super(name, hp, mp, damage);
		
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName() + "이 독침을 사용하여 " + super.getDamage() + "데미지를 입혔습니다!");
	}

}
