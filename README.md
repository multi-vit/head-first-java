# head-first-java
A place to document my learning from, and my attempts at the challenges from, the Head First Java book

## General Learning

### Naming Conventions

- Packages = lowercase - like a reversed URL (e.g. com.apple.quicktime)
- Class & Interface = PascalCase
- Method & Instance Variable  = camelCase - verb for method, noun for variable
- Constants = SCREAMING_SNAKE_CASE

## Chapter-Specific

### Chapter One - Breaking the Surface: Dive In: A Quick Dip
- Java is fast compared to most languages, but uses a lot of memory
- Any new version of Java is always fully backwards-compatible
- Java is a class-based, object-oriented language
- In Java, we write source code, which cannot be run directly. It must be passed through a source code compiler to produce **bytecode**
- We then use a Java Virtual Machine (JVM) to read and run the bytecode
- This makes Java platform independent - it can run on any machine that has a JVM
- Structure: In a source file, put a class. In a class, put methods (and instance variables). In a method, put statements.
- Everything begins with the public static void main (String[] args) {} method
- Every statement **MUST** end in a semicolon!

### Chapter Two - A Trip to Objectville: Class and Objects
- Object-Oriented Programming (OOP) lets you extend a program without having to touch previously tested, working code
- All Java code is defined in a **class**
- A class describes how to make an object of that class type. A class is like a blueprint
- An object can take care of itself, you don't have to know or care *how* the object does it
- An object **knows** things and **does** things
- Things an object knows about itself are called **instance variables**
- They represent the *state* of an object
- Things an object does are called **methods**. They represent the *behaviour* of an object
- When you create a class, you may also want to create a separate test class that you'll use to create objects of your new class type
- A class can **inherit** instance variables and methods from a more abstract **superclass**
- At runtime, a Java program is nothing more than objects "talking" to other objects
- We are not talking about encapsulation until Chapter Four
- We are using main to test drive code right now, that will also change in Chapter Three

### Chapter Three - Know Your Variables: Primitives and References
- Variables can store two types of things: **primitives** and **object references**
- Variables must have a type and a name

#### Primitives

- Primitive types have a bit-depth - meaning maximum size. You must ensure the value can fit into the variable, otherwise you will get *spillage*

| Type                         | Bit Depth      | Value Range               |
|------------------------------|----------------|---------------------------|
| **boolean and char**         |                |                           |
| Boolean                      | (JVM-Specific) | *true* or *false*         |
| Char                         | 16 bits        | 0 to 65535                |
| **numeric (all are signed)** |                |                           |
| **integer**                  |                |                           |
| byte                         | 8 bits         | -128 to 127               |
| short                        | 16 bits        | -32768 to 32767           |
| int                          | 32 bits        | -2147483648 to 2147483647 |
| long                         | 64 bits        | -huge to huge             |
| **floating point**           |                |                           |
| float                        | 32 bits        | varies                    |
| double                       | 64 bits        | varies                    |

- Some good rules for naming a class, method or variable (the official ones are less strict but these will keep you safe):
  - It must start with a letter, underscore (_) or dollar sign ($). You can't start a name with a number
  - After the first character, you can use numbers as well. Just don't start it with a number.
  - It can be anything you like, subject to those two rules, just so long as it isn't one of Java's reserved words
  - Reserved words include things like the primitive types (boolean, char etc.) and identifiers such as "public" or "static"
