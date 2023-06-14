package shop.instruments;

import shop.behaviour.IPlay;

public class Drums extends Instrument implements IPlay {
    private String size;

    public Drums(double buyPrice,
                 double sellPrice,
                 String manufacturer,
                 Type type,
                 String colour,
                 String material,
                 String size
    ) {
        super(buyPrice, sellPrice, manufacturer, type, colour, material);
        this.size = size;
    }

    @Override
    public String playSound(Instrument instrument) {
        return  "***DDDDDDDRRRRRUUUMMMMMMSSSSS***";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
