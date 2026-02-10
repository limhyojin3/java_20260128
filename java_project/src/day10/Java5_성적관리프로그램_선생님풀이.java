package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Java5_성적관리프로그램_선생님풀이 {  //// 복습 완(+) 26.02.10 18:57
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		
		ArrayList<String> stuNoList = new ArrayList<String>(); //(String)학번을 관리하는 리스트.
		// -> 이 ArrayList 의 value 값들은 String 타입이다.  인덱스와 밸류
		
		// 1번메뉴 -> 학생추가, 2번메뉴 -> 성적입력, 3번메뉴 -> 성적조회
		// 4번메뉴 -> 종료, 그외 숫자 -> 다시 입력하도록
		
		while(true) {  // ** while 문 안에서 try-catch 가능!
			
			try {
				
				System.out.print("[1. 학생추가, 2. 성적입력, 3. 성적조회, 4. 종료] : ");
				
				int menu = s.nextInt();
				
				if(menu == 1) {
					
					System.out.println("==학생을 등록합니다.==");
					
					boolean stuNoFlg = false; //초기화
					String stuNo = ""; //초기화
					
					//검증
					while(true) {
						
						System.out.print("학번 : ");
						stuNo = s.next();
						
						//stuNoList 에서 해당 학번 있는지 찾아보기. contains 는 boolean 을 리턴한다.
						stuNoFlg = stuNoList.contains(stuNo); 
						
										// ArrayList객체.contains(리스트 안의 'value 값')
										// => ArrayList 안에 'value 값'이 존재하면 true;
										//  					 		 없으면 false;
						
						//중복된 학번이 있는 경우!
						if(stuNoFlg) {  
							System.out.println("중복된 학번이 있습니다!");
							continue;
						}
						
						//중복된 학번이 없는 경우
						break; //stuNoFlg=false  //stuNo도 정해짐.
						
					}
					
					// while 문을 빠져나왔다 => 중복된 학번이 없다는 뜻
					
					//아래는 중복된 학번이 없는 경우!
					
					System.out.print("이름 : ");
					String name = s.next();
					
					System.out.print("나이 : ");
					int age = s.nextInt();
					
					Student student = new Student(stuNo, name, age);
					
					stuNoList.add(stuNo);
					list.add(student);
					
					System.out.println(stuNoList);
					System.out.println(list);
					
					
				} else if(menu == 2) {
					
					// 1.학번을 입력받아서 해당 학번 학생의 
					//   자바, 오라클, html 점수를 입력받아서 저장
					
					// 2.해당하는 학번 없을 경우 
					//  '해당 학번을 가진 학생이 없습니다' 출력 후 메뉴로 이동
					
					System.out.println("==점수를 등록할 학생의 학번을 입력해주세요==");
					
					boolean stuFlg = false;  //해당학번이 없다!
					
					System.out.print("학번 : ");
					String stuNo = s.next();
					
					for(int i = 0; i < list.size(); i++) { //리스트를 순회
						Student stu = list.get(i);  //리스트에 있는 Student 객체
													//리스트는 인덱스로 접근
						
						if(stuNo.equals(stu.getStuNo())) {
							
							stuFlg = true; //해당학번이 있다!
							
							System.out.println("--성적 입력하기--");
							
							stu.setJava(); //참조값으로 바로 가서 업데이트
							stu.setOracle();
							stu.setHtml();
							
						}
					}
					
					if(!stuFlg) {
						System.out.println("해당 학번의 학생이 없습니다.");
					}
				
					
				} else if(menu == 3) {
					
					// 모든 학생의 정보 출력
					// 학번 : ooo, 이름 : ooo, 자바 : oo, 오라클 : oo, html : oo
					
					System.out.println("==모든 학생의 정보를 출력합니다.==");
					
					for(int i = 0; i < list.size(); i++) { //리스트 순회
						
						Student stu = list.get(i);  //리스트는 인덱스로 접근
						
						System.out.print("학번 : " + stu.getStuNo() + ", ");
						System.out.print("이름 : " + stu.getName() + ", ");
						System.out.print("자바 : " + stu.getJava() + ", ");
						System.out.print("오라클 : " + stu.getOracle() + ", ");
						System.out.print("html : " + stu.getHtml());
						System.out.println();
					}
					
					
				} else if(menu == 4) {
					
					System.out.println("종료되었습니다.");
					break;
					
				} else {
					System.out.println("1~4 중에 선택하세요.");
				}
				
			} catch (Exception e) {

				s.next();  // 버퍼에 잘못 들어온 문자를 소진시켜주기.**
				System.out.println("에러 발생! 다시 시도해주세요!");
			}
		}
	}

}
