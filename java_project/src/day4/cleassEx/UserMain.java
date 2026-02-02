package day4.cleassEx;

public class UserMain {

	public static void main(String[] args) {

		User user1 = new User("test1", "1234");//test1-1234-이름비공개-주소비공개-0-성별비공개

		User user2 = new User("test2", "9876", "홍길동");
	
		User user3 = new User("test3", "1212", "김철수", "인천");
		
		User user4 = new User("test4", "3434", "박영희", "인천", 30);
		
		User user5 = new User("test5", "9898", "유재석", "인천", 30, "남");
	
		System.out.println(user1); //user1.toString(); -> 문자열을 반환한다.
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
	
	}

}
