package dojo.factorial;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author andrei (23/01/2013)
 */
@RunWith(Parameterized.class)
public class FactorialTest {

    private final Factorial factorial;
    private final int initial;
    private final long expected;


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}, {7, 5040}});
    }


    public FactorialTest(final int aInitial, final long aExpected) {
        initial = aInitial;
        expected = aExpected;
        factorial = new Factorial();
    }


    @Test
    public void test() {
        assertEquals(expected, factorial.calculate(initial));
    }

}
