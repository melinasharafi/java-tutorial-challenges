
package junit;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        Utilities util = new Utilities();
        assertArrayEquals(new char[]{'e', 'l'}, util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2));
    }

    @org.junit.Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("A", util.removePairs("A"));
        assertEquals(null, util.removePairs(null));
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
