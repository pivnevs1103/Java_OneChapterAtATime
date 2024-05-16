import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Var_Keyword {
    public static void main(String[] args) {

        /* INFO:
            - The var keyword in Java is used to declare local variables without explicitly specifying their type
            - The type of the variable is inferred by the compiler from the context in which the variable is initialized

            PURPOSE:
            - Reduce Boilerplate
            - Enhance Readability
            - Support for Anonymous Types

            RULES:
            - Initialization Required: You must initialize a var variable at the time of declaration
            because the compiler infers the type from the initial value.
            - Local Variables Only
            - No Null Assignment
            - No Array Initializers by Themselves
            - Cannot be Combined: The var cannot be combined with other type indicators (like [] for arrays)
            or generic type parameters.

            EXAMPLES BELOW:
         */

        // message is inferred to be of type String
        var message = "Hello, World!";
        System.out.println(message);

        // --------------------------------------------------------------------

        // list is inferred to be of type ArrayList<String>
        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");

        // map is inferred to be of type HashMap<String, Integer>
        var map = new HashMap<String, Integer>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        // --------------------------------------------------------------------

        var names = List.of("Anna", "Bob", "Charlie");
        // Using var in a for-each loop
        for (var name : names) {
            System.out.println(name);  // name is inferred to be of type String
        }


    }
}
