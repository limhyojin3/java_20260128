package day4;

public class Java2_복습_배열 {

	public static void main(String[] args) {

		int[] arr = new int[5];  //int 형 데이터만 가능
		// int arr[] = new int[5];
		
		arr[0] = 10;
		String[] textArr = {"java", "oracle", "javascript", "html"};
		Object[] test = {"z", 1, 1.5, true}; // 모든 데이터타입 가능.
		
		for(int i = 0; i < textArr.length; i++) { //i=0,1,2 //.length  <=변수
			System.out.println(textArr[i]);
		}
		
		// String 클래스는 메서드를 갖고있다.
		for(String txt : textArr) { 
			System.out.println(txt + " : 문자열의 크기(문자개수)는 " + txt.length() + "입니다.");
		} //.length() <= 메소드
	}

}
