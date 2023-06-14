import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.StockItems;
import shop.accesories.DrumSticks;
import shop.accesories.SheetMusic;
import shop.instruments.Guitar;
import shop.instruments.Type;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    DrumSticks drumSticks;
    SheetMusic sheetMusic;
    Shop shop;

    @Before
    public void before(){
        guitar = new Guitar(100.00,200.00,"fender", Type.STRING, "blue","oakwood", 6);
        drumSticks = new DrumSticks(0.50, 20.00);
        sheetMusic = new SheetMusic(1.00, 5.00);
        shop = new Shop("Ray's Music", 1100.00);
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(100.00, guitar.getBuyPrice(),0.0);
    }
    @Test
    public void canGetSellPrice(){
        assertEquals(200.00, guitar.getSellPrice(),0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100.00, guitar.calculateMarkup() ,0.0);
    }

    @Test
    public void canAddItemToStock(){
        shop.addStockItem(guitar);
        assertEquals(1, shop.getStockItems().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addStockItem(guitar);
        shop.addStockItem(sheetMusic);
        shop.removeStockItem(guitar);
        assertEquals(1, shop.getStockItems().size());

    }
}
