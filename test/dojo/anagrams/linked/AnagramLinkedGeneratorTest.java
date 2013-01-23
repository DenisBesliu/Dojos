package dojo.anagrams.linked;

import dojo.anagrams.recursive.AnagramRecursiveGeneratorTest;
import org.junit.Ignore;

/**
 * @author apodoprigora (23/01/2013)
 */
@Ignore
public class AnagramLinkedGeneratorTest extends AnagramRecursiveGeneratorTest {

    @Override
    protected void initGenerator() {
        anagramGenerator = new AnagramLinkedGenerator();
    }
}
