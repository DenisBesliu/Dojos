package dojo.anagrams.stack;

import dojo.anagrams.recursive.AnagramRecursiveGeneratorTest;

/**
 * @author: ajelimalai
 * @created: 24/01/13
 */
public class AnagramStackGeneratorTest extends AnagramRecursiveGeneratorTest {
    @Override
    protected void initGenerator() {
        anagramGenerator = new AnagramStackGenerator();
    }
}
