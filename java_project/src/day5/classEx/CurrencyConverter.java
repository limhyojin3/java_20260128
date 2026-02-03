package day5.classEx;

public class CurrencyConverter {
	
	private static double rate; // 환율: 1달러당 얼마, 1472원   //KWR/$1
	
	public static double toDollar(double won) {  //달러로 변환
		return won/rate; //100만원 /1472원 => xx달러
	}
	
	public static double toKWR(double dollar) {  //원화로 변환
		return dollar * rate; // 100달러 * 1472원 =>  147200원
	}
	
	public static void setRate(double r) {  // 환율 설정 (1달러당 1472원)
		rate = r; // 환율설정. KWR/$1
	}
}
