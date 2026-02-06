package day8;

import java.util.Scanner;

public class Java4_subString {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		
		String text = "Hello Java";
		
		String java = text.substring(6); //인덱스 6부터 끝까지**
		System.out.println(java);
		
		String hello = text.substring(0, 5); //인덱스 0부터 5번 전까지.(=0부터 4까지)**
		System.out.println(hello);
		
		String temp = "java";
		temp = temp.concat("재밌다.");
		System.out.println(temp);
		
		System.out.print("문자 입력 : ");
		String str = s.next();
//		String java1 = "java"; //"avaj"->"vaja"->"ajav"->"java"
		
		
		for(int i = 0; i < str.length(); i++) {
			char first = str.charAt(0); //"j"
			//str.substring(0, 1); //0번 인덱스
			
			str = str.substring(1); //1번인덱스부터 끝까지 "ava"
			str = str + first; //"avaj"
			System.out.println(str);
			
		}
	}

}
