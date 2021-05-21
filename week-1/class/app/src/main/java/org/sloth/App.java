package org.sloth;

/**
 * Hello world!
 */
public final class App {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int apples = 0;

        int bobbysApples = 2;
        int annsApples = 3;

        int pearBush = 14;
        int JohnSmith = 42;

        double JohnSmithsWallet = 423.98;
        double pearCost = 3.00;

        apples = bobbysApples + annsApples;

        int pearsHeCanAfford = ((int) (JohnSmithsWallet/pearCost));

        System.out.println("Apples:\t" + apples);
        System.out.println("Pears:\t" + (pearBush * JohnSmith));
        System.out.println("John Smith can buy " + pearsHeCanAfford + " pears, with $" + (JohnSmithsWallet % pearCost) + " left over");
    }
}
