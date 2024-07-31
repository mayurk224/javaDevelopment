package Financial_Software;

public class ShareAsset {

    // This is a redundant code
    // ShareAsset: is a class, everything that based on shares like stocks
    //             mutual funds will extend this class

    private String symbol;
    private double totalCost, currentPrice;

    public ShareAsset(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }

    // adds a cost of the given amount to this asset
    public void addCost(double cost){
        totalCost += cost;
    }

    // returns the price per share of this asset
    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

}
