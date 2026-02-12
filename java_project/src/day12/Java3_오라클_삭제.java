package day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java3_오라클_삭제 {  // 복습완료(+)

	public static void main(String[] args) {
		
		DBClass db = new DBClass();    //필수
		Statement stmt = db.getStmt(); //필수
		
		try {
			// 스캐너로 학번 입력받아서 해당 학번 가진 학생 삭제
			Scanner s = new Scanner(System.in);
			System.out.print("삭제할 학번 : ");
			String stuNo = s.next();
			
			int result = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO = '" + stuNo + "'");  //1또는0(거짓)이 리턴됨.,,
			
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
