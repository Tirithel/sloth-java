Types, Variables, and Operators
========================================================
May 21, 2021 - Language Sloth, Intro to Java Programming

Table of Contents
-----------------
- [Types, Variables, and Operators](#types-variables-and-operators)
  - [Table of Contents](#table-of-contents)
  - [Expectations](#expectations)
  - [Lesson Goal](#lesson-goal)
  - [Computation Overview](#computation-overview)
  - [Programming Languages](#programming-languages)
  - [Java](#java)
  - [Types](#types)
  - [Variables](#variables)
  - [Operators](#operators)
  - [Assignments](#assignments)

______________________________

Expectations
------------
- Assignments are designed to reinforce what we learned in class. If you don't feel the need to do them, you don't have to. This class is designed to give you back what you put into it. 

- Dont hesitate to reach out with questions, [well formatted](https://www.freecodecamp.org/news/how-to-ask-good-questions-as-a-developer-9f71ff809b63/
) questions will be answered to the best of my ability. It is my request that before asking questions outside of class hours, an effort was put in to understanding the problem.

- Test driven development is practiced when it makes sense.

- Mics will be muted when not asking or answering questions. If there are lots of questions, I may ask that you wait until the end of the class to have them answered.

- Projects can be submitted in any language. I can help the most with Java and Python, however I can give guidance on anything but syntax for most languages.

______________________________

Lesson Goal
-----------
The goal for lesson one is to understand types, variables and operators. This will allow us to begin to develop something useful.

______________________________

Computation Overview
--------------------

The CPU is the electronic circuit responsible for executing the instructions of a computer program. What we need to understand for this class is that the CPU takes input, executes instructions, and gives us an output. 

The other key component of this diagram is the Memory Unit, or RAM. Ram differs from your hard drive in that it is available to your CPU for quick read and writes.

![CPU](https://www.computerscience.gcse.guru/wp-content/uploads/2016/04/Von-Neumann-Architecture-Diagram.jpg)

[Image Source](https://www.computerscience.gcse.guru/theory/von-neumann-architecture)

A CPU instruction for `z = x + y` may look like:
```assembly
segment .bss
    res     resb 1

section .text
    global  _start

_start:
    ; loading the accumulator
    mov     eax, 100
    mov     ebx, 5
    ; adding them
    add     eax, ebx

    ; storing the result in memory
    mov     [res], eax
``` 

______________________________

Programming Languages
---------------------

Programming languages simplify that. For humans it's so much easier to understand than CPU instructions.

Programming languages still need to be translated for the CPU to understand the instructions.
- Interpreted languages aren't translated for the machine they are on, they are actually translated for another program to read them. (Think JVM)
- Compiled languages are translated directly for the machine they are compiled for. All computers cant read all of the same instructions. 

______________________________

Java
----
Where does Java fit in?
- Java is one of (if not the) most popular language.
- It runs through a virtual machine, the JVM
- It has some added complexities compared to Python
- It is simpler than C/C++
  
When we write our programs in `.java` files, we are going to use a command called `javac` to compile them into ***Byte Code***. ***Byte Code*** is stored in a `.class` file. In order to run the program we wrote, the JVM (Java Virtual Machine) interpriates the `.class` file and allows our program to execute.

After you clone this git project, you will be able to access our application.

Our first application looks like this:

```java
package org.sloth;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

The pieces that we care most about right now are the `class name`, and `statements` as these are the most fundimental parts of the program structure.

```java
public final class CLASSNAME {
    public static void main(String[] args) {
        // STATEMENTS
    }
}
```

In order to get our program to do anything we are using `System.out.println(String s);`.
______________________________

Types
-----
Types are kinds of values that can be stored and manipulated.

Examples:

- `boolean`: stores truth (*true*, *false*)
- `int`: stores *Integer* values (-6, 0, 88777)
- `double`: stores *Real numbers* (3.1415, 1.0, -8.84)
- `String`: stores *text* ("hello world", "this class sucks")

______________________________

Variables
---------
A variable is a named location that stores a value of one specific type. A variable needs a type and a name in Java.

```Java
TYPE    NAME;
String  hello;
```

You can assign values to a variable in two different ways
```java
// declaration and assignment
TYPE    NAME    = VALUE;
String  hello   = "hello";
```
or
```java
// declaration
TYPE    NAME;
String  hello;

// and assignment
VARIABLE    = VALUE;
hello       = "hello";
```
______________________________

Operators
---------
An operator is a symbol that performs an action some of the operators in Java are: `=`, `+`, `-`, `*`, `/`, and `%`.

These operators execute in the order of standard math rules. PEDMAS.

______________________________

Assignments
-----------

- Homework: Answer the questions found in `../../homework.md`.
- Lab: Write a program that performs a mathematical operation and then ouputs the results. The lab details can be found in `../../lab.md`