package day17.ex;

public class Dog extends Animal{
	
	// 1. 에러가 발생하지 않도록 생성자 작성(name, age 초기화) (+)
	// 2. 해당 클래스(Dog)의 객체 생성 후 sound 메소드 호출 시 (+)
	// '이름 : ooo(name변수 정보), 나이 : oo(age변수 정보)가 멍멍 소리냅니다. ' 출력되도록 코드를 작성할 것 (+)

	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void sound() {
		System.out.println("이름 : " + super.getName() + ", 나이 : " + super.getAge() + "살 이(가) 멍멍 소리냅니다.");
	}












}
