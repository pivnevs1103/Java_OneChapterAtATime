package InterfaceChallengeMySolution;

import java.util.Scanner;

public enum BuildingType {

    BUSINESS,
    ENTERTAINMENT,
    HOME,
    UNDEFINED;

    // Makes the user choose the type of a building it is and returns that enum type
    public BuildingType choosingTheType(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                PLEASE CHOOSE THE BUILDING TYPE:
                1. BUSINESS
                2. ENTERTAINMENT
                3. HOME
                """);

        int input = scanner.nextInt();

        // return switch that returns the enum type
        return switch (input){
            case 1 -> BUSINESS;
            case 2 -> ENTERTAINMENT;
            case 3 -> HOME;
            default -> UNDEFINED;
        };
    }
}
