package streamsoft.pl;

public class UrlToJson {
	private String urlToNbp = "http://api.nbp.pl/api/exchangerates/rates/a/chf/";
	
	public UrlToJson() {
	}
	
	public UrlToJson(String currency) {
		urlToNbp = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/";
	}

	public String geturlToNbp() {
		return urlToNbp.toString();
	}
}
