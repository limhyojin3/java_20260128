package day8;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {
		this(0, 0, "BLACK");
	}

	public ColorPoint(int x, int y) { 
		this(x, y, "BLACK");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
		// super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}
