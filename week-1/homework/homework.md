# Homework Week 1 - Java
## Understanding the Basics
### Types
  1) Define `Type` as it relates to programming.
  2) What `Type` would be used to store the value for `is it cloudy` today?
  3) What `Type` would be used to store the value for the `number of apples` we can buy with our allowance?
  4) What `Type` would be used to store the `amount of Bitcoin` it   takes to purchase a Tesla? (Assume not a whole number)
  5) What `Type` would be used to store a simple `text message` between friends?
### Variables
  1) Define `Variable` as it relates to programming. What does this   represent as it relates to computation?
  2) In a statically typed language, which two components are needed to declare a variable?
  3) Which two or three components are needed to assign a variable?
  4) Declare and assign a variable for `is it cloudy` today.
  5) Declare and assign a variable for a `text message`.
  6) Declare a variable that will hold `all of the Bitcoin` we will   earn from learning to program.
### Operators
  1) Define `Operator` as it relates to mathematics.

## Hands on
In this section we will look at some blocks of java code and try to understand what the system output will be without executing the code. If you are stuck, feel free to execute it, but do try to understand what the code is doing. 
```java
class DoMath {
    public static void main(String[] arguments) {
        double score = 1.0 + 4.0 * 3.0;
        System.out.println(score);
        score = score / 2.0;
        System.out.println(score);
    }
}
```
| Output Order      | Output Value     |
| :---              |    :----:        |
| 1                 |                  |
| 2                 |                  |
____
```java
class DoMath {
    public static void main(String[] arguments) {
        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score);
        double copy = score;
        copy = copy / 2.0;
        System.out.println(copy);
        System.out.println(score);
    }
}
```
| Output Order      | Output Value     |
| :---              |    :----:        |
| 1                 |                  |
| 2                 |                  |
| 3                 |                  |
___
```java
class DoConcat {
    public static void main(String[] arguments) {
        String text = "hello";
        System.out.println(text);
        String text2 = "world";
        text = text + text2;
        System.out.println(text);
        System.out.println(text + 3);
    }
}
```
| Output Order      | Output Value     |
| :---              |    :----:        |
| 1                 |                  |
| 2                 |                  |
| 3                 |                  |