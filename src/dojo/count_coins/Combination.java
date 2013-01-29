package dojo.count_coins;

import java.util.Arrays;

/**
 * @author: ajelimalai
 * @created: 29/01/13
 */
public class Combination {

    private final int[] coins = new int[4];


    public Combination(final int aPennie, final int aNickel, final int aDime, final int aQuarter) {
        setPennie(aPennie);
        setNickel(aNickel);
        setDime(aDime);
        setQuarter(aQuarter);
    }


    public void setPennie(final int aValue) {
        coins[Coin.PENNIE.ordinal()] = aValue;
    }


    public void setDime(final int aValue) {
        coins[Coin.DIME.ordinal()] = aValue;
    }


    public void setNickel(final int aValue) {
        coins[Coin.NICKEL.ordinal()] = aValue;
    }


    public void setQuarter(final int aValue) {
        coins[Coin.QUARTER.ordinal()] = aValue;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Combination that = (Combination)o;

        if (!Arrays.equals(coins, that.coins)) {
            return false;
        }

        return true;
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(coins);
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (final Coin coin : Coin.values()) {
            builder.append(coin).append(": ").append(coins[coin.ordinal()]);
            builder.append("\n");
        }
        return builder.toString();
    }
}
