package day12;

import java.sql.SQLException;
import java.sql.Statement;

public class Java2_오라클_삭제 { // 복습완료(+)

	public static void main(String[] args) {

		// 이제부터 new DBClass(); 생성자 호출해서 데이터베이스와 연결!
		DBClass db = new DBClass();    //필수
		Statement stmt = db.getStmt(); //필수
		
		// try-catch 문은 기본중에 기본.
		try {
			int result = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO = '12123434'");  //1(참)또는0(거짓)이 리턴됨.,,
			
			if(result > 0) {
				System.out.println("삭제되었습니다!");
			} else {
				System.out.println("해당 학생 없음!!");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
