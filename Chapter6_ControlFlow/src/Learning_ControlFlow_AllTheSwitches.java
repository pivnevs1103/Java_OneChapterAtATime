/* In this section I will be learning about the switch statement
as well as how to implement them and reuse them so that I do not
repeat my code.
 */

import java.sql.SQLOutput;

public class Learning_ControlFlow_AllTheSwitches {
    public static void main(String[] args){

        // Calling the switch method
        switchStatement(3);
        switchStatement(5);
        switchStatement(7);
        switchStatement(4);
        System.out.println();

        // Calling the enhanced switch method
        enhancedSwitchMethod(3);
        enhancedSwitchMethod(5);
        enhancedSwitchMethod(9);
        enhancedSwitchMethod(1);
        enhancedSwitchMethod(2);
        System.out.println();

        // Calling the last method to calculate the quarter
        getQuarterEnhancedSwitch("January");
        getQuarterEnhancedSwitch("September");
        getQuarterEnhancedSwitch("May");
        getQuarterEnhancedSwitch("December");
        getQuarterEnhancedSwitch("Hello");

    }

    // This method is used to learn about the switch statement
    public static void switchStatement(int switchValue){

        // Works like an if else statement where it picks a case based on the
        // value in the parameters. So value 1 will print case 1 and value 2
        // will print case 2 and so on...
        switch(switchValue){

            case 1:
                System.out.println("Your input is " + switchValue);
                // Once it matches the case and does the code block statement,
                // my program uses 'break' to exit the switch statement
                // Note: The break statement is optional and not required!
                break;
            case 2:
                System.out.println("Your input is " + switchValue);
                break;
            case 3:
                System.out.println("Your input is " + switchValue);
                break;
                // Using case without break statement, the program will execute
                // everything until a break statement
            case 4: case 5: case 6:
                System.out.println("Your input was either 4, 5 or 6");
                break;
            // This is used if the value does not match any cases
            // Note:  default is optional and not required!
            default:
                System.out.println("Your input is not within the range of 1-6");
                break;
        }
    }

    // This is a newer version of the switch statement, its the same code just a lot
    // easier to write and more compact
    public static void enhancedSwitchMethod(int switchValue) {

        // As can be seen this code takes a lot less space and does the
        // exact same thing
        switch (switchValue) {

            case 1 -> System.out.println("Your input is " + switchValue);
            case 2 -> System.out.println("Your input is " + switchValue);
            case 3, 4, 5 -> {
                System.out.println("Your input was either 4, 5 or 6");
            }
            default -> System.out.println("Your input is not within the range of 1-6");
        }
    }


        // Another version of the enhancedSwitchStatement
        // This code will determine what quarter of the year it is,
        // based on the month that was entered
    public static void getQuarterEnhancedSwitch(String month){

        switch(month){

            case "January", "February", "March" -> System.out.println(month +
                    " is in the first quarter");
            case "April", "May", "June" -> System.out.println(month +
                    " is in the second quarter");
            case "July", "August", "September" -> System.out.println(month +
                    " is in the third quarter");
            case "October", "November", "December" -> System.out.println(month +
                    " is in the fourth quarter");
            default -> System.out.println("The input is wrong, try again");

            // NOTE: You can also make this much smaller by making this a return
            // enhanced switch statement, this would mean that you don't have to write
            // System.... for every case
        }

    }
}
