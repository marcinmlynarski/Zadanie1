package streamsoft.pl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
    	Exchange ex = new Exchange();

//    	System.out.println("Jaka waluta Ciebie interesuje, prosze podac kod waluty");
//    	
//    	String currency = input.nextLine();
//
//    	json.parseJson(currency);
//    	Thread.sleep(100000);
    	
    	BigDecimal pln = ex.getPln();
    	
    	String currency = ex.getCurrcode();

    	ex.exchangeFromPln(pln, currency);
    	Thread.sleep(100000);
    }

}