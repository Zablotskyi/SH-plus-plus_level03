package src.com.shpp.p2p.cs.vzablotskyi.assignment3;

import org.w3c.dom.ls.LSOutput;

public class Assignment3Part5 {
    private static final int INITIAL_AMOUNT_OF_MONEY_OF_THE_LUCKY_ONE = 0; // the initial value of the Lucky One's wallet
    private static final int INITIAL_AMOUNT_OF_MONEY_OF_THE_SWEATY = 1000; // the initial value of Sweaty's wallet
    private static final int AMOUNT_OF_MONEY_ON_THE_TABLE = 1; // the amount of coins is on the table before the first coin toss

    public static void main(String[] args) {
        LuckyOne luckyMan = new LuckyOne();
        Sweaty sweaty = new Sweaty();
        whoWon();
    }
    /*Two people play: the lucky one and the sweaty one. The lucky one leaves the casino when he earns $20 or more.
    The sweaty man puts $1 on the table, and the lucky man starts flipping a coin.
    If it's heads, the sweaty man adds the exact same amount to the amount on the table.
    If the coin comes up tails, the lucky person gets everything on the table.
    If the lucky player ends up with less than $20, the game is repeated.*/
    private static void whoWon() {
        int amountOfMoneyOnTheTable = AMOUNT_OF_MONEY_ON_THE_TABLE;
        int numberOfGame = 0;

        while (LuckyOne.wallet <= 20) {
            numberOfGame++;
            Sweaty.wallet--;
            String coinFlip = coinFlip();

            if (coinFlip.equals("eagle")) {
                Sweaty.wallet = LuckyOne.wallet + amountOfMoneyOnTheTable;
                amountOfMoneyOnTheTable = amountOfMoneyOnTheTable * 2;
            } else if (coinFlip.equals("tails")) {
                Sweaty.wallet--;
                LuckyOne.wallet = LuckyOne.wallet + amountOfMoneyOnTheTable;
                System.out.println("This game, you earned $ " + amountOfMoneyOnTheTable);
                System.out.println("Your total is $ " + LuckyOne.wallet);
                amountOfMoneyOnTheTable = AMOUNT_OF_MONEY_ON_THE_TABLE;
            }
        }
        System.out.println("It took " + numberOfGame + " games to earn $20");
    }

    /*The method simulates a coin flip. The variable sideOfTheCoin is assigned the value of the coin that we have flipped.*/
    public static String coinFlip() {
        String sideOfTheCoin = null;
        int randomValue = (Math.random() < 0.5) ? 0 : 1;
        sideOfTheCoin = randomValue == 0 ? "eagle" : "tails";
        return sideOfTheCoin;
    }

    /* create the object Lucky One*/
    private static class LuckyOne {
        // create a LuckyOne wallet and specify the amount on it
        public static int wallet = INITIAL_AMOUNT_OF_MONEY_OF_THE_LUCKY_ONE;
    }

    /* create the Sweaty object*/
    private static class Sweaty {
        // create a Sweaty wallet and specify the amount on it
        public static int wallet = INITIAL_AMOUNT_OF_MONEY_OF_THE_SWEATY;
    }
}