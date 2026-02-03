package day5.classEx;

public class StuMain {

	public static void main(String[] args) {

		Student hong = new Student("홍길동", 30, "1234");
//		hong.study();
//		hong.study("자바");
		hong.money = 100000; //개인돈
		hong.money = hong.money - 30000;
		
		hong.money_708 = hong.money_708 - 50000; //회비(static) //150000
		System.out.println(hong.money_708); //150000
		
		
		Student kim = new Student("김철수", 25, "9876");
		kim.money = 50000; //개인돈
		System.out.println(kim.money_708); //회비(static) //150000
		
//		kim.study();
//		String stuNo = kim.getStuNo();
//		System.out.println(stuNo);
		
		Student.money_708 = Student.money_708 - 30000; //회비(static) //120000
		System.out.println(Student.money_708); //클래스명.static변수
											   //static 은 클래스명으로 호출.
											   //객체 생성없이.
		
		
		
		Student park = new Student("박영희", 30, "1212");
		System.out.println(park.getStuNo());
	}

}
