package shop.instruments;

import shop.behaviour.IPlay;

public class Clarinet extends Instrument implements IPlay {
    private int noValves;

    public Clarinet(double buyPrice,
                    double sellPrice,
                    String manufacturer,
                    Type type,
                    String colour,
                    String material,
                    int noValves
                    ) {
        super(buyPrice, sellPrice, manufacturer, type, colour, material);
        this.noValves= noValves;
    }

    @Override
    public String playSound(Instrument instrument) {
        return  "***Clarinet noise sweetly!***";
    }

    public int getNoValves() {
        return noValves;
    }

    public void setNoValves(int noValves) {
        this.noValves = noValves;
    }
}
