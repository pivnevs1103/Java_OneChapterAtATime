package PolymorphismChallenge;

import java.util.Scanner;

public class NewCar {

    private String description;

    public NewCar(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Your Engine is starting");
        System.out.println("""
            Please select below if you would like to drive or just have your engine:
            Type 1 (to drive)
            Type 2 (to just have the engine ideling)
            Type 3 (to quit)
            """);
        Scanner scanner = new Scanner(System.in);
        int input;
        while(true) {
            if (scanner.hasNextInt()){
                input = scanner.nextInt();
                if(input == 1){
                    drive();
                    break;
                }else if(input == 2){
                    runEngine();
                    break;
                } else if (input == 3) {
                    System.out.println("Doing nothing");
                    break;
                }else
                    System.out.println("Invalid choice please either enter 1, 2, 3");
                }
            else
                scanner.hasNext();
        }
    }

    public void drive(){
        System.out.println("You are driving");
    }

    protected void runEngine(){
        System.out.println("You are just parked and your engine is running");
    }
}
