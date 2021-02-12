package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double converter(double dollarPrice, double amount) {
		return amount * dollarPrice + ((IOF * dollarPrice) * amount);
	}
}
