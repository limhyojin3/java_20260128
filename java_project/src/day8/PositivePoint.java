package day8;

public class PositivePoint extends Point {
	
	public PositivePoint(){
		super(0,0);
	}

	public PositivePoint(int x, int y) {
		super(x, y); //**부모생성자는 맨위에서 반드시 한번 호출
		
		if(x < 0 || y < 0) {
			move(0, 0);
		}
	}
	
	@Override
	public void move(int x, int y) {
		
		if(x < 0 || y < 0) {
			return;
		}
		
		super.move(x, y);
	}
	
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}
	
}
