package day6;

public class Shape {

	public Shape next; //참조값
	
	public Shape() {
		next = null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}
