package org.sloth;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    protected class Employee {
        protected String name;
        protected double wage;
        protected int hours;

        protected Employee (String n, double w, int h) {
            this.name   = n;
            this.wage   = w;
            this.hours  = h;
        }
    }

    private Employee underpaidEmployee  = new Employee("Bob", 7.50, 45);
    private Employee normalEmployee     = new Employee("Anna", 8.0, 40);
    private Employee overtimeEmployee   = new Employee("Roger", 8.5, 55);
    private Employee overworkedEmployee = new Employee("Diana", 8.5, 61);

    @Test
    public void testEmployeeIsUnderpaid()
    {
        App.calculatePay(underpaidEmployee.wage, underpaidEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Bob is underpaid, but the output doesn't indicate that.", result.startsWith("Underpaid employee:"));
    }

    @Test
    public void testUnderpaidEmployeeHours()
    {
        App.calculatePay(underpaidEmployee.wage, underpaidEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Bob's hours aren't being displayed.", result.contains("45"));
    }

    @Test
    public void testUnderpaidEmployeeEarnings()
    {
        App.calculatePay(underpaidEmployee.wage, underpaidEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Bob's earnings aren't being calculated properly.", result.contains("356.25"));
    }

    @Test
    public void testUnderpaidEmployeeFormat()
    {
        App.calculatePay(underpaidEmployee.wage, underpaidEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Bob's output may be formatted incorrectly.", result.contains("Underpaid employee: Employee made $356.25 by working 45 hours."));
    }

    @Test
    public void normalEmployeeTestHours()
    {
        App.calculatePay(normalEmployee.wage, normalEmployee.hours);
        String result = outContent.toString();
        
        assertTrue("HINT: Anna's hours aren't being displayed.", result.contains("40"));
    }

    
    @Test
    public void normalEmployeeTestEarnings()
    {
        App.calculatePay(normalEmployee.wage, normalEmployee.hours);
        String result = outContent.toString();
        
        assertTrue("HINT: Anna's earnings aren't being calculated properly.", result.contains("320.00"));
    }

    
    @Test
    public void normalEmployeeTestFormat()
    {
        App.calculatePay(normalEmployee.wage, normalEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Anna's output may be formatted incorrectly.", result.contains("Employee made $320.00 by working 40 hours."));
    }
    
    @Test
    public void overtimeEmployeeTestHours()
    {
        App.calculatePay(overtimeEmployee.wage, overtimeEmployee.hours);
        String result = outContent.toString();
        
        assertTrue("HINT: Roger's hours aren't being displayed.", result.contains("55"));
    }

    @Test
    public void overtimeEmployeeTestEarnings()
    {
        App.calculatePay(overtimeEmployee.wage, overtimeEmployee.hours);
        String result = outContent.toString();
        
        assertTrue("HINT: Roger's earnings aren't being calculated properly.", result.contains("541.25"));
    }

    @Test
    public void overtimeEmployeeTestFormat()
    {
        App.calculatePay(overtimeEmployee.wage, overtimeEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Roger's output may be formatted incorrectly.", result.contains("Employee made $541.25 by working 55 hours."));
    }

    @Test
    public void testEmployeeIsOverworked()
    {
        App.calculatePay(overworkedEmployee.wage, overworkedEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Diana is overworked, but the output doesn't indicate that.", result.startsWith("Overworked employee:"));
    }

    @Test
    public void overworkedEmployeeTestHours()
    {
        App.calculatePay(overworkedEmployee.wage, overworkedEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Diana's hours aren't being displayed.", result.contains("61"));
    }

    @Test
    public void overworkedEmployeeTestEarnings()
    {
        App.calculatePay(overworkedEmployee.wage, overworkedEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Diana's earnings aren't being calculated properly.", result.contains("595.00"));
    }

    @Test
    public void overworkedEmployeeTestFormat()
    {
        App.calculatePay(overworkedEmployee.wage, overworkedEmployee.hours);
        String result = outContent.toString();

        assertTrue("HINT: Diana's output may be formatted incorrectly.", result.contains("Overworked employee: Employee made $595.00 by working 61 hours."));
    }
}
