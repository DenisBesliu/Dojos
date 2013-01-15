package dojo.romannumerals;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author dbesliu
 * @created 1/10/13
 */
@RunWith(Parameterized.class)
public class RomanNumeralsConverterTest {

    private static RomanNumeralsConverter romanNumeralsConverter;


    @BeforeClass
    public static void setUp() {
        romanNumeralsConverter = new RomanNumeralsConverter();
    }


    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] { { null, "" },
                                              { 0, "" },
                                              { 1, "I" },
                                              { 2, "II" },
                                              { 3, "III" },
                                              { 4, "IV" },
                                              { 5, "V" },
                                              { 6, "VI" },
                                              { 7, "VII" },
                                              { 8, "VIII" },
                                              { 9, "IX" },
                                              {10, "X"},
                                              {11, "XI"},
                                              {70, "LXX"},
                                              {1990, "MCMXC"},
                                              {1990, "MCMXC"}});
    }

    private final Integer inputValue;
    private final String expectedValue;


    public RomanNumeralsConverterTest(final Integer aInputValue, final String aExpectedValue) {
        inputValue = aInputValue;
        expectedValue = aExpectedValue;
    }


    @Test
    public void convertToRomanNumerals() {
        Assert.assertEquals(expectedValue, romanNumeralsConverter.convertToRomanNumerals(inputValue));
    }
}
