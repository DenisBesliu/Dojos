package dojo.anagrams.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import dojo.anagrams.AnagramGenerator;

/**
 * @author: ajelimalai
 * @created: 24/01/13
 */
public class AnagramStackGenerator implements AnagramGenerator {

    private final Stack<Integer> stack = new Stack<Integer>();
    char[] chars;


    @Override
    public List<String> generate(final String aValue) {
        if (aValue == null || aValue.isEmpty()) {
            return Collections.emptyList();
        }
        final List<String> result = new ArrayList<String>();
        int index;
        boolean isStackValid = true;
        initFields(aValue);

        while (isNotStackEmpty()) {
            if (isStackFull() && isStackValid) {
                result.add(createWordFromStack());
            }
            index = stack.pop();
            index++;
            if (index >= chars.length) {
                continue;
            }
            isStackValid = isNotStackContain(index);
            stack.push(index);
            if (isStackValid) {
                isStackValid = true;
                fillStack();
            }
        }

        return result;
    }


    private boolean isNotStackContain(final int aIndex) {
        return !stack.contains(aIndex);
    }


    private boolean isNotStackEmpty() {
        return !stack.isEmpty();
    }


    private void initFields(final String aValue) {
        initCharArray(aValue);
        initStack();
        fillStack();
    }


    private void fillStack() {
        for (int i = 0; i < chars.length; i++) {
            if (isNotStackContain(i)) {
                stack.push(i);
            }
        }
    }


    private String createWordFromStack() {
        String word = "";
        for (final Integer integer : stack) {
            word += chars[integer];
        }
        return word;
    }


    private boolean isStackFull() {
        return stack.size() == chars.length;
    }


    private void initCharArray(final String aValue) {
        chars = aValue.toCharArray();
    }


    private void initStack() {
        stack.clear();
        stack.push(0);
    }
}
