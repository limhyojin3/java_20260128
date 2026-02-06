package day8;

public class Point3D extends Point {
	
	private int z;
	
	public Point3D(int x, int y, int z) { // 1,2,3은 각각 x, y, z 축의 값.
		super(x, y);
		this.z = z;
	}
	

	public void moveUp() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}


	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + z + ")의 점";
	}
}
