package dojo.diamond;

import java.util.LinkedList;
import java.util.List;

/**
 * @author dbesliu
 * @created 1/14/13
 */
public class DiamondPrinter {

    public static final String A = "A";
    private final String[] alphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                                       "U", "V", "W", "X", "Y", "Z" };


    public String[] printDiamond(final String aCharacter) {
        List<String> result = new LinkedList<String>();
        if (aCharacter != null) {
            result = completeResult(aCharacter, completeResultWithCharactersTill(aCharacter));
        }
        return result.toArray(new String[result.size()]);
    }


    private List<String> completeResultWithCharactersTill(final String aCharacter) {
        List<String> result = new LinkedList<String>();
        for (final String anAlphabet : alphabet) {
            if (!anAlphabet.equals(aCharacter)) {
                if (result.size() >= 1) {
                    result = addCharacterTo(result, anAlphabet, 2);
                } else {
                    result = addCharacterTo(result, anAlphabet, 1);
                }
            } else {
                break;
            }
        }
        return result;
    }


    private List<String> completeResult(final String aCharacter, List<String> aResult) {
        if (aResult.size() == 0) {
            aResult = addCharacterTo(aResult, A, 1);
        } else {
            aResult = addCharacterTo(aResult, aCharacter, 2);
            aResult.addAll(getSecondHalfOf(aResult));
        }
        return aResult;
    }


    private List<String> getSecondHalfOf(final List<String> aResult) {
        List<String> secondHalf = new LinkedList<String>();
        final int size = aResult.size();
        for (int i = (size - 3); i >= 0; i--) {
            secondHalf = addCharacterTo(secondHalf, aResult.get(i), 1);
        }
        return secondHalf;
    }


    private List<String> addCharacterTo(final List<String> aResult, final String aCharacter, final int aCount) {
        for (int i = 0; i < aCount; i++) {
            aResult.add(aCharacter);
        }

        return aResult;
    }
}
