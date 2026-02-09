package day9;

import java.util.ArrayList;
import java.util.HashMap;

public class Java2_Map {

	public static void main(String[] args) {

		HashMap<String, Object> hong = new HashMap<>();
		
		hong.put("name", "홍길동");
		hong.put("java", 90);
		hong.put("oracle", 95);
		hong.put("html", 85);
		
		System.out.println(hong); // Map 은 {}(중괄호)로 표현,,
		
		System.out.println("-----------------------------");
		HashMap<String, Object> kim = new HashMap<>();
		
		kim.put("name", "김철수");
		kim.put("java", 95);
		kim.put("oracle", 90);
		kim.put("html", 90);
		
		System.out.println(kim);
		System.out.println(kim.get("java"));
		
		System.out.println("-----------------------------");
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list); //[1, 2]
		
		System.out.println("-----------------------------");
		
		// ArrayList 안에 HashMap<String, Object> 을 넣기
		// [{}, {}, {}]
		ArrayList<HashMap<String, Object>> list2 = new ArrayList<>();
		list2.add(hong);
		list2.add(kim);
		
		System.out.println(list2);
		
		System.out.println("-----------------------------");
		
		System.out.println(list2.get(0).get("name")); //인덱스로 접근
		// list2.get(0).get("name") => hong.get("name") => "홍길동"
		
		System.out.println("-----------------------------");
		for(int i = 0; i < list2.size(); i++) { // i=0,1
			HashMap<String, Object> map = list2.get(i);
			System.out.println(map.get("name") + "의 자바 점수는 " + map.get("java"));
			// hong.get("name")의 자바 점수는 hong.get("java");
			System.out.println(list2.get(i).get("name"));
			// list2.get(0).get("name") => hong.get("name") => "홍길동"
		}
		
		System.out.println("-----------------------------");
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(10);
		list3.add(5);
		
		for(int i = 0; i < list3.size(); i++) { // 0 <= i < 3   (i=0,1,2)
			Integer a = list3.get(i); // list3.get(0) => 3
			System.out.println(a); // 3
		}
		
	}

}
