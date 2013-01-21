package dojo.doors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vstratienco
 * @created 1/21/13
 */
public class DoorsTest {

    private Doors doors;


    @Before
    public void setUp() {
        doors = new Doors();
    }


    @Test(expected = InvalidNumberOfDoorsException.class)
    public void zero() {
        doors.compute(0);
    }


    @Test(expected = InvalidNumberOfDoorsException.class)
    public void lessThanZero() {
        doors.compute(-123);
    }


    @Test
    public void oneDoor() {
        Assert.assertArrayEquals(new Boolean[] { true }, doors.compute(1));
    }


    @Test
    public void twoDoors() {
        Assert.assertArrayEquals(new Boolean[] { true, false }, doors.compute(2));
    }


    @Test
    public void threeDoors() {
        Assert.assertArrayEquals(new Boolean[] { true, false, false }, doors.compute(3));
    }


    @Test
    public void tenDoors() {
        Assert.assertArrayEquals(new Boolean[] { true, false, false, true, false, false, false, false, true, false }, doors.compute(10));
    }


    @Test
    public void hunderdDoors() {
        for (Boolean val : doors.compute(100)) {
            System.out.println(val);
        }
        Assert.assertArrayEquals(new Boolean[] { true, false, false, true, false, false, false, false, true, false }, doors.compute(10));
    }
}
