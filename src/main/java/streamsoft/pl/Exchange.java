package streamsoft.pl;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exchange {
	
	public void exchangeFromPln(BigDecimal pln, String currency) throws IOException {
		Json json = new Json();
		BigDecimal exCurr = json.getMidFromJson(currency);
		BigDecimal value = pln;
		value = value.divide(exCurr,2, RoundingMode.HALF_UP);
		System.out.println(value);
	}

	public BigDecimal getPln() {
		Scanner input = new Scanner(System.in);
		System.out.println("Proszê podaæ kwotê w pln");
		
		BigDecimal pln = input.nextBigDecimal();
		return pln;
	}
	public String getCurrcode() {
		Scanner input = new Scanner(System.in);
		System.out.println("Wymiana na jaka walute Ciebie interesuje, prosze podac kod waluty");
		
		String currCode = input.nextLine();
		return currCode;
	}
}
