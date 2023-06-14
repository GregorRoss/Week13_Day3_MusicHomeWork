package shop.instruments;

import shop.StockItems;

public abstract class Instrument extends StockItems {

    private String manufacturer;
    private Type type;
    private String colour;
    private String material;

    public Instrument(double buyPrice, double sellPrice, String manufacturer, Type type, String colour, String material) {
        super(buyPrice, sellPrice);
        this.manufacturer = manufacturer;
        this.type = type;
        this.colour = colour;
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
