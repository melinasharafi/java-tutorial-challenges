
package junit;

import org.junit.Before;

import static org.junit.Assert.*;

public class UtilitiesTest {
    Utilities util;

    @Before
    public void before() {
        util = new Utilities();
        System.out.println("Running a test ...");
    }

    @org.junit.Test
    public void everyNthChar() {
        assertArrayEquals(new char[]{'e', 'l'}, util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2));
        assertArrayEquals(new char[]{'m', 'i'}, util.everyNthChar(new char[]{'m', 'i'}, 4));
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("A", util.removePairs("A"));
        assertEquals(null, util.removePairs(null));
    }

    @org.junit.Test
    public void converter() throws Exception {
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_ArithmeticException() throws Exception {
        assertEquals(new ArithmeticException(), util.converter(10, 0));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertEquals("melina", util.nullIfOddLength("melina"));
        assertNull("The String is null", util.nullIfOddLength("melin"));
    }
}
