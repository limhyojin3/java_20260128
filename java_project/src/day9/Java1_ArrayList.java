package day9;

import java.util.ArrayList;

public class Java1_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(); //배열리스트도 객체
		list.add(10);
		list.add(5);
		list.add(9);
//		list.add("haha");
		
		System.out.println(list); // 리스트는 [](대괄호)로 표현,,
		
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("홍길동");
		list2.add(30);
		list2.add(true);
		
		System.out.println(list2);
		
		list2.remove(1);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		
	}

}
