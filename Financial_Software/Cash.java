package Financial_Software;

public class Cash implements Assets{
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Cash(double amount) {
        this.amount = amount;
    }

    @Override
    public double getMarketValue() {
        return amount;
    }

    // Cash is fixed so, there is no profit
    @Override
    public double getProfit() {
        return 0;
    }
}
