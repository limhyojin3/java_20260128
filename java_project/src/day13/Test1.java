package day13;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import day12.Message;

public class Test1 {
	
	private static DBClass db = new DBClass();
	private static Statement stmt = db.getStmt();

	private static Scanner s = new Scanner(System.in);
	
	public static ResultSet checkStudent(String stuNo) {
		
		ResultSet rs = null;
		
		while(true) {
			try {
				
				if(stuNo.length() != 4) {
					
					System.out.println("4자리로 입력하세요");
					continue;
				}
				
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				
				rs = stmt.executeQuery(sql);
				
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
			
			return rs;
		}
		
	}
	
	public static ResultSet checkStudent() {
		
		ResultSet rs = null;
		
		while(true) {
			try {
				
				System.out.print("학번 : ");
				String stuNo = s.next();
				
				if(stuNo.length() != 4) {
					
					System.out.println("4자리로 입력하세요");
					continue;
				}
				
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				
				rs = stmt.executeQuery(sql);
				
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
			
			return rs;
		}
		
	}
	
	public static void addStudent() {
		
		while(true) {
			
			try {
				
				System.out.println("학번 : ");
				String stuNo = s.next();
				
				ResultSet rs = checkStudent(stuNo);
				
				if(rs.next()) {
					System.out.println("이미 사용중인 학번입니다.");
					continue;
				} 
					
				System.out.print("이름 : ");
				String stuName = s.next();
				
				System.out.print("학과 : ");
				String stuDept = s.next();
				
				String sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT)"
							+ " VALUES('" + stuNo + "', '" + stuName + "', '" + stuDept + "')";
				
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("추가 됨!");
					
				} else {
					System.out.println(Message.failMsg);
				}
				
				return;
			
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static int setScore(String subject) {  /// 1.달라지는 부분은 매개변수로 외부에서 받는다.
												  /// 2.활용할 결과를 타입을 정해준다.
		
		while(true) {
			
			System.out.print(subject + " : ");
			int score = s.nextInt();
			
			if(!(0 <= score && score <= 100)) {
				System.out.println("0~100 사이 입력하세요.");
				continue;
			} 
			
			return score;
		}
	}
	
	public static void addScore() {
		
		
		try {
			
			ResultSet rs = checkStudent();
			
			if(rs.next()) {
				
				int java = setScore("자바");
				int oracle = setScore("오라클");
				int html = setScore("HTML");
				
				String sql = "UPDATE TBL_STUDENT SET JAVA = " + java 
					+ ", ORACLE = " + oracle + ", HTML = " + html 
					+ " WHERE STU_NO = '" + rs.getString("STU_NO") + "'";
				
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("업데이트 했습니다!");
				} else {
					System.out.println(Message.failMsg);
				}
				
				return;
				
			} 
			
			System.out.println("해당 학번 학생 없음");
			
		
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void searchScore() {
		
		
		try {
			
			ResultSet rs = checkStudent();
			
			if(rs.next()) {
									   //'rs 가 가리키는 행'의 '속성'으로 가서 해당하는 'value 값'을 반환한다.
				System.out.print("[" + rs.getString("STU_NO") + "] ");
				System.out.print("자바 : " + rs.getInt("JAVA") + ", ");
				System.out.print("오라클 : " + rs.getInt("ORACLE") + ", ");
				System.out.println("HTML : " + rs.getInt("HTML"));
				
				return;
			} 
			
			System.out.println("해당 학번 학생 없음");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	

	public static void editScore() {
		
		
		try {
			
			ResultSet rs = checkStudent();
			
			if(rs.next()) {
				
				boolean scoreFlg = false;
				String selectSubject = "";
				int score = 0;
				
				while(!scoreFlg) {
					
					System.out.print("[1. 자바, 2. 오라클, 3. HTML] : ");
					
					int menu = s.nextInt();
					
					
					switch (menu) {
						case 1:
							score = setScore("자바");
							selectSubject = "JAVA";
							scoreFlg = true;
							break;
						case 2:
							score = setScore("오라클");
							selectSubject = "ORACLE";
							scoreFlg = true;
							break;
						case 3:
							score = setScore("HTML");
							selectSubject = "HTML";
							scoreFlg = true;
							break;
						default:
							System.out.println("1~3번중에 선택해주세요.");
							break;
					}
					
				} 
				//점수변경했음! selectSubject가 채워진상태!
				
				String sql = "UPDATE TBL_STUDENT SET " + selectSubject 
							+ " = " + score + " WHERE STU_NO = '" 
							+ rs.getString("STU_NO") + "'";
				
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("수정되었습니다.");
				} else {
					System.out.println(Message.failMsg);
				}
				
				return;
			}
			
			System.out.println("해당 학번 학생 없음");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {

		while(true) {
			
			try {
				
				System.out.print("[1.학생추가, 2.성적입력, 3.성적확인, 4.성적수정, 5.종료] : ");
				int menu = s.nextInt();
				
				switch (menu) {
					case 1:
						addStudent();
						break;
						
					case 2 :
						addScore();
						break;

					case 3:
						searchScore();
						break;

					case 4:
						editScore();
						break;
						
					case 5:
						System.out.println("프로그램을 종료합니다.");
						return;
						
					default:
						System.out.println("1~5번 숫자를 선택하세요");
						break;
				}
			
				
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
			
		}
	}

}
