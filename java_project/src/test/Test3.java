package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

//		3. (20점) 6개의 공간을 가지는 String형 배열을 생성하고(+) 스캐너를 통해(+) 아래 조건에 맞게 
//				문자를 입력받아서 배열의 모든 공간에 넣으시오.(+)
//		 - 조건1. 문자열의 크기는 최소 1, 최대 10 (+)
//		 - 조건2. 모두 대문자로 저장할 것 (소문자로 입력해도 대문자로 저장) (+)
//		 - 조건3. 조건 1~2를 만족하지 않을 경우 다시 입력받아서 6개 공간을 모두 채울 것.(+)
//		(파일명 : Test3.java)
		
		Scanner s = new Scanner(System.in);
		
		String[] strArr = new String[6];
		
		for(int i = 0; i < strArr.length; i++) {
			
			System.out.print("문자열을 입력하세요 : ");
			strArr[i] = s.next().toUpperCase();  
			
			if(!(1 <= strArr[i].length() && strArr[i].length() <= 10)) {
				System.out.println("문자열의 크기는 1~10사이입니다.");
				i--;
				continue;
			}
			
			
		}
		
		System.out.println(Arrays.toString(strArr));
		
		
	}

}
