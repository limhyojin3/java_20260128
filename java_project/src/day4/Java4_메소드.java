package day4;

import java.util.Random;
import java.util.Scanner;

public class Java4_메소드 {

	public static void main(String[] args) {

		// 객체 => 변수 + 메소드
		// 사람이라는 객체
		// 이름, 나이, 주소,...  정보들은 변수에 저장
		// 공부한다, 밥먹는다, 걷는다.. 행동들은 메소드로 저장
		
		System.out.println(); //메소드
		Random ran = new Random();
		int a = ran.nextInt(10) + 2;  //0~9 + 2 => 2~11
		System.out.println(a);
		
		Scanner s = new Scanner(System.in);
		System.out.print("아무 숫자나 입력해주세요. : ");
		int b = s.nextInt();
		System.out.println(b + "를 입력하셨군요.");
		
	}

}
