package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java12_리스트맵 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		// 3명의 사람 정보 입력해서 리스트에 저장 //list 인덱스가 0,1,2 (3개)
		// 이름(name), 나이(age)
		
		for(int i = 0; i < 3; i++) {
			
			HashMap<String, Object> map = new HashMap<>();  //사람정보 생성
			
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);
			
			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);
		
			list.add(map);
		} //list 완성
		
		System.out.println(list);
		
		System.out.println("-------------------------");
		
		// 리스트에 있는 맵에서 나이(age)가 25 이상인 맵에 
		// 나이를 +1 하기
		
		// 일단 list를 순회한다. 0~2번인덱스
		
		for(int i = 0; i < list.size(); i++) {
			
			HashMap<String, Object> map = list.get(i); //hashmap을 꺼낸다. //x001
			
			int age = (Integer)map.get("age");
			
			if(age >= 25) {
				map.put("age", age + 1); //x001.put("age", age + 1); //x001로 가서 바로고침~~!
			} 
			
			//위 아래 둘다 됨.
			
//			if(age >= 25) {
//				age++;
//				map.put("age", age);
//			}
			
			
		}
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
