package dojo.anagrams.recursive;

import java.util.List;

import dojo.anagrams.AnagramGenerator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: ajelimalai
 * @created: 22/01/13
 */
public class AnagramRecursiveGeneratorTest {

    protected AnagramGenerator anagramGenerator;


    @Before
    public void setUp() throws Exception {
        initGenerator();

    }


    protected void initGenerator() {
        anagramGenerator = new AnagramRecursiveGenerator();
    }


    @Test
    public void nullValue() {
        final List<String> result = anagramGenerator.generate(null);
        assertTrue(result.isEmpty());
    }


    @Test
    public void emptyValue() {
        final List<String> result = anagramGenerator.generate("");
        assertTrue(result.isEmpty());
    }


    @Test
    public void oneCharValue() {
        final List<String> result = anagramGenerator.generate("a");
        assertTrue(result.contains("a"));
        assertEquals(1, result.size());
    }


    @Test
    public void twoCharValue() {
        final List<String> result = anagramGenerator.generate("ab");
        assertEquals(2, result.size());
        assertTrue(result.contains("ab"));
        assertTrue(result.contains("ba"));
    }


    @Test
    public void threeCharValue() {
        final List<String> result = anagramGenerator.generate("abc");
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("cba"));
        assertTrue(result.contains("cab"));
    }


    @Test
    public void fourCharValue() {
        final List<String> result = anagramGenerator.generate("abcd");
        assertEquals(24, result.size());
        System.out.println(result);
        /*
         * assertVarArgs(result, new String[]{"abcd", "abdc", "acbd", "acdb", "adbc", "adcb, bacd, badc, bcad, bcda, bdac, bdca, cabd,
         * cadb",
         */
        // "cbad",
        // "cbda, cdab, cdba, dabc, dacb, dbac, dbca, dcab, dcba});
    }


    private void assertVarArgs(final List<String> aResult, final String[] aExpected) {
        for (final String value : aExpected) {
            assertTrue(aResult.contains(value));
        }
    }


    @Test
    public void biroCharValue() {
        final List<String> result = anagramGenerator.generate("biro");
        assertEquals(24, result.size());
        System.out.println(result);
    }

}
