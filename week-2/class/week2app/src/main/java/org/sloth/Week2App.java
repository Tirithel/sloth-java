package org.sloth;

/**
 * Hello world!
 *
 */
public class Week2App 
{
    public static void main( String[] args )
    {
        int x = 42;
        printSquare(x);
    }


    private static void printSquare(double x){
        System.out.print(Math.pow(x, 2));
    } 
    
    @SuppressWarnings("all")
    private static int multiplyNumbers(int x, int y) {
        return x * y;
    }

    // Scope example.
    @SuppressWarnings("all")
    private void brokenMethodToDemonstrateScope() {
        int x = 5;
        if (x == 5){
            //int x = 6;
            int y = 72;

            System.out.println("x = " + x + " y = " + y);
        }
        System.out.println("x = " + x + " y = " + y);
    }
}
