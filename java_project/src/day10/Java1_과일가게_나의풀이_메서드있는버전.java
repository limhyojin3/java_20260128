package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java1_과일가게_나의풀이_메서드있는버전 {

	static Scanner s = new Scanner(System.in);
	
	/// 과일 이름 있으면 map 을 반환 , 없으면 null 을 반환
	public static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name) {
		
		
		for(int i = 0; i < list.size(); i++) { // list.size만큼 반복
			
			HashMap<String, Object> map = list.get(i); // list.get(0); //사과  //x002
			
			if(map.get("name").equals(name)) { //사과  사과
				
				return map;
			}
		}
		
		return null;
	}
	
	
	
	
	
	
//	public static boolean thereIsAName(ArrayList<HashMap<String,Object>> list, String input) {
//		
//		boolean thereIsAName = false;
//		
//		for(int i = 0; i < list.size(); i++) { // list.size만큼 반복
//			
//			HashMap<String, Object> map = list.get(i); // list.get(0); //사과  //x002
//			
//			thereIsAName = map.get("name").equals(input);
//		}
//		
//		return thereIsAName; //map 을 사용해야하니까 HashMap을 반환받는것이 낫겠다!
//	}
	
	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();  //x001
		
		while(true) {
			
			System.out.print("[1. 과일 등록, 2. 가격 수정, 3. 과일 판매] : ");
			int menu = s.nextInt();
		
			if(menu == 1) {
				// 1.과일 이름(name), 개수(count), 가격(price)을 입력받아서
				// 맵에 저장 후, 해당 맵을 리스트에 저장
				
				// 2.과일 이름이 이미 있다면, 개수만 물어보고 기존 개수에 더하기.
				
				HashMap<String, Object> fruit = new HashMap<>(); //해시맵 생성
				
				System.out.print("과일 이름 : ");
				String name = s.next();
				
				
				// 2.과일 이름이 이미 있다면, 개수만 물어보고 기존 개수에 더하기.  // 가격은 거들떠도 안본다. 흐름제어 필요!
				//   -> 과일 이름이 없다면 개수, 가격 다 물어본다.
				
				
				//[{price=100, name=바나나, count=20}, {price=500, name=애플, count=5}]
				
//				fruitFlag = thereIsAName(list, name);
//				
//				if(fruitFlag) {
//					
//					System.out.print("개수 입력 : ");
//					int count = s.nextInt();
//					
//					count = (int)map.get("count") + count; //기존개수에 더해서
//					
//					map.put("count", count);
//					
//					
//				}
				
				// 과일 이름 있는지 없는지 확인
				HashMap<String, Object> map = searchFruit(list, name); //map, null
				
				
				//과일 이름이 있는지 없는지 알아보는 메서드 적용.
				// 과일 이름 있으면 해당 map 을 반환. 없으면 null 을 반환
				
				//// 과일 이름이 이미 있는 상황! 
				if(map != null) {
					
					System.out.print("개수 입력 : ");
					int count = s.nextInt();
					
					count = (int)map.get("count") + count; //기존개수에 더해서
					
					map.put("count", count); // 업데이트 //map으로 바로 가서 업데이트
					
					
				} else { //// 과일 이름이 없는 상황! (map = null;)
				
					fruit.put("name", name);
				
					System.out.print("개수 : ");
					int count = s.nextInt();
					fruit.put("count", count);
					
					System.out.print("가격 : ");
					int price = s.nextInt();
					fruit.put("price", price);
					
					list.add(fruit);
				}
				
				
				
				//// 과일 이름이 1.있는 상황과 2.없는 상황으로 나뉘니까 흐름제어 필요! boolean 적극활용!
				//// 더 나아가서 메서드 만들고, boolean 대신 
				///     1.타입 반환 또는 2.null 값 반환!
				
				System.out.println(list);
		
				
			} else if (menu == 2){
				
				// 과일 이름을 입력받고, 있는 과일이면 가격을 입력받아서 해당 가격으로 수정
				// 없으면 '없는 과일 입니다' 출력 후 메뉴로 이동
				
				System.out.print("과일 이름 : ");
				String name = s.next();
				
				// 과일 이름 있는지 없는지 확인
				HashMap<String, Object> map = searchFruit(list, name);
				
				//// 과일 이름 겹치는게 있는 상황!
				if(map != null) {
					System.out.print("수정할 가격 : ");
					int price = s.nextInt();
					
					map.put("price", price);
					
				} else { //// 과일 이름 겹치는게 없는 상황!
				
					System.out.println("없는 과일 입니다");
					
				}
			
				System.out.println(list);	
				
			} else if (menu == 3) {
				
				// 과일 이름을 입력받고, 
				// 1.있는 과일이면 구매할 개수 입력, 입력된 수만큼 기존 개수에서 빼기.
				// --> 과일의 개수는 음수가 될 수 없다. 경고문구
				// --> 구매에 성공 시 'ooo 과일을 oo 개 판매했습니다' 출력
				// 2.없는 과일이면 '해당 이름의 과일 없음'
				
				System.out.print("판매할 과일 이름 : ");
				String name = s.next();
				
				// 과일 이름 있는지 없는지 확인
				HashMap<String, Object> map = searchFruit(list, name);
				
				if(map != null) { //// 과일 이름 겹치는게 있는 상황!
				
					System.out.print("판매할 개수 입력 : ");
					int count = s.nextInt();
					
					if(count < 0) {
						System.out.println("과일의 개수는 음수가 될 수 없습니다.");
						continue;
					}
					
					int countAfterPurchase = (int)map.get("count") - count;
					
					if(countAfterPurchase < 0) {
						System.out.println("충분한 재고가 남아있지않습니다. 현재 남은 해당 과일의 수는 " 
								+ map.get("count") + "개 입니다.");
						continue;  
					}
					
					// 구매에 성공 시 'ooo 과일을 oo 개 판매했습니다' 출력
					map.put("count", countAfterPurchase); //map 으로 가서 업데이트
					
					System.out.println("과일 \'" + map.get("name") + "\'을(를) " 
							+ count + "개 판매했습니다!");
					
					
				} else { //// 과일 이름 겹치는게 없는 상황!  (map = null;)
					
					System.out.println("해당 이름의 과일이 없습니다.");
					
				}
				
				System.out.println(list);
				
			} else {
				
			}
			
		}
	}

}
