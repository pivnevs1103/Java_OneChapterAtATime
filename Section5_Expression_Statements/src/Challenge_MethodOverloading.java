// The purpose of this challenge is to test method overloading by converting feet and inches
// into centimeters

public class Challenge_MethodOverloading{
    public static void main(String[] args) {

        // Calling out methods
        System.out.println("6ft, 6in = " + convertToCentimeters(6,0)+ " cm");
        System.out.println("68in = " + convertToCentimeters(68 ) + " cm");

    }
    // This method is used to convert inches into centimeters and returns the value as a double
    public static double convertToCentimeters(int inches){

        // I didn't have to declare a new variable and could've just did the calculation in the
        // return statement but I wanted to so that in the future it's easier to read and tell
        double centimeters = 2.54;
        return inches * centimeters;
    }

    // This method has the same name as the previous method, so this is method overloading,
    // Java doesn't see this issue because our signature for this method is different(as it has
    // two parameters).
    public static double convertToCentimeters(int feet, int inches){

        //converting feet into inches and yes I coudl've  done this in the return statement
        inches += (feet * 12);

        //calling and returning the first method to calculate how much it is in centimeters
        return convertToCentimeters(inches);
    }
}
