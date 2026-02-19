package day14;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java8_컬렉션 {   //복습(+)

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		HashMap<String, Object> map = new HashMap<>();
		
		// 나이를 잘못 입력(ex 문자 입력)할 경우
		// 안내문구 후 나이만 다시 입력하도록
		
		System.out.print("이름: ");
		String name = s.next();
		System.out.print("주소: ");
		String addr = s.next();
		
		map.put("name", name);
		map.put("addr", addr);
		
		int age = 0;
		
		while(true) {
			
			try {
				System.out.print("나이: ");
				age = s.nextInt();   // <- 이 줄에서 터짐

				map.put("age", age);  
				
				break;
				
			} catch (InputMismatchException e) { ///** catch 문 실행되면 catch 문 밖의 코드 실행후 다음 반복으로 넘어감(증감식으로)
				s.next(); //잘못 들어온 문자 소진시키기
				System.out.println("나이에는 숫자를 입력하세요");
//				continue; //바로 다음 증감식으로 넘어감
			}
			
//			break; ///catch 문 실행돼도 이 코드 실행됨. 원치않으면 catch 문에서 continue;
		}
		
		
		System.out.println(map);
		
		
		
		
//		map.put("name", "홍길동");  //map.put(key, value); //{key=value}
//		map.put("addr", "인천");
//		map.put("age", 30);
//		
//		System.out.println(map); //{name=홍길동, addr=인천, age=30}
//		
//		map.put("age", (Integer)map.get("age") + 1);
//		System.out.println(map); //{name=홍길동, addr=인천, age=31}
	}

}
