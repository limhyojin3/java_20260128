package day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java4_성적관리1_try위치변경 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		
		// 3명의 학생을 list에 추가
		// 학번, 이름, 나이를 입력받아서 Student 객체로 만들고 list에 추가
		
			
		for(int i = 0; i < 3; i++) {
				
			System.out.println("==학생을 등록합니다.==");
			
			System.out.print("학번 : ");
			String stuNo = s.next();
			
			System.out.print("이름 : ");
			String name = s.next();
			
			int age = 0; //초기화
			
			while(true) {
				
				try {
					
					System.out.print("나이 : ");
					age = s.nextInt();
					break;
					
				} catch (InputMismatchException e) {
					
					System.out.println("숫자를 입력하세요.");
					s.next();//  버퍼 비워주기
					//i--;   //i++로 가기전에 i--해주기
					//continue; //있으나 없으나 상관없음. 
					//			->catch 문은 반복문 안에 있으면 아무튼 i++(증감식)으로 간다.
				} 
				
			}
			
			Student student = new Student(stuNo, name, age);
			
			list.add(student);
			
			
		} 
			
		System.out.println(list);

	}

}
