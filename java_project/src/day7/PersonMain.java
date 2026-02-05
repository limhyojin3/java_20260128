package day7;

public class PersonMain {

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 30);
		hong.setPhone("123-123");
		System.out.println("이름은 " + hong.getName() + ", 나이는 " 
		+ hong.getAge() + ", 핸드폰번호는 " + hong.getPhone() + "입니다.");
		System.out.println(hong);
		
		
	}

}
