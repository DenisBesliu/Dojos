package dojo.romannumerals;

/**
 * @author: ajelimalai
 * @created: 16/01/13
 */
public class RomanNumeral {

    public static enum RomanBoundaries {
        I(1, 0, "I"),
        V(5, 1, "IV"),
        X(10, 1, "IX"),
        L(50, 10, "XL"),
        C(100, 10, "XC"),
        D(500, 100, "CD"),
        M(1000, 100, "CM");

        private int value;
        private int specialValue;
        private String specialRepresentation;


        RomanBoundaries(final int aValue, final int aSpecialValue, final String aSpecialRepresentation) {
            value = aValue;
            specialValue = aSpecialValue;
            specialRepresentation = aSpecialRepresentation;
        }


        public int getValue() {
            return value;
        }


        public int getSpecialValue() {
            return specialValue;
        }


        public String getSpecialRepresentation() {
            return specialRepresentation;
        }
    }


    public String translate(int aNumber) {
        String result = "";
        while (aNumber > 0) {
            for (int i = RomanBoundaries.values().length - 1; i >= 0; i--) {
                RomanBoundaries boundary = RomanBoundaries.values()[i];
                if (aNumber == (boundary.getValue() - boundary.getSpecialValue())) {
                    result += boundary.getSpecialRepresentation();
                    aNumber -= (boundary.getValue() - boundary.getSpecialValue());
                    break;
                }else if (boundary.value <= aNumber) {
                    result += boundary.toString();
                    aNumber -= boundary.getValue();
                    break;
                }
            }
        }

        return result;
    }
}
