package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test7 {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

//		7. (5점) 이미지와 동일하게 동작하도록 코드를 작성하시오. 
//		단, 데이터 관리는 ArrayList와 HashMap을 이용해서 할 것.(+)
//
//		참고 1. 1번 메뉴에서 동일 이름을 다시 등록 시도할 경우 이미지와 같이 안내문구 띄울 것(+)
//		참고 2. 2~4번 메뉴에서 등록되지 않은 이름을 찾을 경우 이미지와 같이 안내문구 띄울 것 2.(+)3.(+)4.(+)
//		참고 3. 모든 숫자는 음수 입력 불가능하도록 할 것(+)
//		참고 4. 포인트 차감은 내가 가진 포인트를 초과해서 차감할 수 없음(+)
//		(파일명 : Test7.java)
		
		
		
		System.out.println("===== 포인트 관리 프로그램 =====");
		
		
		ArrayList<HashMap<String, Object>> userList = new ArrayList<>();
		//[{이름=홍길동,나이=30,포인트=0},{이름=김철수,나이=20,포인트=0},...]
		
		while(true) {
			
			System.out.print("[ (1)사용자 등록 (2)포인트 적립 (3)포인트 차감 (4)포인트 확인 (5)종료 ] : ");
			int menu = s.nextInt();
			
			
			
			if(menu == 1) {
				HashMap<String, Object> map = addUser(userList); //map OR null
				
				if(map != null) {
					userList.add(map);
				} //[...,{이름=홍길동,나이=30,포인트=0}]
				
				
			} else if (menu == 2) {
				addPoint(userList);
				
			} else if (menu == 3) {
				subtractPoint(userList);
				
			} else if (menu == 4) {
				searchPoint(userList);
			} else if (menu == 5) {
				
				System.out.println("종료되었습니다.");
				return;
			} else if (menu == 6) {
				System.out.println("1~5번 숫자를 입력해주세요.");
			}
	
		}
	}

	//4.
	public static void searchPoint(ArrayList<HashMap<String, Object>> userList) {
		
		
		System.out.print("포인트 확인할 사용자 이름 : ");
		String name = s.next();
		
		if(userList.size() == 0) {
			System.out.println("해당 사용자가 존재하지 않습니다.");
			return;
		}
		
		for(int i = 0; i < userList.size(); i++) {
			
			if(userList.get(i).get("이름").equals(name)) {
			
				System.out.println(name + "님의 현재 포인트는 " 
						+ (int)userList.get(i).get("포인트") + "입니다.");
				
				return;
				
			} else {
				System.out.println("해당 사용자가 존재하지 않습니다.");
				return;
			}
		}
	}

	//3.
	public static void subtractPoint(ArrayList<HashMap<String, Object>> userList) {
		
		System.out.print("포인트를 차감할 사용자 이름 : ");
		String name = s.next();
		
		//System.out.println(userList);
		
		if(userList.size() == 0) {
			System.out.println("해당 사용자가 존재하지 않습니다.");
			return;
		}
		
		
		for(int i = 0; i < userList.size(); i++) {
			
			if(userList.get(i).get("이름").equals(name)) {
				
				while(true) {
					
					
					
					if(userList.get(i).get("포인트") != null) {
						
						System.out.print("차감할 포인트 : ");
						int point = s.nextInt();
						
						if(point < 0) {
							System.out.println("음수는 불가능합니다. 다시 입력해주세요.");
							continue;
						}
						
						if((int)userList.get(i).get("포인트") - point < 0) {
							System.out.println("차감할 수 있는 포인트는 " + (int)userList.get(i).get("포인트") + "입니다.");
							continue;
						}
						
						
						userList.get(i).put("포인트", (int)userList.get(i).get("포인트") - point);
						//map.put(" ", );
						
						System.out.println(name + "님의 포인트가 " + point + "만큼 차감되었습니다.");
						return;
						
					} else {
						
						System.out.println("차감할수 없습니다.");
						return;
					}
					
				}
				
				
				
			} else {
				System.out.println("해당 사용자가 존재하지 않습니다.");
				return;
			}
		}
	}

	//2.
	public static void addPoint(ArrayList<HashMap<String, Object>> userList) {
		
		System.out.print("포인트를 적립할 사용자 이름 : ");
		String name = s.next();
		
		//System.out.println(userList);
		
		if(userList.size() == 0) {
			System.out.println("해당 사용자가 존재하지 않습니다.");
			return;
		}
		
		for(int i = 0; i < userList.size(); i++) {
			
			if(userList.get(i).get("이름").equals(name)) {
				
				while(true) {
					
					System.out.print("적립할 포인트 : ");
					int point = s.nextInt();
					
					if(point < 0) {
						System.out.println("음수는 불가능합니다. 다시 입력해주세요.");
						continue;
					}
					
					if(userList.get(i).get("포인트") != null) {
						
						userList.get(i).put("포인트", (int)userList.get(i).get("포인트") + point);
						System.out.println(name + "님의 포인트가 " + point + "만큼 적립되었습니다.");
						return;
					} else {
						userList.get(i).put("포인트", point);
						System.out.println(name + "님의 포인트가 " + point + "만큼 적립되었습니다.");
						return;
					}
					
				}
				
				
				
			} else {
				System.out.println("해당 사용자가 존재하지 않습니다.");
				return;
			}
		}
		
	}

	public static HashMap<String, Object> addUser(ArrayList<HashMap<String, Object>> userList) {
		
		
		
		System.out.print("이름 : ");
		String name = s.next();
		
		for(int i = 0; i < userList.size(); i++) {
			
			if(userList.get(i).get("이름").equals(name)) {
				
				System.out.println("이미 등록된 사용자 입니다.");
				
				return null;
			}
		}
		
		HashMap<String, Object> map = new HashMap<>();
		
		System.out.print("나이 : ");
		int age = s.nextInt();
		
		map.put("이름", name);
		map.put("나이", age);
		
		System.out.println(name + "님이 등록되었습니다.");
		
		return map;
	}

}
