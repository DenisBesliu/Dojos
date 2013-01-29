package dojo.count_coins;

import java.util.List;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: ajelimalai
 * @created: 29/01/13
 */
public class CountCoinsTest {

    private CountCoins countCoins;


    @Before
    public void setUp() throws Exception {
        countCoins = new CountCoins();
    }


    @Test
    public void zero() {
        final List<Combination> combinations = countCoins.getCombinations(0);
        assertTrue(combinations.isEmpty());
    }


    @Test
    public void one() {
        final List<Combination> combinations = countCoins.getCombinations(1);
        final Combination combination = new Combination(1, 0, 0, 0);
        assertEquals(combinations, combination);
    }


    private void assertEquals(final List<Combination> aActualResult, final Combination... aExpectedResult) {
        for (Combination combination : aExpectedResult) {
            assertTrue(aActualResult.contains(combination));
        }
    }

}
