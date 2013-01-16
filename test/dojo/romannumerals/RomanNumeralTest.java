package dojo.romannumerals;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author: ajelimalai
 * @created: 16/01/13
 */
public class RomanNumeralTest {

    private RomanNumeral romanNumeral;


    public RomanNumeralTest() {
        romanNumeral = new RomanNumeral();
    }


    @Test
    public void one() {
        Assert.assertEquals("I", romanNumeral.translate(1));
    }


    @Test
    public void two() {
        Assert.assertEquals("II", romanNumeral.translate(2));
    }



    @Test
    public void eleven() {
        Assert.assertEquals("XI", romanNumeral.translate(11));
    }


}
