package day6;

import day5.Human;  // 다른패키지에 있는걸 쓰려면 import 해주어야함.

public class Student extends Human {  // 다른패키지에 있는 부모를 상속받음.
	String stuNo; //학번
	
	//자식 생성자를 호출할때 자동으로 부모 생성자도 같이 호출됨.
	public Student(String name, int age, String stuNo){ 
		// Human();  <-protected
		this.name = name; //<-protected
		this.age = age; //<-protected
		this.stuNo = stuNo;
	}
	
	//**자식이 부모의 기본생성자를 호출. (부모에 부모자신의 기본생성자가 있어야함.)
	// 자식 객체 생성될때 부모 객체도 같이 생성된다!
	
	void study() {
		System.out.println(this.name + "가 공부를 합니다.");
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
	// getter, setter 는 맨 아래에 두는게 보기 편함!
}
