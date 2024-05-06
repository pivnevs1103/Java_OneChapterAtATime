package BillsBurgerMasterChallenge;

import java.util.Scanner;

public class Drink {

    private int mealSize;
    private String drinkChoice;

    public Drink(int mealSize){
        this.mealSize = mealSize;
    }

    public String choosingDrink(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the Drink for your meal");
        System.out.print("""
                Type 1 for Coca Cola
                Type 2 for Sprite
                Type 3 for Lemonade
                Type 4 for Water
                """);
        int input = scanner.nextInt();

        switch (input){
            case 1 -> drinkChoice = "Coca Cola";
            case 2 -> drinkChoice = "Sprite";
            case 3 -> drinkChoice = "Lemonade";
            case 4 -> drinkChoice = "Water";
        }
        return drinkChoice;
    }
}
