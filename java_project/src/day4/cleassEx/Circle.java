package day4.cleassEx;

public class Circle {
	String name; 
	int radius;   // 반지름
	
	Circle() { } // 생성자 생략가능
	
	Circle(String name, int radius) {
		this.name = name;     // 생성자가 실행되는 시점에 this(객체,instance)가 정해짐 
		this.radius = radius; 
	}
	
	double getArea() { // 원의 면적 계산
		return 3.14 * radius * radius;
	}
}
