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

        private final int value;
        private final int specialValue;
        private final String specialRepresentation;


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
                final RomanBoundaries boundary = RomanBoundaries.values()[i];
                final int value = boundary.getValue();
                final int specialValue = boundary.getSpecialValue();
                final int specialDifference = value - specialValue;
                if (isSpecialCase(aNumber, value, specialDifference)) {
                    result += boundary.getSpecialRepresentation();
                    aNumber -= specialDifference;
                    break;
                }else if (boundary.value <= aNumber) {
                    result += boundary.toString();
                    aNumber -= value;
                    break;
                }
            }
        }

        return result;
    }


    private boolean isSpecialCase(final int aNumber, final int aValue, final int aSpecialDifference) {
        return aSpecialDifference == aNumber || ( aSpecialDifference < aNumber && aNumber < aValue);
    }
}
