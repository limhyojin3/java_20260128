package day13;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day12.Message;

public class Java2_성적관리_기본예시 { //리팩토링 복습(+)

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		while(true) {
			
			try {
				
				System.out.print("[1.학생추가, 2.성적입력, 3.성적확인, 4.성적수정, 5.종료] : ");
				int menu = s.nextInt();
				
				String stuNo;
				String sql;
				ResultSet rs;
				
				switch (menu) {
					case 1:

						while(true) {
							
							System.out.print("학번 : ");
							stuNo = s.next();
							
							if(stuNo.length() == 4) {
								
								sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
								
								rs = stmt.executeQuery(sql);
								
								if(rs.next()) {
									System.out.println("이미 사용중인 학번입니다.");
									
								} else {
									
									System.out.print("이름 : ");
									String stuName = s.next();
									
									System.out.print("학과 : ");
									String stuDept = s.next();
									
									sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT)"
												+ " VALUES('" + stuNo + "', '" + stuName + "', '" + stuDept + "')";
									
									System.out.println(sql);
									
									int result = stmt.executeUpdate(sql);
									
									if(result > 0) {
										System.out.println("추가 됨!");
										
									} else {
										System.out.println(Message.failMsg);
									}
									break;
									
								}
							
								
							} else {
								System.out.println("4자리로 입력하세요");
							}
							
							
						}
						
						break;
						
					case 2 :
						
						System.out.print("학번 : ");
						stuNo = s.next();
						
						sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
						
						rs = stmt.executeQuery(sql);
						
						if(rs.next()) {
							
							int java;
							int oracle;
							int html;
							
							while(true) {
							
								System.out.print("자바 : ");
								java = s.nextInt();
								
								if(java >= 0 && java <= 100) {
									break;
								} else {
									System.out.println("0~100 사이 입력하세요.");
								}
							}
							
							while(true) {
								
								System.out.print("오라클 : ");
								oracle = s.nextInt();
								
								if(oracle >= 0 && oracle <= 100) {
									break;
								} else {
									System.out.println("0~100 사이 입력하세요.");
								}
							}
							
							while(true) {
								
								System.out.print("HTML : ");
								html = s.nextInt();
								
								if(html >= 0 && html <= 100) {
									break;
								} else {
									System.out.println("0~100 사이 입력하세요.");
								}
							}
							
							sql = "UPDATE TBL_STUDENT SET JAVA = " + java 
								+ ", ORACLE = " + oracle + ", HTML = " + html 
								+ " WHERE STU_NO = '" + stuNo + "'";
							
							System.out.println(sql);
							
							int result = stmt.executeUpdate(sql);
							
							if(result > 0) {
								System.out.println("업데이트 했습니다!");
							} else {
								System.out.println(Message.failMsg);
							}
							
							
						} else {
							System.out.println("해당 학번 학생 없음");
							
						}
							
						break;

					case 3:
						
						System.out.print("학번 : ");
						stuNo = s.next();
						
						sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
						
						rs = stmt.executeQuery(sql);
						
						if(rs.next()) {
							
							System.out.print("[" + rs.getString("STU_NO") + "]");
							System.out.print("자바 : " + rs.getInt("JAVA") + ", ");
							System.out.print("오라클 : " + rs.getInt("ORACLE") + ", ");
							System.out.println("HTML : " + rs.getInt("HTML"));
							
						} else {
							System.out.println("해당 학번 학생 없음");
						}
						
						
						
						
						break;

					case 4:
						
						System.out.print("학번 : ");
						stuNo = s.next();
						
						sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
						
						rs = stmt.executeQuery(sql);
						
						if(rs.next()) {
							System.out.print("[1. 자바, 2. 오라클, 3. HTML] : ");
							
							int subject = s.nextInt();
							
							if(1 <= subject && subject <= 3) {
								String selectSubject = subject == 1 ? "JAVA" : subject == 2 ? "ORACLE" : "HTML";
								
								int score = 0;
							
								while(true) {
									
									System.out.print(selectSubject + " 점수 입력 : ");
									score = s.nextInt();
									
									if(score >= 0 && score <= 100) {
										break;
									} else {
										System.out.println("0~100 사이 입력하세요.");
									}
								}
								
								sql = "UPDATE TBL_STUDENT SET " + selectSubject 
										+ " = " + score + " WHERE STU_NO = '" + stuNo + "'";
								
								int result = stmt.executeUpdate(sql);
								
								if(result > 0) {
									System.out.println("수정되었습니다.");
								} else {
									System.out.println(Message.failMsg);
								}
								
								
							} else {
								System.out.println("1~3중에 선택해라");
							}
						}else {
							System.out.println("해당 학번 학생 없음");
						}
						
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
