package dojo.romannumerals;

/**
 * @author dbesliu
 * @created 1/11/13
 */
public class TwoDigitNumberRenderer extends RomanNumberRenderer {

    public TwoDigitNumberRenderer() {
        numbers = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    }

}
