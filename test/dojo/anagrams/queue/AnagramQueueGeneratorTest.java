package dojo.anagrams.queue;

import dojo.anagrams.recursive.AnagramRecursiveGeneratorTest;

/**
 * @author apodoprigora (23/01/2013)
 */
public class AnagramQueueGeneratorTest extends AnagramRecursiveGeneratorTest {

    @Override
    protected void initGenerator() {
        anagramGenerator = new AnagramQueueGenerator();
    }
}
