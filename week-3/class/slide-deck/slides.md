Loops and Arrays
================
June 4, 2021 - Language Sloth, Intro to Java Programming

Table of Contents
-----------------
- [Loops and Arrays](#loops-and-arrays)
  - [Table of Contents](#table-of-contents)
  - [Expectations](#expectations)
  - [Loops](#loops)
    - [While](#while)
    - [For](#for)
  - [Early Termination of a Loop/Branching](#early-termination-of-a-loopbranching)
    - [Break](#break)
    - [Continue](#continue)
  - [Arrays](#arrays)

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

Loops
-----
Loops allow to revisit a block of code. We can use `for` and `while` loops.

### While

```java
while (CONDITION) {
    // Statements
}
```

"While the condition evaluates to true, execute the statements"

What does this output? (Count carefully).
```java
int i = 0;

while (i < 3) {
    System.out.println("Statement number " + i);
    i = i + 1;
}
```
### For 

Let's do the above but with a for loop.

```java
for (INIT; CONDITION, UPDATE) {
    // Statements
}
```

```java
for (int i = 0; i < 3; i = i + 1) {
    System.out.println("Statement number " + i);
}
```

*NOTE: We will visit for each later*.

______________________________

Early Termination of a Loop/Branching
-------------------------------------

### Break

Break allows us to terminate a loop allowing for no more statements to be executed within that code block.

```java
// what does this output?
for (int i = 0; i < 100; i++) {
    if (i == 50) break;
    System.out.println(i);
}
```

### Continue

Continue just skips the current iteration of a loop and proceeds to the next iteration.

```java
// what does this output?
for (int i = 0; i < 100; i++) {
    if (i == 50) continue;
    System.out.println(i);
}
```
______________________________

Arrays
------

An array by definition is a list of indexed values.

An array can be composed of any type: `int`, `double`, `String`, etc...

EVERY element MUST be of the same type.

An array starts at index `0`. An array of length n's last index is `n-1`. 

If we try to execute the following:

```java
int[] arr = new int[5];

arr[5] = 12; // this throws an "array index out of bounds" exception.
```

As seen above, an array is declared by using the syntax `TYPE[]`. 

What is the type of `int[][]`?

You can initialize the size of an array with either a variable of type in:

```java
public static final int SIZE = 5;
int[] arr = new int[SIZE];
```

or by using just the value:

```java
int[] arr = new int[5];
```

The size of an array can also be implied when providing a set of initial values like so:

```java
int[] arr = {0, 1, 2, 3, 4};
```

This can ONLY be done when you declare the variable.

______________________________

Lets combine some loops and arrays (and objects [PREVIEW OF NEXT CLASS!])!
