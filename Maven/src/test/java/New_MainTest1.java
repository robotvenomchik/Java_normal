import org.junit.Test;

import static org.junit.Assert.*;

public class New_MainTest1 {

    @Test
    public void firstLetterBig() {
        assertEquals(true, New_Main.firstLetter("Ff"));
    }
    @Test
    public void firstLetterSmall() {
        assertEquals(false, New_Main.firstLetter("ff"));
    }
}