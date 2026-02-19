package day14;

public class Person {  //복습(+)

	private String name;
	private String addr;
	
	Person(){
		this("알수없음", "알수없음");
	}
	
	Person(String name){
		this(name, "알수없음");
	}
	
	Person(String name, String addr){
		this.name = name;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 주소 : " + addr; 
		// 이름 : 알수없음, 주소 : 알수없음
	}
}
