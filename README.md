# head-first-java

A place to document my learning from, and my attempts at the challenges from, the Head First Java book

## General Learning

### Naming Conventions

- Packages = lowercase - like a reversed URL (e.g. com.apple.quicktime)
- Class & Interface = PascalCase
- Method & Instance Variable = camelCase - verb for method, noun for variable
- Constants = SCREAMING_SNAKE_CASE

## Chapter-Specific

### Chapter One - Breaking the Surface: Dive In: A Quick Dip

- Java is fast compared to most languages, but uses a lot of memory
- Any new version of Java is always fully backwards-compatible
- Java is a class-based, object-oriented language
- In Java, we write source code, which cannot be run directly. It must be passed through a source code compiler to
  produce **bytecode**
- We then use a Java Virtual Machine (JVM) to read and run the bytecode
- This makes Java platform independent - it can run on any machine that has a JVM
- Structure: In a source file, put a class. In a class, put methods (and instance variables). In a method, put
  statements.
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
- When you create a class, you may also want to create a separate test class that you'll use to create objects of your
  new class type
- A class can **inherit** instance variables and methods from a more abstract **superclass**
- At runtime, a Java program is nothing more than objects "talking" to other objects
- We are not talking about encapsulation until Chapter Four
- We are using main to test drive code right now, that will also change in Chapter Three

### Chapter Three - Know Your Variables: Primitives and References

- Variables can store two types of things: **primitives** and **object references**
- Variables must have a type and a name

#### Primitives

- Think of primitives like cups, they come in different shapes and sizes and are designed to hold different types (of
  liquid)
- Primitive types have a bit-depth - meaning maximum size. You must ensure the value can fit into the variable,
  otherwise you will get *spillage*

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

- The mnemonic I came up with to remember the 8 types of primitives are:
  > I Love Care Bears Because Fluffy Dinosaurs Suck
- With some number types, you have to specifically tell the compiler what you mean, or it might get confused between
  similar looking number types. You can use upper or lowercase:

```
long big = 3456789L;
float f = 32.5f;
```

- Some good rules for naming a class, method or variable (the official ones are less strict but these will keep you
  safe):
    - It must start with a letter, underscore (_) or dollar sign ($). You can't start a name with a number
    - After the first character, you can use numbers as well. Just don't start it with a number.
    - It can be anything you like, subject to those two rules, just so long as it isn't one of Java's reserved words
    - Reserved words include things like the primitive types (boolean, char etc.) and identifiers such as "public" or "
      static"

#### Objects

- Objects live in one place only - the garbage-collectible heap!
- There is no such things as an *object* variable (or spoon). There's only an object *reference* variable, which holds
  something like a pointer - a way to get to the object.
- Object reference variables are just like a remote control - you use it to get the object to do something (so it's a
  cup with a tv remote in!)
- Once a reference variable has been declared, it can only reference an object of the same type as it already refers
  to (so if your reference variables refers to a Dog, it can only refer to another Dog, not a Cat) - unless it's marked
  *final* then it cannot be reprogrammed to **anything** else
- If you assign a reference variable to another variable, both variables just point to the same object:
- Once an object no longer has any reference variables pointing to it, it is eligible for **Garbage Collection**, as it
  can never be accessed again
- Example:

```
// 2 book objects are created on the heap
Book b = new Book();
Book c = new Book();
// Either reference variable can reference another Book object as they are not marked final:
b = c;
// b and c now point to the same object on the heap
// The book object that b originally pointed to is eligible for garbage collection
```

#### Arrays

- Arrays are like a tray of cups!
- Arrays give you fast random access by letting you use an index position to get to any element in the array
- Every element inside an array is just a variable (primitive or reference)
- Arrays are always objects, whether they're declared to holst primitives or object references
- Once you've declared an array, you can't put anything in it except things that are of a comparable array type:
    - You can't put a Cat object into a Dog array
    - You can't put a `double` into an `int` array (spillage, remember?)
    - You **can** put a `byte` into an `int` array however, because a `byte` will always fit into an `int` size cup!
    - Don't worry, the compiler won't let you put the wrong thing in an array