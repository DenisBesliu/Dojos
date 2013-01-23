package dojo.anagrams.linked;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

import dojo.anagrams.AnagramGenerator;

/**
 * @author: apodoprigora
 * @created: 22/01/13
 */
public class AnagramStackGenerator implements AnagramGenerator {

    public List<String> generate(String aValue) {
        if (aValue == null || aValue.isEmpty()) {
            return Collections.emptyList();
        }
        if (aValue.length() == 1) {
            return Collections.singletonList(aValue);
        }
        final Stack<String> previousResult = new Stack<String>();
        final Stack<String> nextResult = new Stack<String>();
        previousResult.push(aValue.substring(aValue.length() - 1));
        aValue = aValue.substring(0,aValue.length()-1);
        while (!aValue.isEmpty()) {
            final String newPrefix = aValue.substring(aValue.length() - 1);
            aValue = aValue.substring(0, aValue.length()-1);
            while (!previousResult.isEmpty()) {
                final String newSuffix = previousResult.pop();
                nextResult.push(newPrefix + newSuffix);
                nextResult.push(newSuffix + newPrefix);
                for (int i = 1; i < newSuffix.length(); i++) {
                    nextResult.push(newSuffix.substring(0, i) + newPrefix + newSuffix.substring(i));
                }
            }
            previousResult.addAll(nextResult);
            nextResult.clear();
        }
        return previousResult;
    }
}
