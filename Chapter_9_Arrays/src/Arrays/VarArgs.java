package Arrays;

public class VarArgs {
    public static void main(String... args) {
        System.out.println("Hello World!");

        // Split method, which splits a String into a string array, by whatever delimited you tell it to use
        // In this case, we splitting the string by spaces
        String[] splitString = "Hello World again".split(" ");
        printText(splitString);
        printText2(splitString);

        System.out.println("-".repeat(20));
        // The line below wont process because its just a string and not an array
        // printText("Hello");
        printText2("Hello");

        System.out.println("-".repeat(20));
        printText2("Hello", "World", "again");

        System.out.println("-".repeat(20));
        printText2();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    // You can only pass an array of Strings
    private static void printText(String[] textList) {
        for (String t : textList) {
            System.out.println(t);
        }
        System.out.println();
    }
    // Has more functionality and we can pass more
    private static void printText2(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
