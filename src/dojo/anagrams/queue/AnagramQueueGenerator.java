package dojo.anagrams.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import dojo.anagrams.AnagramGenerator;
import dojo.factorial.Factorial;

/**
 * @author: apodoprigora
 * @created: 22/01/13
 */
public class AnagramQueueGenerator implements AnagramGenerator {

    final Factorial factorial;


    public AnagramQueueGenerator() {
        factorial = new Factorial();
    }


    public List<String> generate(final String aValue) {
        if (aValue == null || aValue.isEmpty()) {
            return Collections.emptyList();
        }
        final Queue<String> queue = new LinkedList<String>();
        final Queue<String> charsToParse = getCharsToParse(aValue);
        queue.offer(charsToParse.poll());
        int currentStep = 0;
        while (!charsToParse.isEmpty()) {
            currentStep++;
            enqueueNextLevel(queue, charsToParse.poll(), factorial.calculate(currentStep));
        }
        return new ArrayList<String>(queue);
    }


    private Queue<String> getCharsToParse(final String aValue) {
        final Queue<String> charsToParse = new LinkedList<String>();
        for (int i = aValue.length() - 1; i >= 0; i--) {
            charsToParse.offer(String.valueOf(aValue.charAt(i)));
        }
        return charsToParse;
    }


    private void enqueueNextLevel(final Queue<String> aQueue, final String aCharacter, final long aLevelItems) {
        for (int i = 0; i < aLevelItems; i++) {
            final String characters = aQueue.poll();
            for (int j = 0; j <= characters.length(); j++) {
                aQueue.offer(characters.substring(0, j) + aCharacter + characters.substring(j));
            }
        }
    }
}
