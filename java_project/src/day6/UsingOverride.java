package day6;

public class UsingOverride {

	public static void main(String[] args) {

		Shape start, last, obj;
		
		
		
		start = new Line(); 
		last = start; 
		
		obj = new Rect();
		last.next = obj; // Rect 객체 연결  //next 변수에 다음 객체의 주소를 담는다~
		last = obj;
		
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		
		obj = new Circle(); // Circle 객체 연결
		last.next = obj; // Circle 객체의 노드의 next 변수에는 null이 들어있음.. 
		//last = obj;  
		
		// 모든 도형 출력
		Shape p = start;
		
		while(p != null) {
			p.draw();
			p = p.next;  //p 는 옮겨가면서 노드를 가리킴..
		}
	}
	
	// 그림 그려보면 이해된다! start, last, obj, p 는 변수. 노드를 가리킴..,,

}
