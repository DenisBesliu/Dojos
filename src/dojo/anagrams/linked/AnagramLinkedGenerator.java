package dojo.anagrams.linked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dojo.anagrams.AnagramGenerator;

/**
 * @author: ajelimalai
 * @created: 22/01/13
 */
public class AnagramLinkedGenerator implements AnagramGenerator{

    public List<String> generate(final String aValue) {
        if (aValue == null || aValue.isEmpty()) {
            return Collections.emptyList();
        }
        if (aValue.length() == 1) {
            return Collections.singletonList(aValue);
        }
        final List<String> result = new ArrayList<String>();
        final int wordLength = aValue.length();
        final List<Character> list = createLinkedCharacters(aValue);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                final StringBuilder currentWord = new StringBuilder();
                int currentPosition = i;
                if (list.get(currentPosition % list.size()) == null) {
                    continue;
                }
                while (currentWord.length() < wordLength) {
                    final Character currentChar = list.get(currentPosition % list.size());
                    if (currentChar != '_') {
                        currentWord.append(currentChar);
                    }
                    currentPosition += j;
                }
                result.add(currentWord.toString());
            }
        }
        return result;
    }


    private List<Character> createLinkedCharacters(final String aValue) {
        final List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < aValue.length(); i++) {
            list.add(aValue.charAt(i));
        }
        if (list.size() % 2 == 0) {
            list.add('_');
        }
        return list;
    }
}
