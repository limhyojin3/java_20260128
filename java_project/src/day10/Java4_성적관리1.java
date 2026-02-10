package day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java4_성적관리1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		
		// 3명의 학생을 list에 추가
		// 학번, 이름, 나이를 입력받아서 Student 객체로 만들고 list에 추가
		
		try {
			
			for(int i = 0; i < 3; i++) {
				
				System.out.println("==학생을 등록합니다.==");
				
				System.out.print("학번 : ");
				String stuNo = s.next();
				
				System.out.print("이름 : ");
				String name = s.next();
				
				System.out.print("나이 : ");
				int age = s.nextInt();
				
				Student student = new Student(stuNo, name, age);
				
				list.add(student);
				
			}
			
		} catch (InputMismatchException e) {
			
			System.out.println("숫자를 입력하세요.");
			s.next();//  버퍼 비워주기
		}  //////////////////복습()
		
		
		
		
		
		System.out.println(list);
	}

}
