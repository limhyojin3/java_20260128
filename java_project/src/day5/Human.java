package day5;

public class Human {
	
	protected String name;
	protected int age;
	private String addr;
	int money;
	
	protected Human(){
		
	}
	
	Human(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	void eat(String food) {
		System.out.println(food + "를 먹는다!");
	}

	
}
