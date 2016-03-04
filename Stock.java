
public class Stock {
	private String symbol;
	private double sharePrice;
	
	public Stock(String symbol, double sharePrice) 
	{
		this.symbol = symbol;
		this.sharePrice = sharePrice;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	public String toString() 
	{
		String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
				
				return str;
	}
	
}
