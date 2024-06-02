package InterfaceChallengeMySolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      printMainInfo();
    }

    // Main menu that asks the user to choose what type thier item is
    public static void printMainInfo(){
        System.out.println("""
                Please choose what kind of Type it is:
                1. Building
                2. Utility
                
                This will determine the rest of the information and will print out all the info
                Please enter your choice:""");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        userInput(input);
    }

    // Once the type has been chosen, it gets passed to this class, where it asks the user to input the name and then
    // creates an instance of that type and prints out all the information
    public static void userInput(int choice){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while(flag) {
            System.out.print("Please enter the name of the place: ");

            String input = scanner.nextLine();

            // Once the user types in stop the program exists
            if(input.equalsIgnoreCase("stop")){
                flag = false;
            }
            // Creating an reference variable
            Mappable mappable;

            // Switch, which create the object based on the input from the user
            switch (choice) {
                case 1 -> {mappable = new Building(input);
                    printInfo(mappable);}
                case 2 -> {mappable = new UtilityLine(input);
                    printInfo(mappable);}
                default -> System.out.println("You can only choose between 1 and 2");
            }
            System.out.println();
            System.out.println("-".repeat(100));
            printMainInfo();
        }
    }

    // Method that uses interface reference variable to print out the string with all the information
    public static void printInfo(Mappable mappable){
        System.out.println();
        Mappable.mapIt(mappable);
    }
}
