package day7;

import java.util.HashMap;

public class Java3_toString {
	
	static void test(Object obj) {
		
	}
	

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 30);
		Person hong2 = new Person("홍길동", 30);
		
		String a = new String("test");
		String b = new String("test");
		
		System.out.println(hong == hong2); //false
		System.out.println(hong.equals(hong2)); //false -> equals() 재정의 후 true
		
		System.out.println(a == b); //false
		System.out.println(a.equals(b)); //true
		
//		System.out.println(hong.toString());
		System.out.println(hong);
		
		String str = new String("zz");
		System.out.println(str);
	
		
		test(1);
	
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "홍길동");
		map.put("java", 100);
		map.put("isMarried", true);
		System.out.println(map);
	}

}
