KEY: Homework Week 1 - Intro to Programming in Java
==============================================
Understanding the Basics
------------------------
### Types
1. Define `Type` as it relates to programming.
```markdown
A type is a kind of value that can be stored or manipulated.
```
2. What `Type` would be used to store the value for `is it cloudy` today?
```java
boolean
```
3. What `Type` would be used to store the value for the `number of apples` we can buy with our allowance?
```java
int or Integer
```
4. What `Type` would be used to store the `amount of Bitcoin` it   takes to purchase a Tesla? (Assume not a whole number.)
```java
double
```
5. What `Type` would be used to store a simple `text message` between friends?
```java
String
```
### Variables
1. Define `Variable` as it relates to programming. What does this represent as it relates to computation?
```markdown
A variable is a named location in memory that stores the value of one particular type.
```
2. In a statically typed language, which two components are needed to declare a variable?
```markdown
A type and a name.
```
3. Which two or three components are needed to assign a variable?
```markdown
1) A variable and a value.
2) A type, a name, and a value.
```
4. Declare and assign a variable for `is it cloudy` today.
```java
boolean cloudyOutside = false;
```
5. Declare and assign a variable for a `text message`.
```java
String textMessage = "Java is kind of neat";
```
6. Declare a variable that will hold `all of the Bitcoin` we will earn from learning to program.
```java
double bitcoin;
```
### Operators
1. Define `Operator` as it relates to mathematics.
```markdown
An operator is a symbol that performs simple computations.
```

Hands on Programming Exercises
------------------------------
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
| Output Order | Output Value |
| :----------- | :----------: |
| 1            |     13.0     |
| 2            |     6.5      |
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
| Output Order | Output Value |
| :----------- | :----------: |
| 1            |     7.0      |
| 2            |     3.5      |
| 3            |     7.0      |
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
| Output Order | Output Value |
| :----------- | :----------: |
| 1            |    hello     |
| 2            |  helloworld  |
| 3            | helloworld3  |