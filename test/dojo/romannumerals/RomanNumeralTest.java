package dojo.romannumerals;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * @author: ajelimalai
 * @created: 16/01/13
 */
public class RomanNumeralTest {

    private final RomanNumeral romanNumeral;


    public RomanNumeralTest() {
        romanNumeral = new RomanNumeral();
    }


    @Test
    public void one() {
        assertEquals("I", romanNumeral.translate(1));
    }


    @Test
    public void five() {
        assertEquals("V", romanNumeral.translate(5));
    }


    @Test
    public void ten() {
        assertEquals("X", romanNumeral.translate(10));
    }


    @Test
    public void fifty() {
        assertEquals("L", romanNumeral.translate(50));
    }


    @Test
    public void oneHundred() {
        assertEquals("C", romanNumeral.translate(100));
    }


    @Test
    public void fiveHundred() {
        assertEquals("D", romanNumeral.translate(500));
    }


    @Test
    public void thousand() {
        assertEquals("M", romanNumeral.translate(1000));
    }


    @Test
    public void eleven() {
        assertEquals("XI", romanNumeral.translate(11));
    }


    @Test
    public void fourteen() {
        assertEquals("XIV", romanNumeral.translate(14));
    }

    @Test
    public void _4233() {
        assertEquals("MMMMCCXXXIII", romanNumeral.translate(4233));

    }

    @Test
    public void _6946(){
        assertEquals("MMMMMMCMXLVI", romanNumeral.translate(6946));
    }


    @Test
    public void _9949(){
        assertEquals("MMMMMMMMMCMXLIX", romanNumeral.translate(9949));
    }

}
