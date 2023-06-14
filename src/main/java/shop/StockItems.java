package shop;

import shop.behaviour.ISell;

public abstract class StockItems implements ISell {

    private double buyPrice;

    private double sellPrice;

    public StockItems(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
