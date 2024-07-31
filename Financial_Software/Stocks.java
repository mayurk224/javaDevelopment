package Financial_Software;

public class Stocks extends ShareAsset implements Assets{

    private int totalShares;

    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }

    public int getTotalShares() {
        return totalShares;
    }

    // Records a purchase of the given number of shares of the stocks
    // at the given price per shares
    public void purchase(int shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
