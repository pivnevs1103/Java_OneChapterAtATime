package BillsBurgerMasterChallenge;

import java.util.Scanner;

public class Side {

    private String sideOrder;
    private int mealSize;

    public Side(int mealSize){
        this.mealSize = mealSize;
    }

    public String choosingSide(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the Side for your meal");
        System.out.print("""
                Type 1 for French Fries
                Type 2 for Mashed Potatoes
                Type 3 for Salad
                Type 4 for Rice
                """);
        int input = scanner.nextInt();

        switch (input){
            case 1 -> sideOrder = "French Fries";
            case 2 -> sideOrder = "Mashed Potatoes";
            case 3 -> sideOrder = "Salad";
            case 4 -> sideOrder = "Rice";
        }
        return sideOrder;
    }

}
