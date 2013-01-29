package dojo.count_coins;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ajelimalai
 * @created: 29/01/13
 */
public class CountCoins {

    public List<Combination> getCombinations(final int aValue) {
        List<Combination> result = new ArrayList<Combination>();
        if (aValue == 0) {
            return result;
        }
        result.add(new Combination(1, 0, 0, 0));
        return result;
    }
}
