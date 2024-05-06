package MethodOverloadingVSMethodOverriding;

public class Main {
    public static void main(String[] args) {

        /*
        Method Overloading----
            -means providing two or more sperate methods in a class, with the same name, but fifferent parameters
            -method return type may or may not be different, and that allows us to reuse the same method name
            - it reduces duplicated code, and we dont have to remember multiple method names
            - we can overload static or instance methods
            - usually happens within a single class, but can be overloaded by subclasses, thats because a subclass
            inherits one version of the method from the parent class, and then the subclass can have another overloaded
            version of that method

        Method Overriding----
            - means defining a method in a child class, that already exists in the parent class, with the same signature
            (the same nam, same arguments)
            - By extending the parent class, the child class gets all the methods defined in the parent class(those
            methods are also known as derived methods)
            - When we override a method put @Override
            - cant override a static method, only instance methods can be overridden
            - in overriding you cant have a lower access modifier. In other words, it cant have more restrictive access
            privileges.
            - constructors and private methods cannot be overridden
            - methods that are final cannot be overridden
            - a subclass can use 'super.methodName()' to call the superclass version of an overridden method
         */
    }
}
