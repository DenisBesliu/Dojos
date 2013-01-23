package dojo.digital;

import dojo.digital.digits.EightDigitizer;
import dojo.digital.digits.FiveDigitizer;
import dojo.digital.digits.FourDigitizer;
import dojo.digital.digits.NineDigitizer;
import dojo.digital.digits.OneDigitizer;
import dojo.digital.digits.SevenDigitizer;
import dojo.digital.digits.SixDigitizer;
import dojo.digital.digits.ThreeDigitizer;
import dojo.digital.digits.TwoDigitizer;
import dojo.digital.digits.ZeroDigitizer;

/**
 * @author dbesliu
 * @created 12/20/12
 */
public class NumberDigitizerFactory {

    private final NumberDigitizer[] digits = new NumberDigitizer[] { new ZeroDigitizer(), new OneDigitizer(), new TwoDigitizer(),
                                                              new ThreeDigitizer(), new FourDigitizer(), new FiveDigitizer(),
                                                              new SixDigitizer(), new SevenDigitizer(), new EightDigitizer(),
                                                              new NineDigitizer() };


    public NumberDigitizer digitizerBy(final Integer aNumber) {
        if (aNumber == null) {
            throw new NonDigitizableNumberException("The number to conversion is null");
        }
        if (aNumber < 0) {
            throw new NonDigitizableNumberException("The number to convert is negative");
        }
        if (aNumber > 9) {
            throw new NonDigitizableNumberException("The number to convert is greater than 9");
        }
        return digits[aNumber];
    }
}
