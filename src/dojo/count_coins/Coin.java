package dojo.count_coins;

/**
* @author: ajelimalai
* @created: 29/01/13
*/
enum Coin {
    PENNIE(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int getValue() {
        return value;
    }

    private final int value;


    Coin(final int aValue) {
        value = aValue;
    }
}
