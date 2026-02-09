package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Java9_복습 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Object> list = new ArrayList<>();  
		
		for(int i = 0; i < 5; i++) {
			System.out.print("뭐든 입력 : ");
			String obj = s.next();
			list.add(obj);               // ** ArrayList 는 add, HashMap 은 put("key", value); 
		}								 // ArrayList 는 인덱스로 접근한다.**
										 // HashMap 은 키:밸류 중에 키로 접근한다.**
		
		System.out.println(list);
		
		String txt = (String)list.get(0); //30
		System.out.println(txt + 1); //301
		System.out.println(Integer.parseInt(txt) + 1);  //31
					//** Integer.parseInt(String타입) -> 문자열을 숫자로 바꿔줌
		
		////////////복습( )
	}

}
