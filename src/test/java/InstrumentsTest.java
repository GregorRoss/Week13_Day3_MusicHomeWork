import org.junit.Before;
import org.junit.Test;
import shop.instruments.Guitar;
import shop.instruments.Type;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(100.00,200.00,"fender", Type.STRING, "blue","oakwood",6);
    }

    @Test
    public void doesTheGuitarWork(){
        assertEquals("***Guitar noise LOUD!***", guitar.playSound(guitar));
    }
}
