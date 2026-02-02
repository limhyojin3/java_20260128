package day4.cleassEx;

public class User {

	String id;     // 필수
	String pwd;    // 필수
	String name;   // 선택
	String addr;   // 선택
	int age;       // 선택
	String gender; // 선택
	
	User(String id, String pwd){
		this(id, pwd, "이름비공개");
	}
	
	User(String id, String pwd, String name){
		this(id, pwd, name, "주소비공개");
	}
	
	User(String id, String pwd, String name, String addr){
		this(id, pwd, name, addr, 0);
	}
	
	User(String id, String pwd, String name, String addr, int age){
		this(id, pwd, name, addr, age, "성별비공개");
	}
	
	
	User(String id, String pwd, String name, String addr, int age, String gender){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {  // toString() 재정의
		return (id + "-" + pwd + "-" + name + "-" + addr + "-" + age + "-" + gender);
	}
}
