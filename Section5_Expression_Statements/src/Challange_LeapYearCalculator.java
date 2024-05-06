
// This code calculates if the input year is a leap year or not
// and just returns true of false. The challenge it self will be
// posted in the note section of this code
public class Challange_LeapYearCalculator {
    public static void main(String[] args){

        // Calling our method with different values
        isLeapYear(-1000);
        isLeapYear(0);
        isLeapYear(1800);
        isLeapYear(1855);
        isLeapYear(1900);
        isLeapYear(1924);
        isLeapYear(2000);
        isLeapYear(2014);
        isLeapYear(2016);
        isLeapYear(2150);


    }
    public static boolean isLeapYear(int year){

        // Using a nested if statements to determine whether its a leap
        // year or not
        if(year >= 1 && year <= 9999){

            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }

        // This gets returned if the imput value into the method is or less then 0
        else
            return false;
    }
}
