package Autoboxing_And_Unboxing;

public class Info {
    /*
        - Primitive types generally represent the way data is stored on an operating system
        - Primitives have some advantages over objects, especially as the magnitude or number of element increase
        - Object take up additional memory and may require a bit more processing power
        - You can create objects, with primitive data types as field types, for example, and you can also return
        primitive types from methods.

        ISSUE: -------------------------------------------------------------------------------------------
        - classes like ArrayList or the Linked List, which I have reviewed in a lot of detail in this section, these
        classes dont support primitive data types, as the collection type.

        EXAMPLE: LinkedList<int> myIntegers = new LinkedList<>();           (CANT DO THIS)

        SOLUTION:-----------------------------------------------------------------------------------------
        - But Java, gives us wrapper classes for each primitive type
        - And I can go from a primitive to a wrapper, which is called boxing, or a wrapper to a primitive, which
        is called unboxing with relative ease in JAVA

        WHAT IS "BOXING"? ---------------------------------------------------------------------------
        - A primitive is boxed, or wrapped in a containing class, whose main data is the primitive value
        - Each primitive data type has a wrapper class, as shown on the list, which we've seen before
        - Each wrapper type boxes has a specific primitive value

        HOW TO "BOX"?
        - Each wrapper has a static overloaded factory method, valueOf(), which takes a primitive and returns an
        an instance of the wrapper class

        // This code returns an instance of the java.lang.Integer class, to the boxedInt variable, with value = 15
        // This code manually boxes a primitive integer
        EXAMPLE: Integer boxedInt = Integer.valueOf(15);

        // Old way of doing it(outdated and shouldnt use it)
        EXAMPLE: Integer boxedInt = new Integer(15);


        WHAT IS "AUTOBOXING"? -----------------------------------------------------------------------------------

        EXAMPLE: Integer boxedInt = 15;

        - Java allows this code, and its actually preferred to manually boxing
        - Underneath the covers, Java is doing the boxing. In other words, an instance of Integer is created, and its
        value is set to 15
        - Allowing Java to autobox, is preferred to any other method, because Java will provide the best mechanism to
        do it

        HOW to get the value back?------------------------------------------------------------------

        // Manually unboxing
        EXAMPLE: int unboxedInt = boxedInt.intValue();

        - Every wrapper class supports a method to return the primitive value it contains
        - this is called unboxing

        Automatically Unboxing----------------
        - EXAMPLE: int unboxedInt = boxedInt;
     */
}
