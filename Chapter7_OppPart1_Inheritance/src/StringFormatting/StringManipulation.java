package StringFormatting;

/*
        -There is two sections to this, the first dont actually change the underlying meaning of the text value, but
        perform some kind of clean up

        - The second set of String manipulation methods, transform the String Value, and return a String with
        a different meaning than the original String
 */
public class StringManipulation {

    public static void main(String[] args) {

        String birthdate = "25/11/1982";
        // I grab the index of where the year starts
        int startingIndex = birthdate.indexOf("1982");
        System.out.println("StartingIndex = " + startingIndex);
        // Using the variable that stored the index of the year and the method of substring, i was able to print out
        // the exact year this person was born
        System.out.println("Birth year = " + birthdate.substring(startingIndex));

        // Grabbing the day of the birthday
        int month = birthdate.indexOf("11");
        System.out.println("The month of the birthday is = " + birthdate.substring(month, startingIndex - 1));

        // Created a new date and will output this "25/11/1982"
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        // Does the same thing as above but takes longer and makes it "25/11/1982"
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        //Another way to do thats above
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);


        // Replace the '/' character with the '-', so now it will be 25-11-1982
        System.out.println(newDate.replace("/", "-"));

        // replace method but now instead or replacing a character for a character, we are replacing a char for a
        // string
        System.out.println(newDate.replace("2", "00"));

        // Same thing as above but only does it to the first char it finds
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));


        // It repeats what you want it to repeat and the number is how many times you want it do it
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        // Does the same thing but for ABC it indents every line by 8 spaces
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        // This time we indent by -2 which means it moves the abc line 2 spaces back
        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
