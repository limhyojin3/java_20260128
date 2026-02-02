package day4.cleassEx;

public class CircleMain {

	public static void main(String[] args) {
		
		Circle pizza = new Circle("자바피자", 10); // Circle 객체생성
		
		double area = pizza.getArea(); 
		System.out.println(pizza.name + "의면적은" + area);
		
		
		Circle donut = new Circle(); // Circle 객체생성
		
		donut.name = "자바도넛"; 
		donut.radius= 2; 
		
		area = donut.getArea(); 
		System.out.println(donut.name + "의면적은" + area);

	}

}
