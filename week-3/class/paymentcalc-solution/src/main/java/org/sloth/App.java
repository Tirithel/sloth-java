package org.sloth;

/**
 * Hello world!
 *
 */
public class App 
{
    protected static class Employee {
        protected String name;
        protected double wage;
        protected int hours;

        protected Employee (String n, double w, int h) {
            this.name   = n;
            this.wage   = w;
            this.hours  = h;
        }
    }

    private static Employee underpaidEmployee  = new Employee("Bob", 7.50, 45);
    private static Employee normalEmployee     = new Employee("Anna", 8.0, 40);
    private static Employee overtimeEmployee   = new Employee("Roger", 8.5, 55);
    private static Employee overworkedEmployee = new Employee("Diana", 8.5, 61);

    public static void main( String[] args )
    {
        Employee[] arr = {underpaidEmployee, normalEmployee, overtimeEmployee, overworkedEmployee};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
            calculatePay(arr[i].wage, arr[i].hours);
        }
    }

    // Output: "Overworked employee: Employee made $595.00 by working 61 hours."
    // Output: "Employee made $531.25 by working 55 hours."
    // Output: "Underpaid employee: Employee made $356.25 by working 45 hours."
    public static String calculatePay(double wage, int hours) {
        double pay;

        if (hours > 40) {
            int difference = hours - 40;
            if (difference > 20) difference = 20;
            pay = 40 * wage + (1.5 * difference * wage);
        } else {
            pay = hours * wage;
        }

        String output = "";

        if (hours > 60) {
            output = "Overworked employee: ";
        }

        if (wage < 8.00) {
            output = "Underpaid employee: ";
        }

        output = output + "Employee made $" + String.format("%.2f", pay) + " by working " + hours + " hours.";

        System.out.println(output);
        return output;
    }
}
