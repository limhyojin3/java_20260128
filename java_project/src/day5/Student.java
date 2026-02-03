package day5;

public class Student extends Human{
	
	String stuNo; //학번
	
	Student(String name, int age, String stuNo){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
	}
	
	//**자식이 부모의 기본생성자를 호출. (부모에 부모자신의 기본생성자가 있어야함.)
	// 자식 객체 생성될때 부모 객체도 같이 생성된다!
	
	void study() {
		System.out.println(this.name + "가 공부를 합니다.");
	}

}
