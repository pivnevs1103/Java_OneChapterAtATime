import java.sql.SQLOutput;

/* This program has 2 methods that both take an int "day" in order to
determine which day of the week it is, for example day 0 = sunday and
day 1 = monday and so on... The first method uses an enhanced switch
and the second method uses an if else statement
 */
public class Challenge_enhancedSwitch {
    public static void main(String[] args){

        // Calling the first method that has the enhanced switch
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        System.out.println();


        // Calling the second method, this one uses if else
        printWeekDay(0);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);


    }
    public static void printDayOfWeek(int day){

        // Based on the variable day the day of the week will be
        // assigned to the new variable dayOfWeek
        String dayOfWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";

        // Because this switch statement is assigned to a variable
        // A semicolon must be placed all the way at the end
        };

        // Just a printout statement
        System.out.println(day + " = " + dayOfWeek);
    }
    public static void printWeekDay(int day){

        // Using an if else statement, this will assign the day of the
        // week to the variable weekDay
        String weekDay = "";
        if(day == 0){
            weekDay = "Sunday";
        }else if(day == 1){
            weekDay = "Monday";
        }
        else if(day == 2){
            weekDay = "Tuesday";
        }
        else if(day == 3){
            weekDay = "Wednesday";
        }
        else if(day == 4){
            weekDay = "Thursday";
        }else if(day == 5){
            weekDay = "Friday";
        }else if(day == 6){
            weekDay = "Saturday";
        }else
            weekDay = "Invalid Day";

        System.out.println(day + " = " + weekDay);
    }
}
