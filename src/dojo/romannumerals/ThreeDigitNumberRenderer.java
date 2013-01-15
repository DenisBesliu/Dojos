package dojo.romannumerals;

/**
 * @author dbesliu
 * @created 1/11/13
 */
public class ThreeDigitNumberRenderer extends RomanNumberRenderer {

    public ThreeDigitNumberRenderer() {
        numbers = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    }

}
