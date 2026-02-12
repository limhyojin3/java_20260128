package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java1_오라클연결 {

	public static void main(String[] args) { //복습완료(+)

		Connection conn;
		Statement stmt = null;
		
		try {  // 예외처리 필수
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";  // xe
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();
//			System.out.println("DB 연결 완료");      //-> 여기까지 오라클이랑 연결하려면 기본세팅
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT"); //쿼리작성시 ;(세미콜론) 생략
			//rs 는 커서위치 , 테이블 맨 위의 빈공간에서 시작!**
			
			
			while(rs.next()) {
				System.out.print(rs.getString("STU_NO") + " || ");
								// (->)커서위치.getString("속성") => value 값을 리턴한다
				String name = rs.getString("STU_NAME") + " || ";
				System.out.print(name);
				
				System.out.println(rs.getString("STU_DEPT"));
			}
			
			
			//rs.next();  //커서이동
			
			

//			rs.next();
//			System.out.println(rs.getString("STU_NAME"));
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		
	}

}
