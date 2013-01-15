package dojo.digital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dbesliu
 * @created 12/20/12
 */
public class NumberDecomposer {

    public static final int DIVIDER = 10;


    public Integer[] decomposeNumber(final Integer aNumber) {
        if (aNumber == null) {
            return new Integer[] {};
        }
        final List<Integer> list = decompose(aNumber);
        return list.toArray(new Integer[list.size()]);
    }


    private List<Integer> decompose(final int aNumber) {
        final List<Integer> list = new ArrayList<Integer>();
        int number = aNumber;
        do {
            list.add(number % 10);
            number /= 10;
        } while (number > 0);
        Collections.reverse(list);
        return list;
    }
}
