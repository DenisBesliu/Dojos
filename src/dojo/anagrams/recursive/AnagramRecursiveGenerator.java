package dojo.anagrams.recursive;

import java.util.ArrayList;
import java.util.List;

import dojo.anagrams.AnagramGenerator;

/**
 * @author: ajelimalai
 * @created: 22/01/13
 */
public class AnagramRecursiveGenerator implements AnagramGenerator {

    @Override
    public List<String> generate(final String aValue) {
        final List<String> result = new ArrayList<String>();
        if (aValue == null || aValue.isEmpty()) {
            return result;
        }
        if (aValue.length() == 1) {
            result.add(aValue);
            return result;
        }

        if (aValue.length() == 2) {
            result.add(aValue);
            for (int i = aValue.length() - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    result.add(swapChars(aValue, i, j));
                }
            }
        } else {
            for (int i = 0; i < aValue.length(); i++) {
                final String value = skipPosition(aValue, i);
                for (final String possibleValues : generate(value)) {
                    result.add("" + aValue.charAt(i) + possibleValues);
                }
            }
        }
        return result;
    }


    private String skipPosition(final String aValue, final int aPosition) {
        return aValue.substring(0, aPosition) + aValue.substring(aPosition + 1);
    }


    private String swapChars(final String aValue, final int aI, final int aJ) {
        final char[] values = aValue.toCharArray();
        final char tmp = values[aI];
        values[aI] = values[aJ];
        values[aJ] = tmp;
        return String.valueOf(values);
    }
}
