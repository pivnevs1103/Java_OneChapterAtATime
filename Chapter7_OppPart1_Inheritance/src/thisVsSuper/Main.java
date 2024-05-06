package thisVsSuper;

// THIS VS SUPER
public class Main {
    public static void main(String[] args) {

        /*
        KEYWORD: super vs this

        - SUPER: is used to access or call the parent member(variables and methods)
                (Commonly used with method overriding, when we call a method with the same name, from the parent class)
        - THIS: is used to call the current class members(variables and methods)
                'this.' is required when we have a parameter with the same name, as an instance variable or field
                (Commonly used in constructors and setters in classes)

        NOTE: we can use either of them anywhere in a class, except for a static elements, like a static method.
         */
        /*-------------------------------------------------------------------------------------------------
        ---------------------------------------------------------------------------------------------------
         */

        /* this() vs. super()

        - this(): to call a constructor, from another overloaded constructor in the same class
                can only be used in a constructor, and it must be the first statement in a constructor
                used with constructor chaining, in other words when one constructor calls another constructor,
                and it helps to reduce duplicate code.

        - super(): to call a parent constructor
                must be the first statement in each constructor

         */
    }
}
