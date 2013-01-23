package dojo.digital;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dbesliu
 * @created 1/14/13
 */
public class DigitalNumberDecomposerTest {

    private DigitalNumberDecompozer numberDecomposer;


    @Before
    public void setUp() throws Exception {
        numberDecomposer = new DigitalNumberDecompozer();
    }


    @Test
    public void decomposeNumber_Zero() {
        Assert.assertArrayEquals("Should return 0.", new String[][] { { ".", "_", "." }, { "|", ".", "|" }, { "|", "_", "|" } },
                                 numberDecomposer.decompose(0));
    }


    @Test
    public void decomposeNumber_Ten() {
        final String[][] actualResult = numberDecomposer.decompose(10);
        Assert.assertArrayEquals("10", new String[][] { { ".", ".", ".", ".", "_", "." }, { ".", ".", "|", "|", ".", "|" },
                                                       { ".", ".", "|", "|", "_", "|" } }, actualResult);
    }


    @Test
    public void decomposeNumber_1234567890Print() {
        printResult(numberDecomposer.decompose(1234567890));
    }


    public void printResult(final String[][] aArray) {
        for (final String[] subArray : aArray) {
            for (int j = 0; j < subArray.length; j++) {
                if (!subArray[j].equals(".")) {
                    System.out.print(subArray[j]);
                } else {
                    System.out.print(" ");
                }
                if ((j + 1) % 3 == 0) {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

}
