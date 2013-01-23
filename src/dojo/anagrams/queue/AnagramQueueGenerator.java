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


    public List<String> generate(String aValue) {
        if (aValue == null || aValue.isEmpty()) {
            return Collections.emptyList();
        }
        final Queue<String> previousResult = new LinkedList<String>();
        previousResult.offer(aValue.substring(aValue.length() - 1));
        aValue = aValue.substring(0,aValue.length()-1);
        int currentStep = 0;
        while (!aValue.isEmpty()) {
            currentStep++;
            final String newPrefix = aValue.substring(aValue.length() - 1);
            aValue = aValue.substring(0, aValue.length()-1);
            for(int i=0; i< factorial.calculate(currentStep); i++){
                final String newSuffix = previousResult.poll();
                for (int j = 0; j <= newSuffix.length(); j++) {
                    previousResult.offer(newSuffix.substring(0, j) + newPrefix + newSuffix.substring(j));
                }
            }
        }
        return new ArrayList<String>(previousResult);
    }
}
