package test;

public class Monster {

//	4. (15점) 아래 조건에 맞는 클래스를 작성하시오.
//	 - 조건 1. 클래스명 : Monster (+)
//	 - 조건 2. 필드(변수) : name(String), hp(int), mp(int), damage(int)  (+)
//	 - 조건 3. 조건2에서 만든 변수는 모두 private로 선언하고(+)  get, set 메소드를 만들 것(+)
//	 - 조건 4. attack 메소드 생성. 리턴은 없음. 호출 시 'oo(damage값) 데미지를 입혔습니다!' 출력 (+)
//	 - 조건 5. 변수의 있는 모든 값을 초기화 하는 생성자 작성 (+)
//	(파일명 : Monster.java)
	
	private String name;
	private int hp;
	private int mp;
	private int damage;
	
	public Monster(String name, int hp, int mp, int damage) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.damage = damage;
	}
	
	
	public void attack() {
		System.out.println(damage + " 데미지를 입혔습니다!");
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
}
