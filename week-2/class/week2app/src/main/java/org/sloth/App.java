package org.sloth;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    }

    private static void printSquare(int i) {
        throw new UnsupportedOperationException("We will implement this in class!");
    }

    private static void printSquare(double x){
        throw new UnsupportedOperationException("We will implement this in class!");
    } 

    // TODO: Add parameters!
    private static void multiplyNumbers() {
        throw new UnsupportedOperationException("We will implement this in class!");
    }

    // Scope example.
    private void brokenMethodToDemonstrateScope() {
        int x = 5;
        if (x == 5){
            int x = 6;
            int y = 72;

            System.out.println("x = " + x + " y = " + y);
        }
        System.out.println("x = " + x + " y = " + y);
    }
}
