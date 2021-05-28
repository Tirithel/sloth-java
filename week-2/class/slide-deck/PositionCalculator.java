class PositionCalculator {
    public static void main(String[] args) { 
        double g    = -9.8; // Gravity pulls downwards at -9.8m/s
        double vi   = 0;    // initial velocity
        double t    = 10;    // time in free fall
        double yi   = 0;    // initial y offset

        /* calculate the final position without taking vi or initial position into account */

        // y = 1/2 * g * t^2
        double y = 0.5 * g * t * t;

        System.out.println("Our object starting from rest in free fall from offset 0 position of " + y + "m after falling for " + t + "s.");

        /* solving for final position given an initial velocity */

        y = y + (vi * t);

        System.out.println("Our object in free fall from offset 0 position of " + y + "m after falling for " + t + "s.");

        /* solving for final position given initial y offset */

        y = y + yi;

        System.out.println("Our object has been calculated to have the position of " + y + "m after falling for " + t + "s.");
    }
}