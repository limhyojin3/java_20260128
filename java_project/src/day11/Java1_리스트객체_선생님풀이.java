package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java1_리스트객체_선생님풀이 {  // 복습완료(+)

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Food> list = new ArrayList<>(); //[Food, Food, Food]
		ArrayList<String> foodNameList = new ArrayList<>(); //foodNameList 의 value 값은 String
		//[String, String, String]  //food 이름 등록된 리스트
		
		while(true) {  //try-catch(+)
			
			try {
				
				System.out.print("[1. 제품 등록, 2. 제품 삭제, 3. 종료] : ");
				int menu = s.nextInt();
				
				if(menu == 1) {
					
					// 이름, 가격을 입력받아서 Food 객체로 만든 후 리스트에 저장
					// 단, 중복된 이름 허용 x, 가격은 0이하 x
					
					System.out.println("==Food 를 등록합니다==");
					
					String name = "";
					boolean foodFlg = true;
					
					while(foodFlg) { //처음에 true 니까 일단 반복문실행.
						
						System.out.print("제품 이름 : ");
						name = s.next();
						
						//food 이름 등록된 리스트에 입력된이름이 있는지 확인
						foodFlg = foodNameList.contains(name); //ArrayList.contains(value);
															   //ArrayList.contains(String);
						
						//food 이름 등록된 리스트에 , 이름이 있는경우!
						if(foodFlg) {
							
							System.out.println("이미 있는 제품 이름 입니다.");
							
						} else { //food 이름 등록된 리스트에 , 이름이 없는경우! (foodFlg=false; )
							
							break;
						}
					}
					
					//가격
					
					int price = 0;
					
					while(true) {
						
						System.out.print("가격 : ");
						price = s.nextInt();
						
						if(price <= 0) {
							System.out.println("가격은 0이하가 될수없습니다. 다시 입력해주세요.");
							continue;
						}
						
						break;
					}
					
					Food food = new Food(name, price);
					
					list.add(food);  //ArrayList.add(value);
					foodNameList.add(name); //food 이름 등록된 리스트 에 이름을 등록
					
					System.out.println("list(Food) = " + list);
					System.out.println("foodNameList(String) = " + foodNameList);
					
				} else if(menu == 2) {
					
					// 제품 이름을 입력받아서 해당 제품을 삭제
					// 제품 이름이 없으면 '없는 제품 입니다' 출력
					// 있으면 리스트에서 제거
					
					System.out.println("==제품을 삭제합니다.==");
					
					System.out.print("삭제할 제품 이름 : ");
					String name = s.next();
					
					//네임리스트에 이름이 있는지 없는지 확인
					boolean foodFlg = foodNameList.contains(name); //ArrayList.contains(value)
					
					Food removed = null;
					
					//네임리스트에 있는 경우!
					if(foodFlg) {
						boolean r = foodNameList.remove(name); ///네임리스트에서 value(String)을 삭제.
						
						
						//list 에서도 삭제해주기위해(인덱스를 찾기위해) 순회하며 탐색
						for(int i = 0; i < list.size(); i++) { //list = [Food,Food,Food]
							
							Food food = list.get(i);
							
							//삭제할 제품이름 == food 에 있는이름
							if(name.equals(food.getName())) { //인덱스 i 가 구해짐.**
								
								//removed = list.remove(i);  //리스트에서 food(Food 객체) 삭제.
														   ///**oldValue = ArrayList.remove(인덱스);
														   ///  (value)

								boolean r2 = list.remove(food); //**boolean = ArrayList.remove(value);
								
								///ArrayList.remove(); 두가지 사용! 어쨋든 제거하는건 똑같음!
								///1. value = ArrayList.remove(인덱스)
								///2. boolean = ArrayList.remove(value);
								
								break; //for 문 바로 빠져나온다
							}
						}
						
						//System.out.println(removed.getName() + "이(가) 삭제되었습니다.");
						
						System.out.println("foodNameList = " + foodNameList); //네임리스트에서 삭제돼있음
						System.out.println("list = " + list); //리스트에서도 삭제돼있음
						
						
					} else { //네임 리스트에 없는 경우! (foodFlg = false;)
						System.out.println("삭제할 제품이 없습니다.");
					}
					
					
				} else if(menu == 3) {
					
					
				} else {
					
					
				}
			} catch (Exception e) {
				
				s.next(); //버퍼 비워주기
				System.out.println("숫자를 입력해주세요.");
				
			} //다음 루프로 돌아감
			
		
		}
	}

}
