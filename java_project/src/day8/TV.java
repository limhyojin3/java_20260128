package day8;

public class TV {
	
	private int size;
	

	public TV(int size) {
		this.size = size; 
	}
	
	protected int getSize() { //부모 클래스의 protected 에 자식이 접근가능
		return size;
	}
}
