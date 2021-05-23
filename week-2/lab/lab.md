Lab 2 - Pay Calculator
=======================

You have a group of employees that make different wages and work different hours that you want to calculate the pay for.

Our goal is to write a method that prints out how much we need to pay the employee, how many hours they worked, and what they base wage is.

We pay our employees overtime after they work more than 40 hours, and overtime gets paid at 1.5 their base pay.

Minimum wage is $8.00 (let us know if we need to pay them more in your output)

Maximum working hours is 60 hours a week (let us know if he's overworked, and make sure we **cap their pay at that 60 hour mark**)

**NOTE:** We don't pay for half hours.

Test cases being evaluated:

Employee: Makes $7.50, worked 45 hours.
Output: "Underpaid employee: Employee made $356.25 by working 45 hours."

Employee: Makes $8.00, worked 40 hours.
Output: "Employee made $320.00 by working 40 hours."

Employee: Makes $8.50, worked 55 hours.
Output: "Employee made $541.25 by working 55 hours."

Employee: Makes $8.50, worked 61 hours.
Output: "Overworked employee: Employee made $595.00 by working 61 hours."