package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Java5_성적관리프로그램_나의풀이_메서드있는버전 {
	
	////해당 학번의 학생이 존재하는 경우 student 를 반환, 없으면 null 을 반환
	
	static Student searchStudent(ArrayList<Student> list, String stuNo) {
		
		for(int i = 0; i < list.size(); i++) {   //리스트 사이즈만큼 반복
			
			Student student = list.get(i);  //list.get(0);  //리스트는 인덱스로 접근
			
			if(student.getStuNo().equals(stuNo)) {
				
				return student;
				
			}
			
		}
		
		return null;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		
		// 1번메뉴 -> 학생추가, 2번메뉴 -> 성적입력, 3번메뉴 -> 성적조회
		// 4번메뉴 -> 종료, 그외 숫자 -> 다시 입력하도록
		
		while(true) {
			
			try {
				
				System.out.print("[1. 학생추가, 2. 성적입력, 3. 성적조회, 4. 종료] : ");
				
				int menu = s.nextInt();
				
				if(menu == 1) {
					
					System.out.println("==학생을 등록합니다.==");
					
					while(true) {
						
						System.out.print("학번 : ");
						String stuNo = s.next();
						
						// 해당학번의 학생이 있는지 없는지 확인
						Student student = searchStudent(list, stuNo); //student OR null
						
						// + 해당 학번의 학생이 있으면 메뉴로 가는게 아니라 학번을 다시 입력하도록.
						
						//// 해당학번의 학생이 있는 상황

						if(student != null) {
							
							System.out.println("이미 존재하는 학번입니다. 다시 입력해주세요.");
							// continue;
							
						} else {  //// 해당학번의 학생이 없는 상황 //student = null;
							
							System.out.print("이름 : ");
							String name = s.next();
							
							System.out.print("나이 : ");
							int age = s.nextInt();
							
							student = new Student(stuNo, name, age);
							
							list.add(student);
							
							System.out.println(list);
							
							break;
							
						}
						
					}
					
				} else if(menu == 2) {
					
					// 1.학번을 입력받아서 해당 학번 학생의 
					//   자바, 오라클, html 점수를 입력받아서 저장
					
					// 2.해당하는 학번 없을 경우 
					//  '해당 학번을 가진 학생이 없습니다' 출력 후 메뉴로 이동
					
					System.out.println("==점수를 등록할 학생의 학번을 입력해주세요==");
					System.out.print("학번 : ");
					String stuNo = s.next();
					
					// 해당 학번의 학생이 있는지 없는지 확인(search)
					Student student = searchStudent(list, stuNo); // 그 해당학생의 참조값을 반환
					
					//// 해당 학번의 학생이 존재하는 경우
					if(student != null) {
						
						System.out.println("--성적 입력하기--");
						
						System.out.print("자바 : ");
						int java = s.nextInt();
						student.setJava(java);  	//int 를 반환하도록..(?)ㅁㅇㄴㄴㅁㅇㄴ
													//참조값으로 바로 가서 업데이트
						
						System.out.print("오라클 : ");
						int oracle = s.nextInt();
						student.setOracle(oracle);
						
						System.out.print("html : ");
						int html = s.nextInt();  //** 만약 문자가 잘못들어오면 버퍼에 담기고 예외처리(catch)를 해도,
												 // 계속 int 에 담으려고 시도한다. s.next();로 잘못들어온 문자를 치워줘야함.
						student.setHtml(html);
						
						// Student 객체 한개 완성.
						
					} else {  //// 해당 학번이 없는 경우  //student = null; 인경우
						
						System.out.println("해당 학번의 학생이 없습니다.");
						
					}
				
					
					
				} else if(menu == 3) {
					
					// 해당 학번 학생의 정보 출력
					// 학번 : ooo, 이름 : ooo, 자바 : oo, 오라클 : oo, html : oo
					
					System.out.println("==성적을 조회할 학생의 학번을 입력하세요.==");
					System.out.print("학번 : ");
					String stuNo = s.next();
					
					// 해당 학번의 학생이 있는지 없는지 확인
					Student student = searchStudent(list, stuNo);
					
					//// 해당 학번의 학생이 있는 경우

					if(student != null) {
						
						System.out.println(student);
						
						
					} else { //// 해당 학번의 학생이 없는 경우   //student = null;
						
						System.out.println("해당 학번의 학생이 없습니다.");
					}
					
					
				} else if(menu == 4) {
					
					System.out.println("종료되었습니다.");
					break;
					
				} else {
					System.out.println("1~4 중에 선택하세요.");
				}
				
			} catch (Exception e) {  //나머지 모든 경우의 예외처리

				s.next();
				System.out.println("에러 발생! 다시 시도해주세요!");
			}
		}
		
	}

}
