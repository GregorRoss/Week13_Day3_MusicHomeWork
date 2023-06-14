package shop.instruments;

import shop.behaviour.IPlay;
import shop.behaviour.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int noStrings;


    public Guitar(double buyPrice,
                  double sellPrice,
                  String manufacturer,
                  Type type, String colour,
                  String material,
                  int noStrings
                  ) {
        super(buyPrice, sellPrice, manufacturer, type, colour, material);
        this.noStrings = noStrings;
    }

    @Override
    public String playSound(Instrument instrument) {
        return  "***Guitar noise LOUD!***";
    }

    public int getNoStrings() {
        return noStrings;
    }

    public void setNoStrings(int noStrings) {
        this.noStrings = noStrings;
    }

}
