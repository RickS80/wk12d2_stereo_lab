import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before

    public void before() {
        radio = new Radio("Forth2");
    }

    @Test
    public void canTune(){
        radio.setStation("MagicFM");
        assertEquals("MagicFM", radio.getStation());
    }

    @Test
    public void canGetVolume(){
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void canGetBass(){
        assertEquals(10, radio.getBass());
    }

    @Test
    public void canGetTreble(){
        assertEquals(10, radio.getTreble());
    }



}
