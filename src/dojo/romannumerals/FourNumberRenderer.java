package dojo.romannumerals;

/**
 * @author dbesliu
 * @created 1/11/13
 */
public class FourNumberRenderer
        extends RomanNumberRenderer {

    @Override
    public String convert(final int aNumber) {
        String result = "";

        for (int i = 0; i < aNumber; i++) {
            result += "M";
        }
        return result;
    }
}
