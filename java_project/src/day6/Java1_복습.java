package day6;

import java.util.Random;
import java.util.Scanner;

import day5.Student;

public class Java1_복습 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		Student hong = new Student("홍길동", 30, "1234");
		//hong.stuNo = "9876";  //default 라서 다른 패키지에서 접근 불가
					            //다른패키지에서 접근가능한건 public
								//protected : 같은패키지(o) + 다른패키지이더라도 상속관계(o)
		hong.setStuNo("9876");
		System.out.println(hong.getStuNo());
		hong.setAddr("인천");
		System.out.println(hong.getAddr());
	}

}
