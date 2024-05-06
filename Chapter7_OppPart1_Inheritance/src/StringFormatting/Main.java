package StringFormatting;
/*
    Common Escape Sequences:
    \t - tab
    \n - go to the next line
    \" - insert a double quote character
    \\ - inset a backslash character
 */
public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List: " +
                "\t\n\u2022 First Point" +
                "\t\n\u2022 Sub Point";

        System.out.println(bulletIt);

        // Called a text block for creating a multiline formatting String
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                    \u2022 Sub Point """;

        System.out.println(textBlock);


        /*
            FORMATTER: you can search up the class to see the libray

            d = formats a decimal integer(short, int, long)
            f = formats a decimal point number (double, or a float)
            etc....
         */

        // Using printf = print > '%d' will be replaced with the variable age
        int age = 35;
        System.out.printf("Your age is %d\n", age);

        // it will replace %d in order of how we put it
        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d\n", age, yearOfBirth);

        // Replacing \n with %n as well as replacing %d with %f... have to cast it to a float other wise it throws
        // an error
        System.out.printf("Your age is %f%n", (float)age);

        // added .2 after % to determine how many 0s i want after the whole number.(Precision)
        System.out.printf("Your age is %.2f%n", (float)age);

        for(int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %d %n", i);
        }
        System.out.println();

        // By adding 6 after % we specify how to organize our data. Number will be on the right because I want
        // each number to be 6 spaces
        for(int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d ".formatted(age);
        System.out.println(formattedString);
    }
}
