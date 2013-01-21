package dojo.doors;

import java.util.Arrays;

/**
 * @author vstratienco
 * @created 1/21/13
 */
public class Doors {

    public Boolean[] compute(final int aNumbersOfDoors) {
        checkNumberOfDoors(aNumbersOfDoors);
        Boolean[] doors = new Boolean[aNumbersOfDoors];
        Arrays.fill(doors, false);
        for (int i = 0; i < aNumbersOfDoors; i++) {
            for (int j = i; j < aNumbersOfDoors; j += i + 1) {
                doors[j] = !doors[j];
            }
        }

        return doors;
    }


    private void checkNumberOfDoors(final int aDoors) {
        if (aDoors <= 0) {
            throw new InvalidNumberOfDoorsException();
        }
    }
}
