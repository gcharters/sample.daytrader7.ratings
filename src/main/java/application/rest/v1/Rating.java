package application.rest.v1;

public class Rating {
	
	private String symbol;
	private String rating;
	
	public Rating (String symbol, String rating) {
		this.symbol = symbol;
		this.rating = rating;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public String getRating() {
		return this.rating;
	}

}
