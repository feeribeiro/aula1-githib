package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class MembrosEstaticos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.converter(dollarPrice, amount);
		System.out.println("Amount to be paid in reais = " + result);
		
		sc.close();
	}

}
