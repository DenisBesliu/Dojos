package dojo.digital;

/**
 * @author dbesliu
 * @created 1/14/13
 */
public class DigitalNumberDecompozer {

    private NumberDecomposer decomposer;
    private NumberDigitizerFactory digitizerFactory;


    public DigitalNumberDecompozer() {
        decomposer = new NumberDecomposer();
        digitizerFactory = new NumberDigitizerFactory();
    }


    public String[][] decompose(final int aNumber) {
        final Integer[] decomposedNumber = decomposer.decomposeNumber(aNumber);
        String[][] result = new String[3][3 * decomposedNumber.length];
        for (int k = 0; k < decomposedNumber.length; k++) {
            result = digitizeNumber(decomposedNumber[k], result, k);
        }
        return result;
    }


    private String[][] digitizeNumber(final Integer aNumber, final String[][] aResult, final int aDigitIndex) {
        final String[][] strings = digitizerFactory.digitizerBy(aNumber).toDigit();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                aResult[i][aDigitIndex * 3 + j] = strings[i][j];
            }
        }

        return aResult;
    }
}
