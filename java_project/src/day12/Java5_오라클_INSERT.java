package day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java5_오라클_INSERT { // 복습완료(+)

	public static void main(String[] args) {

		DBClass db = new DBClass(); // 데이터베이스와 연결!
		Statement stmt = db.getStmt(); // import: java.sql.Statement
		
		try {
			
			// 학번, 이름, 학과를 입력받아서 STUDENT 테이블에 저장
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("==학생을 등록합니다.==");
			
			String stuNo;
			
			while(true) {
				
				System.out.print("학번 입력(8자) : "); 
				stuNo = s.next();
				
				if(stuNo.length() != 8) {
					System.out.println("학번은 8글자 입니다.");
				} else {
					break;
				}
			}
			
			
			System.out.print("이름 입력 : ");
			String name = s.next();
			
			System.out.print("학과 입력 : ");
			String dept = s.next();
			
			String sql = "INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) "
					+ "VALUES('" + stuNo + "', '" + name + "', '" + dept + "')";
			
			System.out.println(sql);
			// INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) VALUES('12348888', '임숙자', '전기공학')
			
			int result = stmt.executeUpdate(sql); // 참이면 1, 거짓이면 0 반환한다.
			
//			-데이터 검색을 위해 executeQuery() 메소드 사용
//			-추가,수정,삭제와 같은 데이터 변경은 executeUpdate() 메소드 사용
			
			if(result > 0) {
				System.out.println("추가되었습니다!");
			} 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
