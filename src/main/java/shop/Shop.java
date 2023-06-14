package shop;

import shop.behaviour.ISell;
import shop.instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private String name;
    private  double till;
    private ArrayList<ISell> stockItems;

    public Shop(String name, double till ) {
        this.name = name;
        this.till = till;
        this.stockItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<ISell> getStockItems() {
        return stockItems;
    }

    public void setStockItems(ArrayList<ISell> stockItems) {
        this.stockItems = stockItems;
    }

    public void addStockItem(ISell stockItem){
        this.stockItems.add(stockItem);
    }

    public void removeStockItem(ISell stockItem) {
        this.stockItems.remove(stockItem);
    }
}
