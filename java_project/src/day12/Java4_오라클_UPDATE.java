package day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java4_오라클_UPDATE { // 복습완료(+)

	public static void main(String[] args) {

		DBClass db = new DBClass(); // 데이터베이스와 연결!
		Statement stmt = db.getStmt(); // import: java.sql.Statement
		
		try {
			
			// 학번을 입력받아서 클래스를 D 로 만들기
			Scanner s = new Scanner(System.in);
			
			System.out.print("업데이트할 학생의 학번 입력 : "); 
			String stuNo = s.next();
			
			String sql = "UPDATE STUDENT SET " 
					+ "STU_CLASS = 'D' "
					+ "WHERE STU_NO = '" + stuNo + "'";
			
			System.out.println(sql);
			
			int result = stmt.executeUpdate(sql);
						// stmt.executeUpdate(String 쿼리문);
						//-> 결과값을 int로 반환한다. 성공하면 1, 실패하면 0
			
			if(result > 0) {
				System.out.println("수정되었습니다!");
			} else {
				System.out.println("해당 학번 가진 학생 없음!");
			}
			
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
	}

}
