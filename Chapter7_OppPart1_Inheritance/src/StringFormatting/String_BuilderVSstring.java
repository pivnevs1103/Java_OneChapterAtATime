package StringFormatting;
import java.lang.StringBuilder;


/*
    There are four ways to create a new StringBuilder object, using the new keyword:
        - Pass a String
        - Pass no arguments at all
        - PAss an integer value
        - Pass some other type of character sequence(like StringBuilder)

        Stringbuilder text value is mutable(means you can shrink or grow in size)
        By default it starts with a capacity of 16
 */

public class String_BuilderVSstring {

    public static void main(String[] args) {


        String helloWorld = "Hello" + " World";
        // This is wrong because it created a new object in the memory that has them both together, but because
        // we didnt assign it to a variable it still only references the first part and will only print
        // "Hello world". MAKE SURE TO ASSIGN THE RESULTS OF ANY STRING MANIPULATION METHOD WE CALL
        helloWorld.concat(" and GoodBye");

        // String builder fixes the issues above. Instead of creating a new object, it edits the original one
        // You dont need to assign the results with any manipulation
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and GoodBye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        // Creating new instances
        // Initial capacity is 16 characters
        StringBuilder emptyStart = new StringBuilder();
        // This alone has to make capacity 34 spaces now even tho we are only using 17
        emptyStart.append("a".repeat(17));

        // We made the capacity 32 spaces but NOTE, everytime it needs to increase capacity, the data stores in the
        // original storage, needs to get copied over to a larger storage area
        StringBuilder emptyStart32 = new StringBuilder(32);
        // the capacity remains the same
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);


        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and GoodBye");

        // Deleted the capital G and replacing it with the smaller g
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        // Replacing the lower case g to a capital one but note how you need a starting and an ending index to do so
        builderPlus.replace(16,17, "G");
        System.out.println(builderPlus);

        // Reverses every character in that String and shrink sit to size 7
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){

        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
