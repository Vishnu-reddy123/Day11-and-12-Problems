package StockAccountManagement;

public class StockDetails {
    private String stockName;
    private double numOfShare;
    private double sharePrice;

    public StockDetails(String stockName, double numOfShare, double sharePrice) {
        this.stockName = stockName;
        this.numOfShare = numOfShare;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public double getNumOfShare() {
        return numOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public String toString() {
        return "Stock{" +
                "nameOfStock='" + stockName + '\'' +
                ", numberOfShare=" + numOfShare +
                ", sharePrice=" + sharePrice +
                '}';
    }
}