package StringFormatting;

/*
We can split String's methods up into three basic categories
- String inspection Methods
- Methods for Comparing String values
- String Manipulation method
 */

public class TheString {
    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        // Tells you the position of the char r
        System.out.printf("index of r = %d%n", helloWorld.indexOf('r'));
        // Tells you where the word begins which in this case is position 6
        System.out.printf("index of world = %d%n", helloWorld.indexOf("World"));
        // Tells you the position of the first l it finds
        System.out.printf("index of l = %d%n", helloWorld.indexOf('l'));
        // To find another l you just pass another parameter which tells java where to start searching
        // it searches from left to right
        System.out.printf("index of l = %d%n", helloWorld.indexOf('l', 3));
        // Tells you the position of the last l it finds
        System.out.printf("index of l = %d%n", helloWorld.lastIndexOf('l'));
        // To find another L same as above just add another parameter and tell java from where to start searching
        // It should match the above statement at position 3 because it searches from right to left(so opposite of above)
        System.out.printf("index of l = %d%n", helloWorld.lastIndexOf('l', 8));

    }

    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d%n", length);

        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c%n", string.charAt(0));
        System.out.printf("Last char = %c%n", string.charAt(length - 1));
    }
}
