package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java1_과일가게_선생님풀이 {

	static Scanner s = new Scanner(System.in);
	
	static HashMap<String,Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name){
		
		// 과일의 이름이 이미 존재!
		for(int i = 0; i <list.size(); i++) {
			
			HashMap<String, Object> fruit = list.get(i);
			
			if(fruit.get("name").equals(name)) {
				return fruit;  // 과일의 이름이 이미 존재!
			}
		}
		
		// 과일의 이름이 존재X
		
		return null;
	
	}
	
	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();  //x001
		
		while(true) { ////////////////////선생님 풀이 확인
			
			int menu = 0;
			
			try {
				
				System.out.print("[1. 과일 등록, 2. 가격 수정, 3. 과일 판매] : ");
				menu = s.nextInt();  // String 타입을 넣으면 버퍼에 우선 담긴다. 
									 // 그후에 menu에 담으려고 계속 노력..
				
				if(menu == 1) {
					// 1.과일 이름(name), 개수(count), 가격(price)을 입력받아서
					// 맵에 저장 후, 해당 맵을 리스트에 저장
					
					// 2.과일 이름이 이미 있다면, 개수만 물어보고 기존 개수에 더하기.
					
					HashMap<String, Object> map = new HashMap<>();
					
					System.out.print("과일 이름 : ");
					String name = s.next();
					
					HashMap<String, Object> fruit = searchFruit(list, name);
					
					if(fruit != null) {
						
						// 이미 과일 존재
						System.out.println("개수 : ");
						int count = s.nextInt();
						
						fruit.put("count", (int)fruit.get("count") + count);
						
					} else {
						
						// 없는 과일
						map.put("name", name);
						
						System.out.print("개수 : ");
						int count = s.nextInt();
						map.put("count", count);
						
						System.out.print("가격 : ");
						int price = s.nextInt();
						map.put("price", price);
						
						list.add(map);
					}
					
					System.out.println(list);
			
				} else if (menu == 2){
					
					// 과일 이름을 입력받고, 있는 과일이면 가격을 입력받아서 해당 가격으로 수정
					// 없으면 '없는 과일 입니다' 출력 후 메뉴로 이동
					
					System.out.print("과일 이름 : ");
					String name = s.next();
					
					HashMap<String, Object> fruit = searchFruit(list, name);

					if(fruit != null) {
						
						System.out.print("새로운 가격 입력 : ");
						int price = s.nextInt();
						
						fruit.put("price", price);
					
					} else {
						
						System.out.println("해당 이름의 과일 없음.");
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
					
					HashMap<String, Object> fruit = searchFruit(list, name);
					
					if(fruit != null) {
						System.out.print("개수 입력 : ");
						int count = s.nextInt();
						
						if (count < 0) {
							System.out.println("과일의 개수 음수 불가");
							continue;
						}
					
						if((int) fruit.get("count") - count < 0) {
							System.out.println("과일 개수 부족");
							
						} else {
							fruit.put("count", (int) fruit.get("count") - count);
						
						}
						
						
					} else {
						System.out.println("해당 이름의 과일 없음");
					}
					
					System.out.println(list);
					
				}
				
			} catch(InputMismatchException e) {
				
				System.out.println("메뉴 선택은 숫자로 해주세요.");
				s.next(); //버퍼에 있는 값을 꺼내옴,, -> 버퍼에 잘못담긴 문자를 여기서 소진시켜준다!**
				
				// -> catch 문 실행되면 , 아래라인은 무시됨.(continue)처럼...( )
			}
			
			
		
		}
		
	}
}
