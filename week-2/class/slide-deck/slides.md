Types, Methods, and Conditionals, OH MY!
========================================================
May 28, 2021 - Language Sloth, Intro to Java Programming

Table of Contents
-----------------
- [Types, Methods, and Conditionals, OH MY!](#types-methods-and-conditionals-oh-my)
  - [Table of Contents](#table-of-contents)
  - [Expectations](#expectations)
  - [Lesson Goal](#lesson-goal)
  - [Lesson One Review](#lesson-one-review)
  - [Lab Solution](#lab-solution)
  - [More Operators!](#more-operators)
  - [Order of Operations](#order-of-operations)
  - [Type Conversion](#type-conversion)
  - [Methods](#methods)
  - [What is Scope](#what-is-scope)
  - [Methods Use Case](#methods-use-case)
  - [Conditionals](#conditionals)
  - [Comparison Operators](#comparison-operators)
  - [Boolean Operators](#boolean-operators)
  - [Else](#else)
  - [Assignments](#assignments)

______________________________

Expectations
------------
- Assignments are designed to reinforce what we learned in class. If you don't feel the need to do them, you don't have to. This class is designed to give you back what you put into it. 

- Don't hesitate to reach out with questions, [well formatted](https://www.freecodecamp.org/news/how-to-ask-good-questions-as-a-developer-9f71ff809b63/
) questions will be answered to the best of my ability. It is my request that before asking questions outside of class hours, an effort was put in to understanding the problem.

- Test driven development is practiced when it makes sense.

- Mics will be muted when not asking or answering questions. If there are lots of questions, I may ask that you wait until the end of the class to have them answered.

- Projects can be submitted in any language. I can help the most with Java and Python, however I can give guidance on anything but syntax for most languages.

______________________________

Lesson Goal
-----------
The goal for lesson two is to really wrap our heads around methods and conditionals, and also solidify our knowledge gained from lesson one.

______________________________

Lesson One Review
--------------------

Define `Type` as it relates to programming.
```markdown
```

Define `Variable` as it relates to programming. What does this represent as it relates to computation?
```markdown
```

Define `Operator` as it relates to mathematics.
```markdown
```

______________________________

Lab Solution
------------

```markdown
WILL BE REVEALED ON CLASS DAY :)
```
______________________________

More Operators!
---------------
Enter the Division `/` operator. This guy is interesting because he works differently on integers and doubles.

```java
    double d = 1.0/2.0; // what does this come out to be?
    int i    = 4/2;
    int i    = 5/2;
    double d = 1/2;
```

Order of Operations
-------------------
Left to right with PEDMAS!

```java
    double d = 3 / 2 + 1; // what does this come out to be?
    double d = 3 / (2 + 1);
```
______________________________

Type Conversion
---------------
After class, last week we talked about `(int)` and what it was doing to a double. Lets see more of this in action! Java verifies that our types match unless it can be implicitly converted (example: int -> double).

```java
    // integer to string? 
    String favouriteNumber = 7; // Does this work?
    
    // integers and doubles
    int i = 2;
    double d = 2;
    
    // casting with integers
    int i = 42.7; 
    int i = (int) 42.7; 

    // casting with doubles
    double d = 2/3;
    double d = (double) 2/3;
```
______________________________

Methods
-------
Recall in lesson one:

```java
public final class CLASSNAME {
    public static void main(String[] args) {
        // STATEMENTS
    }
}
```
```java
    public static RETURN_TYPE METHOD_NAME(ARGUMENTS) {
        // STATEMENTS
    }
```

To call a method you just refer to it by its name! `METHOD_NAME();` will call a method named METHOD_NAME that requires no arguments.

> Lets go over to this weeks class application and create a method that squares a number we give it!

______________________________

What is Scope
-------------
Scope refers to the area in the code that can access the named variable. Variables are "contained" within the scope of a block which is represented by curly brackets `{}`. 

It is **IMPORTANT** that we remember that method parameters are like defining new variables that belong to that method. 

> Lets go over to this weeks class application experiment with scope.

______________________________

Methods Use Case
----------------

As you may have guessed, methods are used to functionally decompose large problems/large programs.

Methods can be developed in parallel, tested, and reused. (We will get to Test Driven Development soon!)

If you're using a method you don't need to know exactly how it works. You've been using `System.out.println()` and you don't know how it's implemented! 

> Lets go look at the `Math` library.

______________________________

Conditionals
------------
THE IF STATEMENT!!

```java
if (CONDITION) {
    STATEMENTS
}
```

```java
// what does this do?
public static void test(int x) {
    if (x % 2 == 0) {
        System.out.println(x + " is even!");
    }
}
```
Comparison Operators
--------------------
Using conditionals introduces more operators. Here comes `>`, `<`, `>=` `<=`, and `==`!

What is the difference between `==` and `=`?

Boolean Operators
-----------------
`&&` is a logical AND, meaning it will only be true if both sides of it are true.

* `true && true` returns ?
* `true && false` returns ?
* `false && true` returns ?
* `false && false` returns ?

`||` is a logical OR, meaning that it will return true if only one side of the expression is true.

* `true || true` returns ?
* `true || false` returns ?
* `false || true` returns ?
* `false || false` returns ?

Else
----
Okay, so we know how to do if statements, what if I only want to do something when the if statement doesn't evaluate to true.

```java
if (CONDITION) {
    // STATEMENTS
} else {
    // STATEMENTS
}
// -----------------
if (CONDITION) {
    // STATEMENTS
} else if (CONDITION) {
    // STATEMENTS
} else {

} //...
```

______________________________

Assignments
-----------

- Lab: Write a program that calculates an employees wages. The lab details can be found in `../../lab.md`