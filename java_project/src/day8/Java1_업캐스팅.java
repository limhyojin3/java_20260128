package day8;

public class Java1_업캐스팅 {

	static void test1(Point p) {
		
		if(p instanceof Point3D) { //p 가 Point3D로 만든 인스턴스인가요?
			//System.out.println(p.getX() * p.getY() * p.getZ()<-error); 
							// p.getZ() => Point.getZ() (X)
							// => 부모타입에 없는 메서드는 호출 불가..**
			
							// ** 메서드는 부모로 올라가면서 찾는거임..
							// 자기한테 안보이면 부모클래스로 계속 올라가서, 찾으면 호출!
							// 못찾으면 호출불가!
			
			System.out.println("Point3D로 만든 객체!");
		}
		System.out.println(p.getX() * p.getY());
		
		
	}
	
//	static void test1(ColorPoint cp) {
//		System.out.println(cp.getX() * cp.getY());
//	}
//	
//	static void test1(Point3D p3) {
//		System.out.println(p3.getX() * p3.getY());
//	}
//	
//	static void test1(PositivePoint pp) {
//		System.out.println(pp.getX() * pp.getY());
//	}
	
	
	
	public static void main(String[] args) {

		Point point = new Point(1,2);
		
		ColorPoint colorPoint = new ColorPoint(10, 20, "blue");
		Point3D point3d = new Point3D(1, 2, 3);
		PositivePoint positivePoint = new PositivePoint(5, 10);
		
		test1(colorPoint); //200
		test1(point3d);
	}

}
