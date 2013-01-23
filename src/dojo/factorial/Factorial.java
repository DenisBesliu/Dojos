package dojo.factorial;

/**
 * @author andrei (23/01/2013)
 */
public class Factorial {


    public long calculate(final int aValue) {
        if (aValue < 0) {
            throw new RuntimeException("Factorial for negative number cannot be calculated here");
        }
        if (aValue == 0) {
            return 1;
        }
        long counter = 1;
        long result = 1;
        while (counter < aValue) {
            result = result * ++counter;
        }
        return result;

    }
}
