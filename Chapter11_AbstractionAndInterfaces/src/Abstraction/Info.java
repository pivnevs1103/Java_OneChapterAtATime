package Abstraction;

public class Info {

    /*
        We use the terms Abstraction and Generalization, when we start trying to model real world things in software

        Generalization:
        - When you start modeling objects for your application, you start by identifying what features and behavior
        your objects have in common
        - We generalize when we create a class hierarchy
        - A base class is the most general class, the most basic building block, which everything can be said to
        have in common

        Abstraction:
        - Part of generalizing is using abstraction
        - You can generalize a set of characteristics and behavior into abstract type
        - If you consider an octopus, a dog and a penguin, you would probably say they are all animals. An animal is
        really an abstract concept. An animal doesnt really exist, except as a way to describe a set of more specific
        things. If you cant draw it on a piece of paper its probably abstract
        - Abstraction simplifies the view of a set of items traits and behavior, so we can talk about them as a group,
        as well as generalize their functionality

        Java's support for Abstraction:
        - Java allows us to create a class hierarchy, where the top of the hierarchy, the base class, is usually an
        an abstract concept, whether its an abstract class or not
        - Java lets us create abstract classes
        - Java gives us a way to create interfaces

        Abstract Method:
        - An abstract method has a method signature, and a return type, but doesnt have a method body
            because of this we say an abstract method is unimplemented. Its purpose is to describe behavior, which any
            object of that type will always have
       - Conceptually, we can understand behaviors like move or eat on an Animal, so we might include those as abstract
       methods, on an abstract type
       - You can think of an abstract method as a contract. This contract promises that all subtypes will provide the
       promised functionality, with the agreed upon name and arguments

       Concrete method:
       - A concrete method has a method body, usually with at least one statement
       - This means it has operational code, that gets executed, under the right conditions
       - A concrete method is said to implement an abstract method, if it overrides one
       - Abstract classes and interfaces can have a mix of abstract and concrete methods

       METHOD MODIFIERS:
       1. abstract - when you declare a method abstract, a method body is always omitted. An abstract method can only
       be declared on an abstract class or an interface
       2. static - sometimes called a class method, rather than an instance method, because its called directly on the
       Class instance
       3. final - A method that is final cannot be overridden by subclasses
       4. default - This modifier is only applicable to an interface
       5. native - This is another method with no body, but its very different from the abstract method. The method
       body will be implemented in platform-dependent code, typically written in another programming language such as C.
       This is an advance topic
       6. synchronized - This modifier manages how multiple threads will access the code in this method.


        ------------Declaring an ABSTRACT class: ------------------------------
                o abstract class Animal{}

        - An abstract is a class thats incomplete
        - You CANT create an instance of an abstract class
                o EXAMPLE(INVALID): -> Animal cat = new Animal();

        - An abstract class can still have a constructor, which will be called by its subclasses, during their
        construction
        - An abstract class's purpose, is to define the behavior it's subclasses are required to have so its always
        participates in inheritance
        - Classes extend abstract classes, and can be concrete
                o Example: -> class Dog extends Animal{}

        - a class that extends an abstract class, can also be abstract itself, as it shown with this example
                o Example: -> abstract class Mammal extends Animal {}

        - Finally, an abstract class can extend a concrete class
                o Example: -> abstract class BestOfBreed extends Dog {}         (NOTE: Dog is a concrete class)

        ------------- Abstract Methods -------------------------------------------
         o abstract class Animal {

            //Declaring an abstract method
            public abstract void move();
            }

            NOTE: Abstract methods can only be declared on an abstract class or interface
            - In the examples above, an abstract method tells the outside world, that all Animals will move.
            - Any code that uses a subtype of Animal, knows it can call the move method, and the subtype will implement
            this method with this signature
            - This is also true for a concrete class, and a concrete method that's overridden

            WHY USE ABSTRACT AT ALL?
            - Abstract method forces for the child class to implement these methods with their own code
            - This is helpful in the cases that the child classes need their own independent implementation
            - Think of it as a much stricter parent and that it forces subclasses to implement everything it has
            (this counts for methods as well as constructors) Check the Dog and Animal class I implemented!!!
     */
}
