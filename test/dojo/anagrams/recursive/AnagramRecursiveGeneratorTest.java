package dojo.anagrams.recursive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        assertVarArgs(result, "a");
    }


    @Test
    public void twoCharValue() {
        final List<String> result = anagramGenerator.generate("ab");
        assertVarArgs(result, "ab", "ba");
    }


    @Test
    public void threeCharValue() {
        final List<String> result = anagramGenerator.generate("abc");
        assertVarArgs(result, "abc", "acb", "bca", "bac", "cba", "cab");
    }


    @Test
    public void fourCharValue() {
        final List<String> result = anagramGenerator.generate("abcd");
        assertVarArgs(result, "abcd", "abdc", "acbd", "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac", "bdca", "cabd",
                      "cadb", "cbad", "cbda", "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba");
    }


    @Test
    public void biroCharValue() {
        final List<String> result = anagramGenerator.generate("biro");
        assertVarArgs(result, "biro", "bior", "brio", "broi", "boir", "bori", "ibro", "ibor", "irbo", "irob", "iobr", "iorb", "rbio",
                      "rboi", "ribo", "riob", "roib", "robi", "obir", "obri", "oibr", "oirb", "orbi", "orib");
    }


    private void assertVarArgs(final List<String> aActual, final String... aExpected) {
        assertTrue("Expected result should be unique", areUnique(Arrays.asList(aExpected)));
        assertTrue("Actual result should be unique",areUnique(aActual));

        System.out.println("Expected : " + Arrays.toString(aExpected));
        System.out.println("Actual   : " + aActual);
        assertEquals("The sizes should match", aExpected.length, aActual.size());
        for (final String value : aExpected) {
            assertTrue("Actual should contain : " +value ,aActual.contains(value));
        }
    }


    private boolean areUnique(final Iterable<String> aActual) {
        final Set<String> temp = new HashSet<String>();
        for (final String string : aActual) {
            temp.add(string);
        }
        return temp.size() == temp.size();
    }

}
