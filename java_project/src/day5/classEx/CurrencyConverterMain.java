package day5.classEx;

import java.util.Scanner;

public class CurrencyConverterMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble(); //환율 : 1달러당 얼마(원화) 1472원
		
		CurrencyConverter.setRate(rate); // 미국달러 환율설정
		
		System.out.println("백만원은$" + CurrencyConverter.toDollar(1000000) +"입니다.");
		System.out.println("$100는" + CurrencyConverter.toKWR(100)+ "원입니다.");
		scanner.close();
		}

}
