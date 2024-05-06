/* This program will determine and return how many days are there
in a month, it will also take into account if it's a leap year or not
and make the changes accordingly
 */

public class NumberOfDaysInMonth {
    public static void main(String[] args){

        // Just calling my second method and testing for all possibilities
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(7, 1990));
        System.out.println(getDaysInMonth(-5, 1555));
        System.out.println(getDaysInMonth(8, -2024));
        System.out.println(getDaysInMonth(1, 1999));
        System.out.println(getDaysInMonth(12, 1856));
        System.out.println(getDaysInMonth(9, 2016));
        System.out.println(getDaysInMonth(999999, 999999));
        System.out.println(getDaysInMonth(-999999, 999999));

    }

    // This method is used in the second month to determine whether it is
    // a leap year or not
    public static boolean isLeapYear(int year){

        //If it's a leap year it will return true, if its not then returns false
        if(year < 1 || year > 9999){
            return false;
        }else {
            if(year % 4 == 0 && year % 100 != 0){
                return true;
            }else if(year % 400 == 0){
                return true;
            }else return false;
        }
    }

    // This method first tests and makes sure that the month variable can only intake
    // numbers 1-12 and the year variable year can only intake 1-9999. then it using
    // and enhanced switch it returns the number of days there is in a month that was
    // selected, it also takes into account if it is a leap year or not
    public static int getDaysInMonth(int month, int year){

        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
            // This call the leap year method to see if its a leap year or not
        }else if(isLeapYear(year) && month == 2){
            return 29;
        }
        else
            return switch(month){
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
        };
    }
}
