package dojo.diamond;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dbesliu
 * @created 1/14/13
 */
public class DiamondPrinterTest {

    private DiamondPrinter printer;


    @Before
    public void setUp() throws Exception {
        printer = new DiamondPrinter();

    }


    @Test
    public void printDiamond_NullReturnsEmptyArray() {
        assertArrayEquals(new String[] {}, printer.printDiamond(null));
    }


    @Test
    public void printDiamond_A() {
        final String[] expected = { "A" };
        assertArrayEquals(expected, printer.printDiamond("A"));
    }


    @Test
    public void printDiamond_B() {
        final String[] expected = { "A", "B", "B", "A" };
        printResult(expected);
        assertArrayEquals(expected, printer.printDiamond("B"));
    }


    @Test
    public void printDiamond_C() {
        final String[] expected = { "A", "B", "B", "C", "C", "B", "B", "A" };
        printResult(expected);
        assertArrayEquals(expected, printer.printDiamond("C"));
    }


    @Test
    public void printDiamond_D() {
        final String[] expected = { "A", "B", "B", "C", "C", "D", "D", "C", "C", "B", "B", "A" };
        printResult(expected);
        assertArrayEquals(expected, printer.printDiamond("D"));
    }


    @Test
    public void printDiamond_E() {
        final String[] expected = { "A", "B", "B", "C", "C", "D", "D", "E", "E", "D", "D", "C", "C", "B", "B", "A" };
        printResult(expected);
        assertArrayEquals(expected, printer.printDiamond("E"));
    }


    @Test
    public void printDiamond_G() {
        final String[] expected = { "A", "B", "B", "C", "C", "D", "D", "E", "E", "F", "F", "G", "G", "F", "F", "E", "E", "D", "D", "C",
                                   "C", "B", "B", "A" };
        printResult(expected);
        assertArrayEquals(expected, printer.printDiamond("G"));
    }

    @Test
    public void printDiamond_H() {
        final String[] expected = { "A", "B", "B", "C", "C", "D", "D", "E", "E", "F", "F", "G", "G","H", "H","G", "G", "F", "F", "E", "E", "D", "D", "C",
                                    "C", "B", "B", "A" };
        printResult(expected);
        assertArrayEquals(expected, printer.printDiamond("H"));
    }


    private void printResult(final String[] aResultArray) {
        final int middle = aResultArray.length / 2;
        printSpace(middle);
        printNewLine(aResultArray[0]);

        if (aResultArray.length > 1) {
            printDiamond(aResultArray, middle);
            printSpace(middle);
            printNewLine(aResultArray[aResultArray.length - 1]);
        }
    }


    private void printNewLine(final String aCharacter) {
        System.out.println(aCharacter);
    }


    private void printDiamond(final String[] aResultArray, final int aMiddle) {
        int row = 1;
        int iterations = 0;
        int desc = 1;
        for (int i = 1; i < aResultArray.length - 1; i += 2) {
            if (i < aMiddle) {
                printDiamondElement(aResultArray[i], aMiddle - row);
                printDiamondElement(aResultArray[i + 1], 2 * row - 1);
                printNewLine("");
                row++;
            } else {
                row = iterations - desc;
                printDiamondElement(aResultArray[i], aMiddle - row);
                printDiamondElement(aResultArray[i + 1], aMiddle - 2 * desc - 1);
                printNewLine("");
                desc++;
                continue;
            }
            iterations++;
        }
    }


    private void printDiamondElement(final String aCharacter, final int aSpaces) {
        printSpace(aSpaces);
        System.out.print(aCharacter);
    }


    private void printSpace(final int aCount) {
        for (int i = 0; i < aCount; i++) {
            System.out.print(" ");
        }
    }

}
