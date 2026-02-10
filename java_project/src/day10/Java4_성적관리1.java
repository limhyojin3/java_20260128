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
				
			} // try가 for문 밖에 있다 => 에러가 터지자마자 for문이 파괴되고 catch문으로 넘어감.
			
		} catch (InputMismatchException e) {
			
			System.out.println("숫자를 입력하세요.");
			s.next();//  버퍼 비워주기
			
			///** try-catch 특징! :
			/// 예외가 발생한 시점에서, 해당 try 블록의 나머지 코드를 모두 건너뛰고, 바로 catch로 넘어간다.
		}  
		
		///2. 해결 방법: try-catch를 for문 안으로!
		/// 예외가 발생해도 다음 학생을 계속 입력받고 싶다면, 
		/// try-catch 블록을 for문 안쪽에 넣어야 합니다.
		/// 이렇게 하면 예외가 발생해도 해당 회차(Iteration)만 중단되고,
		/// 다음 회차로 루프가 계속 돌아갑니다.
		
		
		System.out.println(list);
	}

}
