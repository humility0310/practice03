package prob3;

public class CurrencyConverter {
	public static double rate;
	
	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		return won*rate/1000;
	}

	public static double toKRW(double dollar) {
		return dollar/rate*1000000;
	}

	public static void setRate(double r) {
		// 환율 설정(KRW/$1)
		rate = r*0.89;

	}
}
