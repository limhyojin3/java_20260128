package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class 수도퀴즈2ㅁㄴㅇㅇㄴㅁㅇ연습 {

	static Scanner s = new Scanner(System.in);
	
	public static int quizCnt() {
		
		int cnt;
		while(true) {
			System.out.print("몇 문제를 푸실건가요?(3~10) : ");
			cnt = s.nextInt();
			
			if(!(3 <= cnt && cnt <= 10)) {
				System.out.println("다시 입력해주세요");
				continue;
			}
			break;
			
		}
		
		return cnt;
	}
	/// '문제풀이'메뉴에서 틀린 문제는 NOTE테이블에 추가
	public static void runQuiz(Statement stmt, Statement stmt2, String id) {
		
		try {
			
			//문제수를 사용자로부터 직접 입력받기(최소3, 최대 10)

			int cnt = quizCnt();
			
			String sql = "SELECT * FROM (SELECT * FROM TBL_QUIZ ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= " + cnt; //여기서는 쿼리문 안에 ;(세미콜론) 있으면 안됨..
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql); //쿼리문을 만족하는 행을 자바객체 형태로 가져옴.
			
			int quizNum = 1;
			
			int correctAns = 0;
			
			while(rs.next()) { //데이터가 있는경우
				System.out.println(quizNum + "번) " + rs.getString("COUNTRY") + " : ");
				
				String answer = s.next();
				
				if(answer.equals(rs.getString("CAPITAL"))) {
					System.out.println("정답!");
					correctAns++;
					
				} else {
					System.out.println("오답! 정답은 " + rs.getString("CAPITAL"));
					
//					USERID, QUIZ_ID, COUNTRY, CAPITAL
					
					String quizSql = "SELECT * FROM TBL_QUIZ WHERE CAPITAL = '" + rs.getString("CAPITAL") + "'";
					System.out.println(quizSql);
					
					ResultSet quizRs = stmt2.executeQuery(quizSql);
					quizRs.next();
					
					String checkSql = "SELECT * FROM TBL_NOTE WHERE USERID = '" + id + "' AND CAPITAL = '" + rs.getString("CAPITAL") + "'";
					System.out.println(checkSql);
					
					ResultSet noteRs = stmt2.executeQuery(checkSql);
				
					if(noteRs.next()) {
						
						System.out.println("이미 오답노트에 추가되어있습니다.");
						
					} else { //데이터가 없는경우.
						
						System.out.println("오답노트에 새로 추가합니다.");
						
						String insertSql = "INSERT INTO TBL_NOTE(USERID, QUIZ_ID, COUNTRY, CAPITAL) "
								+ "VALUES('" + id + "', " + quizRs.getInt("QUIZ_ID") + ", '" 
								+ quizRs.getString("COUNTRY") + "', '" + quizRs.getString("CAPITAL") + "')";
						
						System.out.println(insertSql);
						
						int result = stmt2.executeUpdate(insertSql);
						
						if(result > 0) {
							System.out.println("오답노트에 추가되었습니다.");
						} else {
							System.out.println("오답노트에 추가하지못했습니다.");
						}
					}
					
				}
				
				quizNum++;
			}
			
			System.out.println(cnt + "개의 문제 중 총 " + correctAns + "개 맞추셨습니다." );
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void addQuiz(Statement stmt) {
		
		try {
			
			// 추가할 나라 이름 입력 받은 후 db 에 있는지 없는지 확인
			
			System.out.print("추가할 나라 입력 : ");
			String country = s.next();
			
			String sql = "SELECT * FROM TBL_QUIZ WHERE COUNTRY = '" + country + "'";
			System.out.println(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) { //데이터가있는경우
				System.out.println("이미 입력된 나라 이름 입니다.");
				
			} else {
				
				System.out.print("수도를 입력해주세요 : ");
				String capital = s.next();
				sql = "INSERT INTO TBL_QUIZ VALUES(QUIZ_SEQ.NEXTVAL,"
						+ " '" + country + "', '" + capital + "')";
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("등록 성공!");
				} else {
					System.out.println("등록 실패!");
				}
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void editQuiz(Statement stmt) {
		
		// 나라 이름 입력 받은후 수도 이름 출력해주기
		// 필리핀 입력하면 '현재 등록된 수도명은 마니라 입니다.
		// 수정하시겠습니까? (Y/N)'
		// Y 누르면 수정, N 누르면 메인메뉴로
		// 그외 값 입력 시 다시 입력하도록
		// 없는 나라 입력시 '등록되지 않은 나라 입니다' 출력후 메인메뉴로.
		
		
		
		
		try {
			
			System.out.print("수도를 수정할 나라 이름 : ");
			String country = s.next();
			
			String sql = "SELECT * FROM TBL_QUIZ WHERE COUNTRY = '" + country + "'";
			System.out.println(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.println("현재 등록된 수도명은 " + rs.getString("CAPITAL"));
				System.out.print("수정하시겠습니까? (Y/N) : ");
				
				while(true) {
					
					String ans = s.next();
					
					if(ans.toUpperCase().equals("Y")) {
						
						System.out.print("수도명 : ");
						String capital = s.next();
						
						///** UPDATE, DELETE 할때는 WHERE 절 빠지지않았는지 꼭 확인 **
						sql = "UPDATE TBL_QUIZ SET CAPITAL = '" + capital + "' WHERE COUNTRY = '" + country + "'" ;
						System.out.println(sql);
						
						int result = stmt.executeUpdate(sql);
						
						if(result > 0) {
							System.out.println("수정되었습니다!");
						} else {
							System.out.println("수정에 실패했습니다.");
						}
						
						break;
						
					} else if (ans.toUpperCase().equals("N")) {
						
						System.out.println("메인 메뉴로 돌아갑니다.");
						break;
					} else {
						System.out.print("Y/N 중에서 선택해주세요 : ");
					}
				}
			} else {
				System.out.println("등록되지않은 나라입니다. 메인메뉴로 돌아갑니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}
	public static void removeQuiz(Statement stmt) {
		
	}
	
	/// 메인 메뉴 들어가기 전 상위 메뉴입장
	/// 상위메뉴는 1.로그인, 2.회원가입
	/// -로그인에 성공해야 메인 메뉴로

	/// 회원가입은 아이디/PWD/이름 입력받아서 저장
	/// -아이디는 입력받은후 중복체크

	/// 메인메뉴에서는 '오답 노트'메뉴 추가(+)
	/// '문제풀이'메뉴에서 틀린 문제는 NOTE테이블에 추가(+)
	/// 단, 이미 추가된 문제는 추가하지 말것(+)

	/// '오답 노트'메뉴에서는 그동안 틀린 문제들 출력(+)
	/// 맞춘 문제는 NOTE 테이블에서 삭제 (+)
	
	//-> 미리 예습정도
	
	
	public static void callMainMenu(Statement stmt, Statement stmt2, String id) {
		
		
		boolean closeFlg = true;
		
		while(closeFlg) {
			
			try {
				
				System.out.print("[1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5.오답 노트 6. 종료] : ");
				int menu = s.nextInt();
				
				switch (menu) {
					case 1:
						runQuiz(stmt, stmt2, id);
						break;
					case 2:
						addQuiz(stmt);
						break;
					case 3:
						editQuiz(stmt);
						break;
					case 4:
						removeQuiz(stmt);
						break;
					case 5:
						mistakeNote(stmt);
						break;
					case 6:
						System.out.println("종료되었습니다.");
						closeFlg = false;
						break;
					default:
						System.out.println("1~5중에 선택해주세요.");
						break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
				
	}
	
	/// '오답 노트'메뉴에서는 그동안 틀린 문제들 출력(+)
	/// 맞춘 문제는 NOTE 테이블에서 삭제(+)

	public static void mistakeNote(Statement stmt) {
		
		try {
			
			System.out.println("==틀린문제들==");
			
			String sql = "SELECT * FROM TBL_NOTE";
			System.out.println(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			int quizNum = 1;
			
			while(rs.next()) { //데이터가 있는경우
				System.out.println(quizNum + "번) " + rs.getString("COUNTRY") + " : ");
				
				String answer = s.next();
				
				if(answer.equals(rs.getString("CAPITAL"))) {
					System.out.println("정답!");
					
					sql = "DELETE FROM TBL_NOTE WHERE CAPITAL = '" + rs.getString("CAPITAL") + "'";
					System.out.println(sql);

					int result = stmt.executeUpdate(sql);
					
					if(result > 0) {
						System.out.println("오답노트 갱신!");
					} else {
						System.out.println("오답노트 갱신에 실패");
					}
					
				} else {
					System.out.println("오답! 정답은 " + rs.getString("CAPITAL"));
				}
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

	/// 회원가입은 아이디/PWD/이름 입력받아서 저장(+)
	/// -아이디는 입력받은후 중복체크(+)
	public static void joinMembership(Statement stmt) {
		
		try {
			
			while(true) {
				System.out.print("아이디 입력 : ");
				String id = s.next();
				
				String sql = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
				System.out.println(sql);
				
				ResultSet rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					
					System.out.println("이미 존재하는 id입니다.");
					continue;
				}
				
				//데이터 없는경우
				System.out.print("pwd 입력 : ");
				String pwd = s.next();
				
				System.out.print("이름 입력 : ");
				String name = s.next();
				
				sql = "INSERT INTO TBL_USER(USERID, PWD, USERNAME) VALUES('" + id + "', '" + pwd + "', '" + name + "')";
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("회원가입성공!");
				} else {
					System.out.println("회원가입실패");
				}
				
				break;
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public static String login(Statement stmt) {
		
		try {
			
			System.out.print("아이디를 입력하세요 : ");
			String id = s.next();
			
			System.out.print("pwd를 입력하세요 : ");
			String pwd = s.next();
			
			String sql = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "' AND PWD = '" + pwd + "'";
			System.out.println(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.println("로그인에 성공했습니다! 환영합니다.");
				
				return id;
			} else {
				System.out.println("아이디 또는 비밀번호가 맞지않습니다.");
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	
	public static void main(String[] args) {

		//CRUD:create, read, update, delete
		// 1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료
		
		DBClass db = new DBClass();
		Statement stmt = db.getStmt(); // db 를 조회하기위해 Statement 객체 이용
		Statement stmt2 = db.getStmt();
		
		
		while(true) {
			
			try {
				
				while(true) {
					System.out.print("[1.로그인, 2.회원가입] : ");
					int menu = s.nextInt();
					
					switch (menu) {
						case 1:
							String id = login(stmt);
							
							if(id != null) {
								callMainMenu(stmt, stmt2, id);
							} else {
								System.out.println("로그인에 실패했습니다.");
							}
							
							break;
						
						case 2:
							joinMembership(stmt);
							break;
						
						default:
							
							System.out.println("1~2번 메뉴를 선택해주세요");
							break;
							
					}
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
}
