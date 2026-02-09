package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java5_성적관리프로그램 {
	
	static Scanner s = new Scanner(System.in);
	
	public static int inputNumber(int first, int last) {
		
		int result = 0;
		
		while(true) {
			
			int input = s.nextInt();	
			
			if(!(first <= input && input <= last)) {
				System.out.println(first + "~" + last + "사이의 값을 입력해주세요.");
				continue;
			}
			
			result = input;
			break;
			
		}
		
		
		return result;
	}
	

	public static void main(String[] args) {

		// == [1. 학생 추가, 2. 성적 입력, 3. 성적 확인, 4. 종료] ==
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[1. 학생 추가, 2. 성적 입력, 3. 성적 확인, 4. 종료] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				// 학생 추가 (사람 1명당 map 1개) , 동명이인은 없다고 가정함.
				
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("나이 : ");
				int age = inputNumber(1, 150);
				map.put("age", age);
				
				list.add(map);
				
			} else if(menu == 2) {
				// 성적 입력 ( java, oracle, html )
				
				System.out.print("성적을 입력할 학생의 이름을 입력 : ");
				String name = s.next();
				
				boolean studentFlag = false; //Boolean 적극활용!**  (if-else)랑 비슷한 느낌으로. 그렇지만 검증에 가까움!
				
				
				// map 을 찾기
				for(int i = 0; i < list.size(); i++) { //list.size()가 5면, 0~4까지 5번 반복
					
					HashMap<String, Object> student = list.get(i); // i번 인덱스
					
					if(student.get("name").equals(name)) {
						
						studentFlag = true; //해당학생이 있다!
					
						System.out.print("자바 : ");
						int java = inputNumber(0, 30);
						student.put("java", java);
							
						System.out.print("오라클 : ");
						int oracle = inputNumber(0, 50);
						student.put("oracle", oracle);
							
						System.out.print("html : ");
						int html = inputNumber(0, 20);
						student.put("html", html);
						
						break;
					}
						
						//정상로직부터 생각해보고, 검증 추가.
					
				}
				
				// 해당학생없는경우 studentFlag = false; ->"해당 이름 학생이 없습니다."
				if(!studentFlag) {
					System.out.println("해당 이름 학생이 없습니다.");
				}
				
				
			} else if(menu == 3) {
				// 성적 확인
				// 1. 이름 입력 받기
				// 2. 해당 이름을 가진 map 이 없으면 '해당 이름 학생 없습니다.'
				// 3. 있으면 'ooo의 점수 => 자바 : oo, 오라클: oo, html : oo'출력
				
				System.out.print("성적 확인 할 학생의 이름을 입력 : ");
				String name = s.next();
				
				boolean studentFlag = false; //// 해당 학생이 없다!
				
				//list.size만큼 반복
				
				for(int i = 0; i < list.size(); i++) {
					HashMap<String, Object> student = list.get(i); //list의 i번 인덱스(학생i가 담겨있음)
					
					if(student.get("name").equals(name)) {
						
						studentFlag = true; ////해당학생이 있다!
						
						// 학생 이름은 있지만, 점수가 입력되지 않았을때 로직처리
						
						if(!student.containsKey("java")) { ////그 학생이 "java"키를 포함하고있지않다면,
							System.out.println("성적 점수가 입력되지 않았습니다.");
							break;
						}////** 복습(+)
						
						System.out.print(student.get("name") + "의 점수 =>");
						System.out.print("자바 : " + student.get("java"));
						System.out.print(", 오라클 : " + student.get("oracle"));
						System.out.print(", html : " + student.get("html"));
						System.out.println();
						
						break;
					}
				}
				
				//// 입력한 이름의 학생이 없는경우  studentFlag = false; ->"해당 이름 학생 없습니다." 출력
				if(!studentFlag) {
					System.out.println("해당 이름 학생 없습니다.");
				}
				
//				studentFlag = true;
//				System.out.println("해당 이름 학생 없습니다."); (x)
//				studentFlag = false;
//				System.out.println("해당 이름 학생 없습니다.");
				
//				System.out.println(list);
				
			} else if(menu == 4) {
				// 종료
				System.out.println("종료되었습니다.");
				break;
				
			} else {
				System.out.println("1~4 중에 하나를 선택해주세요.");
			}
		}
		
	}

}
