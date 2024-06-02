package Interfaces;

public class Info {

    /*
         INTERFACE: -------------------------------------------------------------------------
         - is similar to an abstract class, although it isnt a class at all
         -It is a special type, thats more like a contract between the class and client code, that the compiler enforces
         - By declaring the class using the interface, the class must implement all the abstract methods, on the
         interface
         - A class agree to this, because it wants to be known by that type, by the outside world, or the client code.
         - An interface lets classes that might have a little less in  common, be recognized as a special reference type

         DECLARING INTERFACE:-------------------------------------------------------------------------

         o Example: public interface FlightEnabled{}

         - An interface is usually named, according to the set of behaviours it describes
         - Many interfaces will end in 'able', like Comparable, and Iterable, again meaning something is capable, or
         can do, a given set of behaviors

         USING AN INTERFACE:-------------------------------------------------------------------------

         o Example: public class Bird implements FlightEnabled{}

         - because of this declaration, now you can use FlightEnabled as the reference type, and assign it an instance
         of bird
         - In this code sample, I am creating a new Bird object, but assigning it to the FlightEnabled variable
         named flier
            o EXAMPLE: FlightEnabled flier = new Bird();

            NOTE: - A class can only extend a single class, which is why Java is called single inheritance
                  - But a class can implement many interfaces. This gives it the plug and play functionality, which is
                  what makes them so powerful.
                  - A class can both extend another class and implement one or more interfaces
                        CHECK BIRD CLASS!!!

          THE ABSTRACT MODIFIER IS IMPLIED ON AN INTERFACE: -----------------------------------------------------------
           - We dont have to declare the interface type abstract, because this modifier is implicitly declared, for all
           interfaces.

           o EXAMPLE: abstract interface FlightEnabled{}
                   - Abstract modifier here is unnecessary and redundant, because the modifier abstract is implicitly
                     declared for interfaces

           - Likewise, you dont have to declare any method abstract
           - In fact, any method declared without a body, is really implicitly declared both public and abstract
                        - Check 'Animal' Class for more info

           ALL MEMBERS ON AN INTERFACE ARE IMPLICITLY PUBLIC: ---------------------------------------------------------
           - If you omit an access modifier on a class member, its implicitly package private
           - If you omit an access modifier on an interface member, its implicitly public

           !!! Changing the access modifier of a method to protected, on an interface, is a compiler error, whether
           the method is concrete or abstract
           - Only a concrete method can have private access


           REMEMBER:-------------------------------------------------------
           - Interface never gets instantiated and wont have a subclass that gets instantiated either.
           - There is no such a thing as instance field on an interface, because of this
           - In these examples, the bird is an instance of a class, that implements FlightEnabled's methods
           - Bird doesnt inherit traits from FlightEnabled it just agrees to behave a certain way

           EXTENDING INTERFACES:-----------------------------------------------------------------------
           - Interfaces can be extended, similar to classes, using the extends keyword
           - Below, I declared an interface 'OrbitEarth' that extends the FlightEnabled interface
           - This interface requires all classes to implement both the OrbitEarth and the FlightEnabled abstract
           methods

           o EXAMPLE: interface OrbitEarth extends FlightEnabled {}

           - Unlike  a class, an interface can use the extends expression with multiple interfaces:

           o EXAMPLE: interface OrbitEarth extends FlightEnabled, Trackable {}

           NOTE: Its 'extends' NOT 'implements', an interface doesnt implement another interface!!!


           ABSTRACT TYPES - CODING TO AN INTERFACE:-----------------------------------------------------------------
           - Both interfaces and abstract classes are abstracted reference types
           - Reference type can be used in code as variables types, method parameters and return types, list types and
           so on
           - When you use an abstracted reference type, this is referred to as coding to an interface
           - This means your code doesnt use specific types, but more generalized ones, usually an interface type
           - This technique is PREFERRED, because it allows many runtime instances of various classes, to be processed
           uniformly by the same code
           - It also allows for substitutions of some other class or object that still implements the same interface,
           without forcing a major refactor of your code
           - Using interfaces types as the reference types, is considered a best practice

           CODING TO AN INTERFACE:--------------------------------------------------------------------------------
           - coding to an interfaces scales well, to support new subtypes, and it helps when refactoring code
           - The Downside though, is that alterations to the interface may wreak havoc, on the client code
           - Imagine that you have 50 classes using your interface, and you want to add an extra abstract method, to
           support new functionality. As soon as you add a new abstract method, all 50 classes wont compile
           - Your code isnt backwards compatible, with this kind of a change to an interface
     */
}
