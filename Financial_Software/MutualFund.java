package Financial_Software;

public class MutualFund extends ShareAsset implements Assets{

    private double totalShares;

    public MutualFund(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }

    public double getTotalShares() {
        return totalShares;
    }

    // records purchase of the given shares at the given price
    public void purchase(double shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
