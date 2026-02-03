package day5.classEx;

public class Student {
	// 변수(필드) + 메소드
	
	String name;
	int age;
	private String stuNo;
	int money; 
	static int money_708 = 200000;   //(Student) 클래스로 만든 모든 객체가 공유.
									 //static 은 객체 생성없이 사용가능.
	
	// 3개의 변수를 초기화 하는 생성자 작성
	Student(String name, int age, String stuNo){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
	}
	
	// 메서드 오버로딩
	void study() {
		System.out.println(name + "가(이) 공부를 한다.");
	}
	void study(String subject) {
		System.out.println(subject + "를 공부한다.");
	}
	
	String getStuNo() {
		return stuNo;
	}
	
	//**static 메서드안에서 객체 없이 객체 메서드를 사용 불가.
//	static int staticMethod() {  
//		return stuNo;  //객체가 생성이 된지 안된지 확인 못함.
//	}
}
