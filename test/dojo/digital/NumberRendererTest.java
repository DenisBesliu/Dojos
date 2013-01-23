package dojo.digital;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 * @author dbesliu
 * @created 12/20/12
 */
public class NumberRendererTest {

    final NumberDigitizerFactory numberRender = new NumberDigitizerFactory();


    @Test(expected = NonDigitizableNumberException.class)
    public void convertNumberToDigitString_NullNumber() {
        numberRender.digitizerBy(null);
    }

    @Test(expected = NonDigitizableNumberException.class)
    public void convertNumberToDigitString_NegativeNumber() {
        numberRender.digitizerBy(-1);
    }

    @Test(expected = NonDigitizableNumberException.class)
    public void convertNumberToDigitString_BigNumber() {
        numberRender.digitizerBy(10);
    }


    @Test
    public void convertNumberToDigitString_Zero() {
        final String [][] actualArray= numberRender.digitizerBy(0).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {"|",".","|"},
                                     {"|","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_One() {
        final String [][] actualArray= numberRender.digitizerBy(1).toDigit();
        final String [][] expectedArray = {{".",".","."},
                                     {".",".","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Two() {
        final String [][] actualArray= numberRender.digitizerBy(2).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {".","_","|"},
                                     {"|","_","."}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Three() {
        final String [][] actualArray= numberRender.digitizerBy(3).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {".","_","|"},
                                     {".","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Four() {
        final String [][] actualArray= numberRender.digitizerBy(4).toDigit();
        final String [][] expectedArray = {{".",".","."},
                                     {"|","_","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Five() {
        final String [][] actualArray= numberRender.digitizerBy(5).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {"|","_","."},
                                     {".","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Six() {
        final String [][] actualArray= numberRender.digitizerBy(6).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {"|","_","."},
                                     {"|","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Seven() {
        final String [][] actualArray= numberRender.digitizerBy(7).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {".",".","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Eight() {
        final String [][] actualArray= numberRender.digitizerBy(8).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {"|","_","|"},
                                     {"|","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }


    @Test
    public void convertNumberToDigitString_Nine() {
        final String [][] actualArray= numberRender.digitizerBy(9).toDigit();
        final String [][] expectedArray = {{".","_","."},
                                     {"|","_","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }
}
