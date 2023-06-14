package shop.instruments;

import shop.behaviour.IPlay;

public class Saxaphone extends Instrument implements IPlay {
    private int noReeds;

    public Saxaphone(double buyPrice,
                     double sellPrice,
                     String manufacturer,
                     Type type,
                     String colour,
                     String material,
                     int noReeds
                     ) {
        super(buyPrice, sellPrice, manufacturer, type, colour, material);
        this.noReeds = noReeds;
    }

    @Override
    public String playSound(Instrument instrument) {
        return  "***Saxaphone plays careless whispers***";
    }

    public int getNoReeds() {
        return noReeds;
    }

    public void setNoReeds(int noReeds) {
        this.noReeds = noReeds;
    }
}
