package day14;

public class Java6_복습_클래스 {  //복습(+)
	
	static void test(Person p) { //Person p = new Student(); //부모는 자식을 담을수있다.(품을수있다)
		if(p instanceof Student) {  // => p(new Student()) 가 Student 객체를 포함하나요? true
		  //Student s = p;(new Student());
			
			System.out.println("학생!");
		}
		
	}

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p.toString()); // 이름 : 알수없음, 주소 : 알수없음
		
		Person p2 = new Person("홍길동");
		System.out.println(p2.toString()); // 이름 : 홍길동, 주소 : 알수없음
		
		Person p3 = new Person("김철수", "인천");
		System.out.println(p3.toString()); // 이름 : 김철수, 주소 : 인천
		
		Student s = new Student("박영희", "서울", 1234);
		
		test(s);  //학생!
		System.out.println(s); //이름 : 박영희, 주소 : 서울, 학번 : 1234
	
		Person s2 = new Student("유재석", "제주도", 9876);
	}

}
