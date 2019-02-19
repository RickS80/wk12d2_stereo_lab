import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before

    public void before(){
        recordDeck = new RecordDeck("JVC", "ABC20", 33);
    }

    @Test
    public void hasSpeed(){
        assertEquals(33, recordDeck.getSpeed());
    }

    @Test
    public void hasMake(){
        assertEquals("JVC", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("ABC20", recordDeck.getModel());
    }

    @Test
    public void canSetSpeed(){
        recordDeck.setSpeed(45);
        assertEquals(45, recordDeck.getSpeed());
    }

    @Test
    public void canPlayRecord(){
        String value = recordDeck.playRecord("FireStarter!");
        assertEquals(value, "Playing FireStarter!");
    }

}
