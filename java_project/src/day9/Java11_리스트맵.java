package day9;

import java.util.ArrayList;
import java.util.HashMap;

public class Java11_리스트맵 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(); //String 타입만 넣을수있다.
		HashMap<String, Object> hong = new HashMap<>(); //x002
		
		
		list.add("amount");
		System.err.println(list.get(0));  //ArrayList는 인덱스로 접근한다.**
										  //HashMap은 키:밸류 중에 키로 접근한다.**
		
		ArrayList<HashMap<String, Object>> list2 = new ArrayList<>();//x001

		list2.add(hong); //x001.add(x002);
		
		hong.put("name", "홍길동");
		hong.put("age", 30);
		
		System.out.println(hong);
		
		
		System.out.println(list2);
		
		HashMap<String, Object> map = list2.get(0); //x001.get(0) -> x002
		map.put("age", 31); //x002.
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("addr", "인천");
		
		/////////선생님 커밋보고 다시 적기( )
		
		
	}

}
