package dojo.digital.digits;

import dojo.digital.NumberDigitizer;

/**
 * @author dbesliu
 * @created 1/10/13
 */
public class EightDigitizer
        implements NumberDigitizer {


    @Override
    public String[][] toDigit() {
        return new String[][] {{".","_","."},
                               {"|","_","|"},
                               {"|","_","|"}};
    }
}
