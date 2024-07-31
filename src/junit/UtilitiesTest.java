package junit;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        fail("Test code doesn't implemented yet...");
    }

    @org.junit.Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() {
        fail("Test code doesn't implemented yet...");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("Test code doesn't implemented yet...");
    }
}