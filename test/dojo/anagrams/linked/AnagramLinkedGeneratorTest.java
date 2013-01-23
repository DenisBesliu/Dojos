package dojo.anagrams.linked;

import dojo.anagrams.recursive.AnagramRecursiveGeneratorTest;

/**
 * @author apodoprigora (23/01/2013)
 */
public class AnagramLinkedGeneratorTest extends AnagramRecursiveGeneratorTest {

    @Override
    protected void initGenerator() {
        anagramGenerator = new AnagramLinkedGenerator();
    }
}
