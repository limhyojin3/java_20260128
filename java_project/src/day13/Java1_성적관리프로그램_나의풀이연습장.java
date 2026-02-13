package day13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day12.Message;

public class Java1_성적관리프로그램_나의풀이연습장 {
	
	static Scanner s = new Scanner(System.in);
	
	public static ResultSet checkStudent(Statement stmt, String stuNo) {
		
		ResultSet rs = null;
		
		try {
			
			String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return rs;
		
	}
	
	//학번을 입력받은 후 해당 학생 존재하는지 확인
	public static ResultSet checkStudent(Statement stmt) {
		
		ResultSet rs = null;
		
		try {
			
			System.out.print("학번입력 : ");
			String stuNo = s.next();
			
			String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			// 데이터베이스로 가서 확인후 자바객체형태로 받아옴
			//-> rs 는 커서위치
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		return rs;
		
		
	}
	
	public static void addStudent(Statement stmt) {

		// 1. 학생 추가(학번, 이름, 학과 입력받아서 저장)
		///   -> 학번을 입력받은 후 해당 학생 존재하는지 확인
		//    -> 학번은 무조건 4자리
		
		try {
			
			ResultSet rs;
			String stuNo;
			
			while(true) {
				
				System.out.print("학번입력 : ");
				stuNo = s.next();
			
				if(stuNo.length() != 4) {
				
					System.out.println("학번은 4자리 여야합니다.");
					continue;
				}
				
				rs = checkStudent(stmt, stuNo); //학생찾기
			    
				if(rs.next()) { // 데이터가있는경우, 등록된 학번이 이미있는경우
					
					System.out.println("이미 등록된 학번이 있습니다. 다시 입력해주세요.");
					continue;
					
				} 
				
				// 데이터가 없는경우
				System.out.print("이름입력: ");
				String name = s.next();
				
				System.out.print("학과입력: ");
				String dept = s.next();
				
				String sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT)"
							+ " VALUES('" + stuNo + "', '" + name + "', '" + dept + "')"; 
				
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("학생을 등록했습니다!");
				} else {
					System.out.println("등록실패");
				}
				
				return;
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void addScore(Statement stmt) {
		
		// 2. 성적 입력
		///   -> 학번을 입력받은 후 해당 학생 존재하는지 확인
		//    -> 자바, 오라클, HTML 점수를 입력받아서 DB 에 저장(+)
		//    -> 점수는 0~100사이 값을 입력받아서 저장 하도록 함(+)
		
		try {
			
			ResultSet rs = checkStudent(stmt); //rs OR null
			
			if(rs.next()) { // 데이터가 있는경우
				
//				//이미 등록된 성적이 있는 경우
				if (rs.getString("JAVA") != null) {
					
					System.out.println("이미 등록된 성적이 있습니다.");
					return;
				}
				
				int java = setScore("java");
				int oracle = setScore("oracle"); 
				int html = setScore("html");
				
				String sql = "UPDATE TBL_STUDENT SET JAVA = " + java 
							+ ", ORACLE = " + oracle + ", HTML = " 
							+ html + " WHERE STU_NO = '" + rs.getString("STU_NO") + "'";  //**INSERT INTO는 행이 없을때 행을 추가
																						  //**UPDATE SET 은 행이 존재할때 value 값을 세팅
				
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("점수입력완료!");
				} 
				
			} else { // 데이터가 없는경우
				 
				System.out.println("해당 학생이 없습니다.");
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

	public static int setScore(String subject) {
		
		int score;
		
		while(true) {
			
			System.out.print(subject + "점수: ");
			score = s.nextInt();
			
			// 점수는 0~100사이 값을 입력받기
			if(!(0 <= score && score <= 100)) {
				System.out.println("0~100 사이로 다시 입력해주세요.");
				continue;
			}
			
			return score;
		}
		
	}
	
	public static void searchScore(Statement stmt) {
		
		// 3. 성적 확인
		///   -> 학번을 입력받은 후 해당 학생 존재하는지 확인
		//    -> 해당 학생의 이름, 각 과목의 점수를 출력(+)
				
		
		try {
			
			ResultSet rs = checkStudent(stmt);  //rs OR null
			
			if(rs.next()) { // 데이터가 있는 경우 //rs 가 가리키는 행
				
				if(rs.getString("JAVA") == null) {
					
					System.out.println("아직 성적이 입력되지않았습니다.");
					return;
				}
																		///디버깅~
				System.out.println("학생이름: " + rs.getString("STU_NAME") ///<= rs.getString("NAME"): 부적합한 열 이름; 테이블 속성명과 일치시켜줘야함**
							+ ", 과목별 점수: (자바: " + rs.getInt("JAVA") + "), "
							+ "(오라클: " + rs.getInt("ORACLE") + "), (HTML: " + rs.getInt("HTML") + ")");
				
			} else { // 데이터가 없는 경우
				System.out.println("해당 학생이 없습니다.");
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void editScore(Statement stmt) {
		
		// 4. 성적 수정
		///   -> 학번을 입력받은 후 해당 학생 존재하는지 확인
		//    -> 수정하고자 하는 과목 선택(1. 자바, 2. 오라클, 3. HTML)
		//    -> 점수 입력받은 후(0~100) 수정
		
		try {
			
			ResultSet rs = checkStudent(stmt);
			
			if(rs.next()) { //데이터가 있는경우
				
				if(rs.getString("JAVA") == null) {
					
					System.out.println("아직 성적이 입력되지않았습니다. 수정할 성적이 없습니다.");
					return;
				}
				
				while(true) {
					
					System.out.print("수정할 과목 선택 (1.자바, 2.오라클, 3.HTML) : ");
					int menu = s.nextInt();
					String sql = null;
					int result = 0;
					
					switch (menu) {
						case 1:
							int java = setScore("java");
							
							sql = "UPDATE TBL_STUDENT SET JAVA = " + java 
								+ " WHERE STU_NO = '" + rs.getString("STU_NO") + "'";
							
							break;
						case 2:
							int oracle = setScore("oracle");
							
							sql = "UPDATE TBL_STUDENT SET ORACLE = " + oracle 
								+ " WHERE STU_NO = '" + rs.getString("STU_NO") + "'";
							
							break;
						case 3:
							int html = setScore("html");
							
							sql = "UPDATE TBL_STUDENT SET HTML = " + html 
								+ " WHERE STU_NO = '" + rs.getString("STU_NO") + "'";
							
							break;
						default:
							System.out.println("1~3번 중에 선택해주세요.");
							break;
						
					}
					if(!(1 <= menu && menu <= 3)) {
						continue;
					}
					
					System.out.println(sql);
					result = stmt.executeUpdate(sql);
					
					if(result > 0) {
						System.out.println("성적 수정 완료!");
						return;
					}
					
				}
			} else {
				
				System.out.println("해당 학생이 없습니다.");
				
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		
		DBClass db = new DBClass();   //데이터베이스와 연결
		Statement stmt = db.getStmt();   //stmt 로 데이터베이스 조회
		
		boolean flg = true;
		
		while(flg) {
			
			try {
				while(flg) {
					
					//CRUD
					//select-search , insert-add, update-edit, delete-remove
					System.out.print("[1.학생추가, 2.성적입력, 3.성적확인, 4.성적수정, 5.종료] : "); 
					int menu = s.nextInt();
					
					switch (menu) {
						case 1:
							addStudent(stmt);
							break;
						case 2:
							addScore(stmt);
							break;

						case 3:
							searchScore(stmt);
							break;

						case 4:
							editScore(stmt);
							break;

						case 5:
							System.out.println("종료합니다");
							flg = !flg;
							break;


						default:
							System.out.println("1~5번 중에 선택해주세요");
							break;
					}
					
					
				}
				
			} catch (Exception e) {
				s.next(); //버퍼 비워주기.  잘못들어온 문자 소진시켜주기.
				System.out.println("숫자를 입력하세요.");
				System.out.println(e.getMessage());
			}
			
			
		}
		

	}


}
