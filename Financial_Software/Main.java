package Financial_Software;

public class Main {
    public static void main(String[] args) {
        // Case Study: Financial Software

        // Let's consider the problem of gathering info about a person financial investments.
        // We have Stocks, Dividend Stocks, Mutual Funds, Real Estate, Case ...

        // How to assign a complete portfolio system?
        // What now types of objects would you write?

        // STEP 1: Classes - Stocks, Dividend Stocks, Mutual Funds, Cash (Real Estate is not necessary we considered as cash)
        // STEP 2: Relation - Dividend Stock is a Stock

        // STEP 3: Because different assets compute their market value in different way
        // so for that, we will use the interface: to getMarket Value and getPortfolio.

        // [ CASE STUDY 1: in this topic we created required classes for our
        // software (Cash, Stocks, Dividend Stock & MutualFund). Then we
        // consider Dividend Stock is a Stock, so we consider Stock as parent class
        // for Dividend Stock. Then we created an Assets interface to hold the
        // common method, because every class has different behavior in terms of
        // values about market & profit. Then we implement Assets interface to
        // Cash, Stock & override Assets methods. Then we create a private variable in
        // Cash class to hold amount, added getter_setter & parametric constructor.
        // Then we return amount in getMarketValue() override method. And for
        // getProfit() override method we return it as 0, because we consider
        // cash as a fixed asset, so there will be no profit.]

        //                       ------*******-------

        // Case Study: Financial Software II

        // STEP 4: what is similarities between mutual funds and stocks?
        // both store assets that are based on shares

        //                      ------*******-------

        // Case Study: Financial Software III

        Assets assets = new MutualFund("AMZ", 300);
        System.out.println(assets.getMarketValue());
    }
}
