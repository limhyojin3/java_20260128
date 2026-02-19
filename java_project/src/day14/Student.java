package day14;

public class Student extends Person {  //복습(+)

	private int stuNo;
	
	Student(String name, String addr, int stuNo){
		super(name, addr);
		this.stuNo = stuNo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 학번 : " + stuNo;
	}
	
	
}
