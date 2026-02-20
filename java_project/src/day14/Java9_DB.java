package day14;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class Java9_DB {
	
	//복습(+)
	public static void searchStudent(Statement stmt) { //DB와 연결(외부와 연결) 할때는 예외처리(try-catch) 필수
		
		try {
			String sql = "SELECT * FROM TBL_STUDENT";
			ResultSet rs = stmt.executeQuery(sql);  //쿼리문 실행결과를 자바객체 형태로 받아옴(ResultSet)
			//rs 는 커서위치. 해당하는 테이블이나 행의 바로 위에 커서가 위치함.
			
			while(rs.next()) { //데이터가 있는경우(rs.next()==true) 
				System.out.print("학번 : " + rs.getString("STU_NO") + ", ");
				System.out.print("이름 : " + rs.getString("STU_NAME"));
				System.out.println();
				
				//데이터가 없으면 rs.next()가 false 가 되어 while 문 빠져나간다.
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//복습(+)
	public static void addStudent(Statement stmt) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			
			String stuNo = "";
			
			while(true) {  //데이터가 있는경우
			
				System.out.print("학번 : ");
				stuNo = s.next();
				
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				System.out.println(sql);
				
				//행을 조회
				ResultSet rs = stmt.executeQuery(sql); //만족하는 행을 객체형태로 받아옴.
				//커서위치
				
				if(rs.next()) {
					
					System.out.println("이미 사용중인 학번입니다.");
					continue;
					
				}
				
				break;
			}
			
			System.out.print("이름 : ");
			String name = s.next();
			System.out.print("학과 : ");
			String dept = s.next();
			
			String sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT)"
					+ " VALUES('" + stuNo +"', '" + name + "', '" + dept + "')";
			System.out.println(sql);
			
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("추가되었습니다!");
			} else {
				System.out.println("잘못되었습니다!");
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
//		s.close(); 
	}
	
	//복습(+)
	public static void removeStudent(Statement stmt) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			
			System.out.print("삭제할 학생 학번 입력 : ");
			String stuNo = s.next();
			
			String sql = "DELETE FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			System.out.println(sql);
			
			int result = stmt.executeUpdate(sql); //db 로 가서 쿼리문실행
			
			if(result > 0) {
				System.out.println("삭제되었습니다!");
			} else {
				System.out.println("삭제에 실패했습니다!");
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void editStudent(Statement stmt, String mySol) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			
			String stuNo = "";
			
			while(true) {  
			
				System.out.print("학번 : ");
				stuNo = s.next();
				
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				System.out.println(sql);
				
				//행을 조회
				ResultSet rs = stmt.executeQuery(sql); //만족하는 행을 객체형태로 받아옴.
				//커서위치
				
				if(rs.next()) {
					System.out.print("[ 1. 자바, 2. 오라클, 3. HTML ] : ");
					int menu = s.nextInt();
					
					switch (menu) {
					case 1:
						
						sql = editScore("자바", "JAVA", stuNo);
						// 공통부분은 메서드로 틀을 잡고,
						// 서로다른부분은 '매개변수로 외부에서 받는다' 생각.
						break;

					case 2:
						sql = editScore("오라클", "ORACLE", stuNo);
						break;
						
					case 3:
						sql = editScore("HTML", "HTML", stuNo);
						break;
	
					default:
						
						System.out.println("1~3중에 선택해주세요.");
						break;
					}
					
					int result = stmt.executeUpdate(sql);
					
					if(result > 0) {
						System.out.println("수정되었습니다!");
					} else {
						System.out.println("수정에 실패했습니다!");
					}
					
					break;
					
				} else {
					System.out.println("없는 학번 입니다.");
				}
				
				
			}
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void editStudent(Statement stmt) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			
			String stuNo = "";
			
			while(true) {  
			
				System.out.print("학번 : ");
				stuNo = s.next();
				
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				System.out.println(sql);
				
				//행을 조회
				ResultSet rs = stmt.executeQuery(sql); //만족하는 행을 객체형태로 받아옴.
				//커서위치
				
				if(rs.next()) {
					System.out.print("[ 1. 자바, 2. 오라클, 3. HTML ] : ");
					int menu = s.nextInt();
					int score = 0;//(+)
					String subject = "";//(+)
					
					switch (menu) {
					case 1:
						
						score = inputScore("자바");  //1.score 따로
						subject = "JAVA";			//2.column 명 따로
						break;

					case 2:
						score = inputScore("오라클");
						subject = "ORACLE";
						break;
						
					case 3:
						score = inputScore("HTML");
						subject = "HTML";
						break;
	
					default:
						
						System.out.println("1~3중에 선택해주세요.");
						break;
					}
					
					sql = "UPDATE TBL_STUDENT SET " + subject + " = " + score + " WHERE STU_NO = '" + stuNo + "'";
					//3.쿼리문 따로
					
					int result = stmt.executeUpdate(sql);
					
					if(result > 0) {
						System.out.println("수정되었습니다!");
					} else {
						System.out.println("수정에 실패했습니다!");
					}
					
					break;
					
				} else {
					System.out.println("없는 학번 입니다.");
				}
				
				
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int inputScore(String subject) {
		
		Scanner s = new Scanner(System.in);
		
		int score = 0;
		
		while(true) {
			
			System.out.print(subject + " : ");
			score = s.nextInt();
			
			if(0 <= score && score <= 100) {
				break;
			} else {
				System.out.println("0~100 사이 값을 입력해주세요");
			}
			
		}
		return score;
	}
	
	public static String editScore(String korSubject, String dbColumn, String stuNo) {
		
		Scanner s = new Scanner(System.in);
		
		int score;
		String sql = "";
		
		while(true) {
			
			System.out.print(korSubject + " : ");
			score = s.nextInt();
			
			if(!(0 <= score && score <= 100)) {
				System.out.println("점수의 범위는 0~100사이 입니다.");
				continue;
			}
			break;
			
		}
		
		sql = "UPDATE TBL_STUDENT SET " + dbColumn + " = " + score + " WHERE STU_NO = '" + stuNo + "'";
		System.out.println(sql);
		
		return sql;
	}
	

	//2026.02.19 복습(+)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();    // main 에서 생성자 호출하면 데이터베이스와 연결됨!
		Statement stmt = db.getStmt(); // db 를 조회하기위해 Statement 객체 이용
		
		// 1. 검색, 2. 추가, 3. 수정, 4. 삭제
		
		while(true) {
			System.out.print("[1. 검색, 2. 추가, 3. 수정, 4. 삭제 ] : ");
			
			int menu = s.nextInt();
			
			if(menu == 1) {
				searchStudent(stmt);
				
			} else if (menu == 2) {
				addStudent(stmt);
				
			} else if (menu == 3) {
				editStudent(stmt);
				
			} else if (menu == 4) {
				removeStudent(stmt);
				
			} else if (menu == 5) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~5 사이 메뉴 선택하세요.");
			}
		}
		
	}

}
