package streamsoft.pl;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {

	public void parseJson (String currency) throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		UrlToJson urlToJson = new UrlToJson(currency);
		Variables variables = objectMapper.readValue(new URL(urlToJson.geturlToNbp()), Variables.class);
		System.out.println(variables.getCurrency() + ", " + variables.getCode() + " = " + variables.getRates().get(0).getMid());
	}
	
	public BigDecimal getMidFromJson (String currency) throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		UrlToJson urlToJson = new UrlToJson(currency);
		Variables variables = objectMapper.readValue(new URL(urlToJson.geturlToNbp()), Variables.class);
		
		return variables.getRates().get(0).getMid();
	}
}