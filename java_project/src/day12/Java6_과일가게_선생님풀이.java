package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Java6_과일가게_선생님풀이 {

	public static void addFruit(Statement stmt) { // DB는 try-catch 안에서 작업 필수!
		
		//addFruit() 복습완료(세모) -> 한번 더 보면 좋을듯( )
		
		try {

			// 과일 이름, 개수, 가격 입력받아서 DB(TBL_FRUIT)에 저장
			// 과일 이름이 이미 있는 경우 개수만 입력받아서 기존거에 더해주기
			
			Scanner s = new Scanner(System.in);
			
			System.out.print("과일 이름 : ");
			String name = s.next();
			
			System.out.print("개수 : ");
			int count = s.nextInt();
				
			
			// ResultSet 은 자바의 객체(자바가 조회가능)
			ResultSet rs = stmt.executeQuery("SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'");  //네임이 PrimayKey(where 절..)
			// <= 1.해당 테이블의 where 절 조건을 만족하는 행이 있는지 조회한다.
			// 2.rs 는 커서(커서위치) -> 만족하는 행의 바로 위.(또는 만족하는 테이블의 바로 위)
			
			if(rs.next()) { // where name = name; 이 있는경우  // 해당하는 행이 있는경우
				
//				Integer.parseInt(rs.getString("COUNT"));
				int updateCnt = rs.getInt("COUNT") + count;
								// DB 에서 가져온값 + 입력받은 개수
								// rs.getInt(속성) 
								// -> 'rs 가 가리키는 행'의 '속성'에 있는 'value 값' 리턴
				
				String sql = "UPDATE TBL_FRUIT SET "
							+ "COUNT = " + updateCnt 
							+ " WHERE NAME = '" + name + "'";  // 쿼리문 작성
				
				int result = stmt.executeUpdate(sql); // DB 에 업데이트 하고 결과값을 반환(1 또는 0)
				
				if(result > 0) {
					System.out.println("개수가 추가되었습니다.");
				} else {
					System.out.println("추가에 실패했습니다.");
				}
				
			} else {  // where name = name; 이 없는 경우
				
				System.out.print("가격 : ");
				int price = s.nextInt();
					
				String sql = "INSERT INTO TBL_FRUIT VALUES("
						+ "'" + name + "',"
						+ price + ", " 
						+ count + ")";
				
				System.out.println(sql); //SQL쿼리문 출력(한번 확인)
				
				int result = stmt.executeUpdate(sql); // 쿼리문(sql) 을 DB 에 업데이트하고 결과를 1이나 0으로 반환한다
				
				if(result > 0) {
					System.out.println("추가되었습니다!");
				}
			}
			
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void searchFruit(Statement stmt) { // DB는 try-catch 안에서 작업 필수!
		
		try {
			
			String sql = "SELECT * FROM TBL_FRUIT";
			
			ResultSet rs = stmt.executeQuery(sql);
			// DB 에서 자바의 객체(ResultSet) 형태로 전달
			
			while(rs.next()) {
				System.out.print(rs.getString("NAME") + " | ");
				System.out.print(rs.getInt("PRICE") + " | ");
				System.out.println(rs.getInt("COUNT"));
			} //rs.next() 에 데이터가 없으면 rs.next()가 false 가 되어 while 문을 빠져나간다(while(false))
			
//			rs.next();
//			System.out.print(rs.getString("NAME") + " | ");
//			System.out.print(rs.getInt("PRICE") + " | ");
//			System.out.println(rs.getInt("COUNT"));
//			
//			rs.next();
//			System.out.print(rs.getString("NAME") + " | ");
//			System.out.print(rs.getInt("PRICE") + " | ");
//			System.out.println(rs.getInt("COUNT"));
//			
//			rs.next();
//			System.out.print(rs.getString("NAME") + " | ");
//			System.out.print(rs.getInt("PRICE") + " | ");
//			System.out.println(rs.getInt("COUNT"));
//			
//			rs.next();
//			System.out.print(rs.getString("NAME") + " | ");
//			System.out.print(rs.getInt("PRICE") + " | ");
//			System.out.println(rs.getInt("COUNT"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 삭제
	public static void removeFruit(Statement stmt) {
		
		try {
			// 과일 이름 입력받고 삭제하기
			// 과일 이름이 db 에 있으면 정말 삭제할지 한번 더 물어 보고('Y', 'N') 삭제
			// 대소문자 구분 없이 Y(y)하면 삭제, N(n)하면 메뉴로 이동
			// 그외 문자 입력 시 'Y, N 중에 선택 하세요' 출력 후 다시 입력하도록
			// 과일 이름 없으면 '해당 과일은 존재하지 않습니다' 출력 후 메뉴로
		
			Scanner s = new Scanner(System.in);
			System.out.print("삭제할 과일 이름 : ");
			String name = s.next();
		
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				while(true) {
					
					System.out.print("정말 삭제하시겠습니까?(예: y, 아니오: n) : ");
					String confirm = s.next();
					
					if(confirm.toUpperCase().equals("Y")) {
						
						sql = "DELETE FROM TBL_FRUIT WHERE NAME = '" + name + "'";
						int result = stmt.executeUpdate(sql);
						
						if(result > 0) {
							System.out.println(name + "을(를) 삭제합니다.");
						} 
						
						return;
						
					} else if(confirm.toUpperCase().equals("N")) {
						
						return; // 메서드 빠져나감
						
					} else {
						System.out.println("y/n 중 선택하세요.");
					}
					
				}
				
				
				
			} else {
				System.out.println(Message.failMsg);
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void sellFruit(Statement stmt) {
		
		try {
			
			Scanner s = new Scanner(System.in);
			System.out.print("삭제할 과일 이름 : ");
			String name = s.next();
		
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			
			if(rs.next()) { 
				
				System.out.print("판매 개수 : ");
				int count = s.nextInt();
				
				if(rs.getInt("COUNT") >= count) {
					
				
					sql = "UPDATE TBL_FRUIT SET "
							+ "COUNT = " + (rs.getInt("COUNT") - count)
							+ " WHERE NAME = '" + name + "'";
					
					int result = stmt.executeUpdate(sql);
					
					if (result > 0) {
						System.out.println("판매했습니다!");
					}
					
				} else {
					System.out.println("물량 부족! 현재 판매 가능한 개수는 " + rs.getInt("COUNT"));
				}
				
				
				
				
				
			} else {
				System.out.println(Message.failMsg); // **static 변수나 메서드는 클래스로 접근.
			}
			
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		DBClass db = new DBClass(); 
		Statement stmt = db.getStmt(); // Statement 를 통해서 database 를 조회한다.
									   // => Statement 객체를 이용
		
		try { // DB는 try-catch 안에서 작업 필수!
		
			// 1. 과일 추가, 2. 과일 판매, 3. 가격 수정, 4. 과일 삭제. 5.과일 확인 6. 종료
			
			boolean flg = true;
			
			while(flg) { // <- while(제어할만한 변수)
				
				// CRUD - 메서드 네임 짝지음
				//select-search, update-edit, delete-remove, insert-add
				
				System.out.print("[1.과일 추가, 2.과일 판매, 3.가격 수정, 4.과일 삭제. 5.과일 확인 6.종료] : ");
				int menu = s.nextInt();
				
				switch (menu) {
					case 1:
						addFruit(stmt);
						break;
						
					case 2:
						sellFruit(stmt);
						break;
					case 3:
						
						break;
					case 4:
						removeFruit(stmt);
						break;
					case 5:
						searchFruit(stmt);
						break;
					case 6:
						System.out.println("종료되었습니다!");
						flg = !flg;
						break;
					default:
						System.out.println("1~5 사이 메뉴를 선택하세요.");
						break;
				}
				
				
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
