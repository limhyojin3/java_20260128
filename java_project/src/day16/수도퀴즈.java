package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class 수도퀴즈 {

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
	
	public static void runQuiz(Statement stmt) {
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

	/// 메인메뉴에서는 '오답 노트'메뉴 추가
	/// '문제풀이'메뉴에서 틀린 문제는 NOTE테이블에 추가
	/// 단, 이미 추가된 문제는 추가하지 말것

	/// '오답 노트'메뉴에서는 그동안 틀린 문제들 출력
	/// 맞춘 문제는 NOTE 테이블에서 삭제 
	
	
	
	public static void main(String[] args) {

		//CRUD:create, read, update, delete
		// 1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료
		
		DBClass db = new DBClass();
		Statement stmt = db.getStmt(); // db 를 조회하기위해 Statement 객체 이용
		
		boolean closeFlg = true;
		while(closeFlg) {
			System.out.print("[1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료 ] : ");
			int menu = s.nextInt();
			
			switch (menu) {
				case 1:
					runQuiz(stmt);
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
					System.out.println("종료되었습니다.");
					closeFlg = false;
					break;
				default:
					System.out.println("1~5중에 선택해주세요.");
					break;
			}
		}
		
	}

}
