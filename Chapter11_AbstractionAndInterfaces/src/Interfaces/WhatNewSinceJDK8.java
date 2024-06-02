package Interfaces;

public class WhatNewSinceJDK8 {
    /*
        WHAT'S HAPPENED TO THE INTERFACE SINCE JDK 8: ---------------------------------------------------------------
        - Before JDK 8, the interface type could only have public abstract methods
        - JDK 8 introduced the default method and public static methods, and JDK 9 introduced private methods, both
        static and non-static
        - All of these new method types(on the interface) are concrete methods

        THE INTERFACE EXTENSION METHOD - THE DEFAULT METHOD(AS OF JDK 8) --------------------------------------------
        - An extension method is identified by the modifier 'default', so its more commonly known as the default method
        - This method is a concrete method, meaning it has a code block, and we can add statements to it
        - In fact, it has to have a method body, even just an empty set of curly braces.
        - Its a lot like a method on a superclass, because we can override it
        - Adding a default method doesnt break any classes currently implementing the interface

        OVERRIDING A DEFAULT METHOD:----------------------------------------------------------------

        So like overriding a method on a class, you have three choices, when you override default method on an interface
        1. You can choose not to override it at all
        2. You can override the method and write code for it, so that the interface method isnt executed
        3. Or you can write your own code and invoke the method on the interface, as part of your implementation

        PUBLIC STATIC METHODS ON AN INTERFACE(AS OF JDK 8)---------------------------------------------------------
        - static methods dont need to specify a public access modifier, because its implied
        - When you call a public static method on an interface, you must use the interface name as a qualifier
        - In the ArrayList, you may remember i used two static helper methods, on the Comprarator interface,
        which were added in JDK 8(These were 'Comparator.naturalOrder()' and 'Comparator.reverseOrder()')

        PRIVATE METHODS (JDK 9):------------------------------------------------------------------------------------
        - JDK 9 gave us private methods, both static and non static
        - This enhancement primarily addresses the problem of re-use of code, within concrete methods on an interface
        - A PRIVATE STATIC method can be accessed by either a public static method, a default method, or a private
        non-static method
        - A PRIVATE NON-STATIC method is used to support default methods, and other private methods

        NOTE: You can only use a private method, from either another private method or a default method
     */
}
