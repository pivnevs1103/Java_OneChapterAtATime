package InterfaceChallengeMySolution;

import java.util.Scanner;

public enum UtilityType {
    ELECTRICAL,
    FIBER_OPTIC,
    UNDEFINED;

    // Makes the user choose the type of a Utility Type it is and returns that enum type
    public UtilityType choosingTheType(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                PLEASE CHOOSE THE Utulity TYPE:
                1. ELECTRICAL
                2. FIBER OPTIC
                """);

        int input = scanner.nextInt();

        // return switch that returns the enum type
        return switch (input){
            case 1 -> ELECTRICAL;
            case 2 -> FIBER_OPTIC;
            default -> UNDEFINED;
        };
    }
}
