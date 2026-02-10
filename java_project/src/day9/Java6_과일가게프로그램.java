package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java6_과일가게프로그램 {  //////////// (복습) (+)
	
	static Scanner s = new Scanner(System.in); //스캐너도 객체다! static 붙여주면 static메서드 안에서 사용가능!
	
	//first~last 사이값이 반환되도록 하는 메서드
	public static int inputNumber(int first, int last) { //inputNumber(0,20) => 0~20사이값이 반환
		
		int result = 0;
		
		while(true) {
			
			int input = s.nextInt();
			
			//검증
			if(!(first <= input && input <= last)) {
				System.out.println(first + "~" + last + " 사이의 값을 입력해주세요.");
				continue;
			}
			
			//정상로직
			result = input;
			break;
		}
		
		return result;
	}

	public static void main(String[] args) {

		// [1. 과일 등록, 2. 과일 판매, 3. 가격 수정, 4. 종료]
		
		
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[1. 과일 등록, 2. 과일 판매, 3. 가격 수정, 4. 종료] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				// 1. 과일 등록
				// 과일이름(name), 개수(count), 가격(price)을 입력받아서
				// map 에 저장 후 리스트에 추가
				// 개수는 1~200 사이, price는 100~10000사이 값

				// + 동일한 이름의 과일이 있을 경우
				// 가격은 물어보지 않고, 개수만 입력 받아서 기존 개수에 더하기.
				
				HashMap<String, Object> fruit = new HashMap<>(); //fruit.get() -> Object 타입을 반환
					
				boolean fruitFlag = false; ////동일한 이름의 과일이 없다! boolean 활용 적극적으로!**
										   //(if-else)랑 비슷한 느낌으로. 그렇지만 검증에 가까움!
										   // 흐름 제어용!!
				
				System.out.print("과일 이름 : ");
				String name = s.next();
				fruit.put("name", name);
					
				for(int i = 0; i <list.size(); i++) { //list.size 만큼 반복. list.size가 2면, 2번반복,, i는 인덱스
					HashMap<String, Object> map = list.get(i); //x001,x002
					
					if(map.get("name").equals(name)) { ////동일한 이름의 과일이 있다! 
							
						fruitFlag = true; ////동일한 이름의 과일이 있다! 
						
						
						System.out.print("개수 : ");
						int count = inputNumber(1,200);
							
						count = (int)map.get("count") + count;//map.get("count") <-Object타입
															  //(Integer)타입으로 다운캐스팅-> int로 자동언박싱
						map.put("count", count); //x001.put("count", count);
							
						break;
					} 
						
				}//// 동일한 이름의 과일이 있으면 개수만 올려주고 "가격은 거들떠 보지도 않고 넘어간다!"
				 //// 따라서 boolean flag 활용해서 , 흐름 제어.**
					
				//동일한 이름의 과일이 없을때 , fruitFlag = false 일때
				if(!fruitFlag) {
						
					System.out.print("개수 : ");
					int count = inputNumber(1,200);
					fruit.put("count", count);
						
					System.out.print("가격 : ");
					int price = inputNumber(100,10000);
					fruit.put("price", price);
					
					list.add(fruit);
				}
				
				System.out.println(list);

			}else if(menu == 2) {
				
			}else if(menu == 3) {
				
			}else if(menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("1~4 사이 메뉴를 선택하세요.");
			}
		}
	}

}
