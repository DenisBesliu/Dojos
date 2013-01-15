package dojo.romannumerals;

import java.util.ArrayList;

/**
 * @author dbesliu
 * @created 1/10/13
 */
public class RomanNumeralsConverter {

    public static final int DIVIDER = 10;
    private final RomanNumberRenderer renders[] = { new OneDigitNumberRenderer(), new TwoDigitNumberRenderer(),
                                                   new ThreeDigitNumberRenderer(), new FourNumberRenderer() };


    public String convertToRomanNumerals(final Integer aNumber) {
        String result = "";
        Integer number = aNumber;

        if (number != null && number > 0 && number < 9999) {
            final ArrayList<String> digits = getDigitsInRoman(number);

            for (int j = digits.size() - 1; j >= 0; j--) {
                result += digits.get(j);
            }
        }
        return result;
    }


    private ArrayList<String> getDigitsInRoman(Integer aNumber) {
        ArrayList<String> digitsToRomans = new ArrayList<String>();
        int i = 0;
        while (aNumber > 0) {
            int rest = aNumber % DIVIDER;
            aNumber /= DIVIDER;
            digitsToRomans.add(renders[i].convert(rest));
            i++;
        }

        return digitsToRomans;
    }
}
