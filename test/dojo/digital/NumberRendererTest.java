package dojo.digital;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 * @author dbesliu
 * @created 12/20/12
 */
public class NumberRendererTest {

    NumberDigitizerFactory numberRender = new NumberDigitizerFactory();


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
        String [][] actualArray= numberRender.digitizerBy(0).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {"|",".","|"},
                                     {"|","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_One() {
        String [][] actualArray= numberRender.digitizerBy(1).toDigit();
        String [][] expectedArray = {{".",".","."},
                                     {".",".","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Two() {
        String [][] actualArray= numberRender.digitizerBy(2).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {".","_","|"},
                                     {"|","_","."}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Three() {
        String [][] actualArray= numberRender.digitizerBy(3).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {".","_","|"},
                                     {".","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Four() {
        String [][] actualArray= numberRender.digitizerBy(4).toDigit();
        String [][] expectedArray = {{".",".","."},
                                     {"|","_","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Five() {
        String [][] actualArray= numberRender.digitizerBy(5).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {"|","_","."},
                                     {".","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Six() {
        String [][] actualArray= numberRender.digitizerBy(6).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {"|","_","."},
                                     {"|","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Seven() {
        String [][] actualArray= numberRender.digitizerBy(7).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {".",".","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void convertNumberToDigitString_Eight() {
        String [][] actualArray= numberRender.digitizerBy(8).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {"|","_","|"},
                                     {"|","_","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }


    @Test
    public void convertNumberToDigitString_Nine() {
        String [][] actualArray= numberRender.digitizerBy(9).toDigit();
        String [][] expectedArray = {{".","_","."},
                                     {"|","_","|"},
                                     {".",".","|"}};
        assertArrayEquals(expectedArray, actualArray);
    }
}