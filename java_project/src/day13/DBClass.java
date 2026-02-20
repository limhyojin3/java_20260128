package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
						
public class DBClass { // DB클래스를 새로 작성(데이터베이스(오라클)가 연결 되는 코드를 적어둠)
	
	private Connection conn;
	private Statement stmt = null;    //stmt = conn.createStatement();

	public Statement getStmt() {
		return stmt;
	}
	
	public DBClass(){  // main 에서 생성자 호출하면 데이터베이스와 연결됨!
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			stmt = conn.createStatement(); ///
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
			
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

	
} // 2026.02.20 복습(+)
