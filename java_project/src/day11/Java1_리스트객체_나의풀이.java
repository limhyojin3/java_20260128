package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java1_리스트객체_나의풀이 { //복습완료(+)

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Food> list = new ArrayList<>(); //[Food, Food, Food]
		
		while(true) {
			
			System.out.print("[1. 제품 등록, 2. 제품 삭제, 3. 종료] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				
				// 이름, 가격을 입력받아서 Food 객체로 만든 후 리스트에 저장
				// 단, 중복된 이름 허용 x, 가격은 0이하 x
				
				System.out.println("==Food 를 등록합니다==");
				
				String name = "";
				
				while(true) {
					
					System.out.print("이름 : ");
					name = s.next();
					
					boolean nameFlg = false;// 초기화
					Food food = null;  //x003
					
					for(int i = 0; i < list.size(); i++) {
						
						food = list.get(i);  //list.get(0); => Food 객체 x003
						
						//중복된 이름이 있는 경우!
						if(name.equals(food.getName())){
							
							nameFlg = true;
							System.out.println("중복된 이름은 허용되지않습니다. 다시 입력해주세요.");
							break; //for 문 빠져나감
						}
					}
					
					//중복된 이름이 없는 경우! nameFlg = false; -> break;
					if(!nameFlg) {
						
						break; //while 문 빠져나감
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
				
				list.add(food); 
				
				System.out.println(list);
				
			} else if(menu == 2) {
				
				
			} else if(menu == 3) {
				
				
			} else {
				
				
			}
			
			
			
			
			
		}
		
		
		
	}

}
