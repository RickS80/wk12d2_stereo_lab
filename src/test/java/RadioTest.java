import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before

    public void before() {
        radio = new Radio("Hitachi", "X12", "Forth2");
    }

    @Test
    public void canTune(){
        radio.setStation("MagicFM");
        assertEquals("MagicFM", radio.getStation());
    }

    @Test
    public void canGetMake(){
        assertEquals("Hitachi", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("X12", radio.getModel());
    }


    @Test
    public void canPlayTune(){
        assertEquals("Playing Forth2", radio.playTune());
    }
}
