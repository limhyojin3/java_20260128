package day8;

public class Java2_Wrapper클래스 {

	public static void main(String[] args) {

		Integer i = Integer.valueOf(10);
		int a = Integer.parseInt("10");
				//**parseInt(): 문자열을 숫자로 바꾸어줌
		
		String b = new String("zz");
		String c = "zz";
		
		Integer j = 10;
		int x = j;
		
		String num = "1234";
		System.out.println(Integer.parseInt(num) + 10);
	}

}
