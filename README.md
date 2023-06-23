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
- Things an object knows about itself are called **instance variables** - they represent the *state* of an object
- Things an object does are called **methods** - they represent the *behaviour* of an object
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

### Chapter Four - How Objects Behave: Methods Use Instance Variables

- A reminder that Classes define what an object knows (instance variables = state) and what an object does (methods =
  behaviour)
- State affects behaviour, behaviour affects state
- Methods can behave differently based on the value of the instance variables - so objects of the same type can behave
  differently
- A method takes a **parameter(s)**
- When calling methods, you are passing an **argument(s)** that becomes the parameter(s)
- A parameter becomes a local variable inside the method
- The number and type of values you pass in must match the order and type of the parameters declared by the method
- As well as values, you can pass variables into a method, as long as the variable type matches the parameter type (
  there are other things you can pass, but we're not there yet)
- Java is *pass-by-value*, which is another way of saying pass-by-copy - it will copy the value. So if you pass a
  variable in as an argument, the method works on the local variable that is copied, it doesn't affect the original
  variable that was passed in:
  ```
  int x = 7;
  void go(int z) {z = 0;}
  foo.go(x);
  // x and z are NOT connected
  // The value of x doesn't change!
  // The method can't change the bits that were in the calling variable x
  ```
- Methods can also *return* values - every method is declared with a return type, but until now we've made all of our
  methods with a **void** return type, which means they don't give anything back
- If you declare a method to return a value, you *must* return a value of the declared type! (or a value that is
  *compatible* with the declared type - more on that in Ch 7 and 8)
- Any place where a particular value can be used, a method call that returns that type can be used:
  ```
  // Instead of
  int x = 3 + 24;
  // You can say
  int x = 3 + one.getSize();
  ```
- Values passed in and out of methods can be implicitly promoted to a larger type or explicitly *cast* to a smaller
  type (more on this in chapter 5)

#### Getters and Setters

If you're being formal, you might prefer to call them *Accessors* and *Mutators*. But getters and setters fit a common
Java naming convention:

- A Getter's sole purpose in life is to send back, as a return value, the value of whatever instance variable it is
  named after
- Same principle for Setters, but its sole purpose is to set the value of said instance variable

```java
class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBranch() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
```

#### Encapsulation

- Until this very moment, we've been committing one of the worst OO faux pas - exposing our data!
- Exposed means reachable with the dot operator, as in: `myBackside.isExposed = true;`
- In the hands of a bad actor (no, not Elijah Wood), a reference variable (remote control) is quite a dangerous weapon.
  Because what's to prevent a flat cat?: `theCat.height = 0;`
- When we create setter methods, we can restrict the level of change allowed:

  ```
  public void setHeight(int ht) {
  // Guarantee height is at least 10
    if(ht > 9){
      height = ht;
    }
  }
  ```

- Use the `private` access modifier to hide data (you're familiar with `public` - we use it with every `main` method)
- Encapsulation *starter* rule of thumb (when you have more design and coding savvy in Java, you will probably do things
  a little differently:
    - Mark your instance variables **private** and provide **public** getters and setters for access control

#### Default Values

- **Instance variables** always get a default value. This is why you don't have to intialise a variable when declaring
  it:

  | Type            | Default Value |
                                                                                          |-----------------|---------------|
  | Integers        | 0             |
  | Floating points | 0.0           |
  | Booleans        | false         |
  | References      | null          |

- **Local variables** do NOT get a default value and MUST be initialised before use, otherwise the compiler will
  complain:

  ```java
  class Foo {
    public void go() {
      int x; 
      int z = x + 3; // Won't compile! 
      //You can declare x without a value but as soo as you try to USE it, the compiler freaks out
    }
  }
  ```

- **Method parameters** will never be unitialised (because they will either contain a value, an intialised variable or a
  variable with a default value)

#### Comparing Variables

- As you'd expect, the equality operator is `==`
- This is great for comparing primitives (it only compares the bits in two variables)
- The `==` operator ignores all the extra zeroes on the left side (so types don't necessarily matter):
  ```
  int a = 3;
  byte b = 3;
  if ( a==b ) { // true }
  ```
- Also use `==` to check if two reference variables refer to a single object:

  ```
  Foo a = new Foo();
  Foo b = new Foot();
  Foo c = a;
  if ( a == b ) {} // false
  if ( a == c ) {} // true
  if ( b == c ) {} // false
  ```  

- For objects, there is the `.equals()` method, but we will look at this in a later chapter (e.g. two different String
  objects that both contain the characters "Fred")

### Chapter Five - Extra-Strength Methods: Writing a Program

A good checklist for thinking about writing a Java class:

- [ ] Figure out what the class is supposed to *do*
- [ ] List the **instance variables** and **methods**
- [ ] Write **prep code** for the methods - pseudocode to help focus on logic without the worry of syntax
- [ ] Write **test code** for the methods - a class or methods that will test the real code and validate that it's doing
  the right thing
- [ ] **Implement** the class - the actual implementation, where we write real java code
- [ ] **Test** the methods
- [ ] **Debug** and **reimplement** as needed

This is basically TDD (Test-Driven Development)!

- Your java program should start with a high-level design
- Typically, you'll write three things when you create a new class:
    - **prep code**
    - **test code**
    - **real (Java) code**
- Prep code should describe *what* to do, not *how* to do it (Behaviour, not implementation)
- Use the prep code to help design the test code
- A class can have one superclass only
- Write test code *before* you implement the methods
- Choose *for* loops over *while* loops when you know how many times you want to repeat the loop code
- The *enhanced for loop* is an easy way to loop over an array or collection:
    - Syntax is: `for(<Type> <iterationVariableName> : <arrayName>){<Do stuff>}`. For example:
    - `for (String name : nameArray) {System.out.print("Hello" + name)}`
- Use the *increment* operator (++) to add 1 to a variable
- Use the *decrement* operator (--) to subtract 1 from a variable
- Use *break* to leave a loop early (e.g. even if the boolean test condition is still true)
- We *cast* the result of Math.random() to an `int` in this chapter and there are some rules:
    - You generally shouldn't try and cast a primitive that has a bigger bit count to a smaller one, as you can end up
      losing bits! e.g. `long`
      to `int`
        - If you absolutely have to though, you can tell it what to cast to using `(<typeToCastTo>) <variableName>` like
          this:
          ```
          long y = 42;      // so far so good
          int x = (int) y;  // x = 42 cool!
          ```
        - This tells the compiler to take the value of *y*, chop it down to int size and set *x* equal to whatever is
          left
        - If the value of *y* was bigger than the maximum value of *x*, then what's left will be a weird (but
          calculable) number:
          ```
          long y = 40002;       // 40002 exceeds the 16-bit limit of a short
          short x = (short) y;  // x now equals -25534!
          ```
        - The point is that the compiler still lets you do it!
    - If you have a floating-point number and you just want to get at the whole number (int) part of it:
      ```
      float f = 3.14f;
      int x = (int) f; // x will equal 3
      ```
    - And don’t even think about casting anything to a boolean or vice versa—just walk away!

### Chapter Six - Using the Java Library: Get to Know the Java API

- `ArrayList` is a class in the Java API
- To put something into an ArrayList, use `add()`
- To remove something from an ArrayList, use `remove()`
- To find out where something is (and if it is) in an ArrayList, use `indexOf()`
- To find out if an ArrayList is empty, use `isEmpty()`
- To get the size (number of elements) in an ArrayList, use the `size()` *method*
- To get the **length** (number of elements) in a regular old array, remember, you use the `length` *variable*
- An ArrayList **resizes dynamically** to whatever size is needed. It grows when objects are added, and it shrinks when
  objects are removed
- You declare the type of the array using a **type parameter**, which is a type name in angle brackets. Example:
    - `ArrayList<Button>` means the ArrayList will be able to hold only objects of type Button (or subclasses of Button
      as you'll learn in the next couple of chapters)
- Although an `ArrayList` holds objects and not primitives, the compiler will automatically "wrap" (and "unwrap" when
  you take it out) a primitive. (More on this feature later in the book)
- Classes are grouped into packages
- A class has a full name, which is a combination of the package name and the class name. Class `ArrayList` is
  really `java.util.ArrayList`
- To use a class in a package other than `java.lang`, you must tell Java the full name of the class
- You can either use an import statement at the top of your source code, or you can type the full name every place you
  use the class in your code

### Chapter Seven - Better Living in Objectville: Inheritance and Polymorphism

- A subclass *extends* a superclass
- A subclass inherits all *public* instance variables and methods of the superclass, but does not inherit the *private*
  instance variables and methods of the superclass
- Inherited methods can be overridden; instance variables cannot be overridden (although they can be *redefined* in the
  subclass, but that's not the same thing, and there's almost never a need to do it)
- Use the **IS-A** test to verify that your inheritance hierarchy is valid. If X extends Y, then *X IS-A Y* must make
  sense. e.g. Guitar extends Instrument is fine, because a *guitar is a(n) instrument*, but Oven extends Kitchen is not!
- The **IS-A** relationship works in only one direction. A Hippo is an Animal, but not all Animals are Hippos
- When a method is overridden in a subclass, and that method is invoked on an instance of the subclass, the overridden
  version of the method is called (*The lowest one wins*)
- If class B extends A, and C extends B, class B **IS-A** class A, class C **IS-A** class B, and class C also **IS-A**
  class A. e.g. Canine (B) extends Animal (A) and Wolf (C) extends Canine (B). So *Canine is an Animal*, *Wolf is a
  Canine* and *Wolf is an Animal*
- If you find yourself thinking **HAS-A** is a more appropriate way to describe the relationship between things, then
  thing on the right side should be an instance variable in the thing on the left. e.g. Tub and Bathroom *are* related,
  but not through inheritance, as neither one passes the **IS-A** test for the other. However a Bathroom **HAS-A** Tub,
  so should instantiate a Tub as a variable
- **DO** use inheritance when one class *is a* more specific type of a superclass. Example: Willow is a more specific
  type of Tree, so Willow *extends* Tree makes sense
- **DO** consider inheritance when you have behaviour that should be shared among multiple classes of the same general
  type. Example: Square, Circle and Triangle all need to rotate and play sound, so putting that functionality in a
  superclass Shape might make sense for easier maintenance and extensibility
- **DO NOT** use inheritance just so that you can reuse code from another class, if the relationship between the
  superclass and subclass violate either of the above two rules. For example, imagine you wrote special printing code in
  the Animal class, and now you need printing code in the Potato class. You might think about making Potato extend
  Animal
  so that Potato inherits the printing code, which makes no sense - a Potato is *not* an Animal! (So the printing code
  should be in a Printer class that all printable objects can take advantage of via a **HAS-A** relationship)