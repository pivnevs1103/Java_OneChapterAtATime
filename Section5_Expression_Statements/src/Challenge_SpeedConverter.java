
// This is just a section of the whole program. The actual challenge
// for this will be posted in the comment section
public class Challenge_SpeedConverter{

    // This method first checks if the number is negative, if it is
    // it returns as -1, if not then it does the calculation and returns
    // the conversion
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return -1;
        else
            kilometersPerHour /= 1.609;
        return Math.round(kilometersPerHour);
    }

    //This method is just used as a big printout statement
    public static void printConversion(double kilometersPerHour){

        if(toMilesPerHour(kilometersPerHour) < 0)
            System.out.print("Invalid Value");

        else

            System.out.print(kilometersPerHour + " km/h = "
                    + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
