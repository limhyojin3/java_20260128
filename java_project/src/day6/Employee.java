package day6;

public class Employee extends Person {
	
	String empNo;
	
	public Employee(String name, int age, String addr, String empNo){
		this.empNo = empNo;
	}
	
	public Employee(String name, int age, String addr, String gender, String empNo) {
		//this.name = name;  //private 이라서 바로 접근 불가.
		super(name, age, addr, gender);
		this.empNo = empNo;
	}

}
