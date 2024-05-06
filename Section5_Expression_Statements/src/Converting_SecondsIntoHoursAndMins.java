// Using overloaded methods I will be converting second and minutes into
// the format  'XXh YYm ZZs'

public class Converting_SecondsIntoHoursAndMins {
    public static void main(String[] args){

        // Calling the methods
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(500,120));

    }

    // This method only takes in one parameter
    public static String getDurationString(int seconds){

        // Used as a safety net in case a User inputs a number
        // that's lower than 0
        if(seconds < 0){
            return "Invalid input, the number must be positive";
        }
        else
            // Calling the second method while also
           return getDurationString(seconds / 60, seconds % 60);

    }

    // This method does all the calculations
    public static String getDurationString(int minutes, int seconds){

       // Used as a safety net in case a user inputs and impossible value
        if(minutes < 0 || seconds < 0){
            return "Invalid input, the number must be positive";
        }
        else
            return minutes/60 + "h " + minutes % 60 + "m " + getDurationString(seconds) + "s";
    }
}
