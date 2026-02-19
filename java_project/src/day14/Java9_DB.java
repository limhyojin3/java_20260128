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
				// 내일 오전에 마무리( )
				
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
