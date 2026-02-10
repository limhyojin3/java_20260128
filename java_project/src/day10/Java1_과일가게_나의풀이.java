package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java1_과일가게_나의풀이 {
	
	static Scanner s = new Scanner(System.in);
	
	public static boolean newMethod(ArrayList<HashMap<String,Object>> list, String input) {
		
		boolean thereIsAName = false;
		
		for(int i = 0; i < list.size(); i++) { // list.size만큼 반복
			
			HashMap<String, Object> map = list.get(i); // list.get(0); //사과  //x002
			
			thereIsAName = map.get("name").equals(input);
		}
		
		return thereIsAName;
	}
	
	public static void main(String[] args) {

		
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();  //x001
		
		while(true) {
			
			System.out.print("[1. 과일 등록, 2. 가격 수정, 3. 과일 판매] : ");
			int menu = s.nextInt();
		
			if(menu == 1) {
				// 1.과일 이름(name), 개수(count), 가격(price)을 입력받아서
				// 맵에 저장 후, 해당 맵을 리스트에 저장
				
				// 2.과일 이름이 이미 있다면, 개수만 물어보고 기존 개수에 더하기.
				
				HashMap<String, Object> fruit = new HashMap<>();
				
				boolean fruitFlag = false;
				
				System.out.print("과일 이름 : ");
				String name = s.next();
				fruit.put("name", name);
				
				// 2.과일 이름이 이미 있다면, 개수만 물어보고 기존 개수에 더하기.  // 가격은 거들떠도 안본다. 흐름제어 필요!
				//   -> 과일 이름이 없다면 개수, 가격 다 물어본다.
				
				
				//[{price=100, name=바나나, count=20}, {price=500, name=애플, count=5}]
				
				// 리스트에서 맵 찾기(리스트는 인덱스로 접근) -> 맵에서 과일 이름 찾기
				for(int i = 0; i < list.size(); i++) { // list.size만큼 반복
					
					HashMap<String, Object> map = list.get(i); // list.get(0); //사과  //x002
					
					// 과일 이름이 이미 있는 상황!
					if(map.get("name").equals(name)) { //사과  사과
						
						fruitFlag = true;
						
						System.out.print("개수 입력 : ");
						int count = s.nextInt();
						
						count = (int)map.get("count") + count; //기존개수에 더해서
						
						map.put("count", count);  // 업데이트   // 맵으로 가서 바로 업데이트
						
						break;
					}
				}
				
				
				//boolean fruitFlag = false; 일때 아래코드 실행
				
				if(!fruitFlag) {
					// 과일 이름이 없는 상황!
					System.out.print("개수 : ");
					int count = s.nextInt();
					fruit.put("count", count);
					
					System.out.print("가격 : ");
					int price = s.nextInt();
					fruit.put("price", price);
					
					list.add(fruit);
				}
				
				
				//// 과일 이름이 1.있는 상황과 2.없는 상황으로 나뉘니까 흐름제어 필요! boolean 적극활용!
				
				
				System.out.println(list);
		
			} else if (menu == 2){
				
				// 과일 이름을 입력받고, 있는 과일이면 가격을 입력받아서 해당 가격으로 수정
				// 없으면 '없는 과일 입니다' 출력 후 메뉴로 이동
				
				System.out.print("과일 이름 : ");
				String name = s.next();
				
				boolean fruitFlag = false; //// 과일 이름 겹치는게 있는지 , 없는지.
				
				// 리스트를 순회, 리스트에서 맵 찾기(리스트는 인덱스로 접근) -> 맵에서 과일 이름 찾기
				
				for(int i = 0; i < list.size(); i++) {
					
					HashMap<String, Object> map = list.get(i); //list.get(0);
				
					
					//// 과일 이름 겹치는게 있는 상황!
					if(map.get("name").equals(name)) {  //사과 사과
						
						fruitFlag = true;
						
						System.out.print("수정할 가격 : ");
						int price = s.nextInt();
						
						map.put("price", price);
						
						break;
					}// else {
//						else 안에 "없는 과일 입니다" 들어가면안됨. i=0,1,2.. 계속 순회할때마다 반복됨..
//					}
					
					
				}
				
				//// 과일 이름 겹치는게 없는 상황!
				//fruitFlag = false; 일때만 아래 코드 실행.
				
				if(!fruitFlag) {
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
				
				boolean fruitFlag = false;
				
				// 리스트 순회, 리스트에서 맵 찾기(리스트는 인덱스로 접근) -> 맵에서 과일 이름 찾기.
				
				for(int i = 0; i < list.size(); i++) {
					
					HashMap<String, Object> map = list.get(i); //list.get(0);
				
					
					//// 과일 이름 겹치는게 있는 상황!
					if(map.get("name").equals(name)) {  //사과 사과
						
						
						fruitFlag = true;
						
						System.out.print("판매할 개수 입력 : ");
						int count = s.nextInt();
						
						if(count < 0) {
							System.out.println("과일의 개수는 음수가 될 수 없습니다. 원하는 개수를 다시 입력해주세요.");
							i--; //i++로 가기전에 i-- 해준다.
							continue; //i++로 간다
						}
						
						int countAfterPurchase = (int)map.get("count") - count;
						
						//검증
						if(countAfterPurchase < 0) {
							System.out.println("충분한 재고가 남아있지않습니다. 현재 남은 해당 과일의 수는 " 
									+ map.get("count") + "개 입니다. 원하는 개수를 다시 입력해주세요.");
							i--;  //i++로 가기전에 i-- 해준다.
							continue;  //i++로 간다
						}
						
						// 정상로직
						
						// 구매에 성공 시 'ooo 과일을 oo 개 판매했습니다' 출력
						map.put("count", countAfterPurchase);
						
						System.out.println("과일 \'" + map.get("name") + "\'을(를) " 
								+ count + "개 판매했습니다!");
						
						break; // 리스트 순회 중단.
						
					} //else { '해당 이름의 과일 없음' <- 하면 인덱스 순회할때마다 반복됨. 그러면 안됨!
//						
//					}
					
				}
				
				//// 과일 이름 겹치는게 없는 상황!
				//fruitFlag = false; 일때만  '해당 이름의 과일 없음' 출력되도록.
				
				if(!fruitFlag) {
					System.out.println("해당 이름의 과일이 없습니다.");
				}
				
				System.out.println(list);
				
				
			} else {
				
			}
			
		}
	}

}
