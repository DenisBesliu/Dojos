package dojo.digital;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author dbesliu
 * @created 12/20/12
 */
public class NumberDecomposerTest {

    private final NumberDecomposer numberDecomposer = new NumberDecomposer();


    @Test
    public void decomposeNumber_NullReturnsEmptyArray() {
        Assert.assertArrayEquals(new Integer[] {}, numberDecomposer.decomposeNumber(null));
    }


    @Test
    public void decomposeNumber_ZeroReturnsArrayWithZero() {
        Assert.assertArrayEquals(new Integer[] { 0 }, numberDecomposer.decomposeNumber(0));
    }


    @Test
    public void decomposeNumber_OneReturnsArrayWithOne() {
        Assert.assertArrayEquals(new Integer[] { 1 }, numberDecomposer.decomposeNumber(1));
    }


    @Test
    public void decomposeNumber_TwoDigitsNumberReturnsArrayWithDigits() {
        Assert.assertArrayEquals(new Integer[] { 1, 2 }, numberDecomposer.decomposeNumber(12));
    }


    @Test
    public void decomposeNumber_MultiDigitsNumberReturnsArrayWithDigits() {
        Assert.assertArrayEquals(new Integer[] { 1, 2, 4, 2, 3, 2, 5 }, numberDecomposer.decomposeNumber(1242325));
    }
}
