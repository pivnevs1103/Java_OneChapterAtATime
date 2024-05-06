package BillsBurgerMasterChallenge;

import java.util.Scanner;

public class Menu {

    private Burger burger;
    private Side side;
    private Drink drink;

    private int mealSize;
    private double burgerPrice;
    private double orderTotal;
    private String mealSizeString;
    private String[] sides;
    private String sideChoice;
    private String drinkChoice;

    public Menu(){
        startOrder();
    }

    private void startOrder(){
        System.out.println("Initiating your order.......");
        placingBurgerOrder();
    }

    public void placingBurgerOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    Please select whether you would like a deluxe burger or a regular order
                                          Type 1 for deluxe
                                       Type 2 for regular order
                                      Type anything else to quit
                    """);
        int input = scanner.nextInt();
        burger = new Burger();
        if(input == 1){
            mealSize = burger.deluxeOrder();
        }else if(input == 2){
            mealSize = burger.regularOrder();
        }

        sides = burger.addingToppings();
        placingSideOrder();

        switch(mealSize){
            case 1 -> mealSizeString = "Small";
            case 2 -> mealSizeString = "Medium";
            case 3-> mealSizeString = "Large";
            default -> mealSizeString = "No size, something is wrong. Try again";
        }
    }

    public void placingSideOrder(){
        side = new Side(mealSize);
        sideChoice = side.choosingSide();
        placingDrinkOrder();
    }

    public void placingDrinkOrder(){
        drink = new Drink(mealSize);
        drinkChoice = drink.choosingDrink();
    }

    public void priceCalculation(){
        burgerPrice = burger.priceCalculation();
    }

    public void printsInfo(){
        System.out.println("----------- Order Info -----------");
        System.out.printf("  Meal Size is %s%n", mealSizeString);
        if(burger.isDeluxeBurger()){
            System.out.println("You chose a Deluxe Burger");
        }else{
            System.out.println("You chose a regular Burger");
        }
        System.out.println("** The Toppings that you chose are: **");
        for(int i = 0; i <= sides.length - 1; i++){
            System.out.println((i + 1) + ". " + sides[i]);
        }
        System.out.println("Your side order is: " + sideChoice);
        System.out.println("Your drink of choice is: " + drinkChoice);
        System.out.printf("TOTAL: $%.2f%n", burger.priceCalculation());

    }
}
