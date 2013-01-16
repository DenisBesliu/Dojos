package dojo.romannumerals;

/**
 * @author: ajelimalai
 * @created: 16/01/13
 */
public class RomanNumeral {

    public String translate(final int aNumber) {
        if (aNumber == 1) {
            return "I";
        } else {
            return "II";
        }

    }
}
