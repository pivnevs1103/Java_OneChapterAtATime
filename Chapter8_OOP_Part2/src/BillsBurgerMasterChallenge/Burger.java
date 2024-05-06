package BillsBurgerMasterChallenge;

import java.util.Scanner;

public class Burger {

        private double burgerPrice = 0.00;
        private boolean deluxeBurger;
        private int mealSize;
        private String[] toppings = new String[3];
        private double toppingsPrice = 0.00;
        private int maxToppings = 2;

        public Burger() {}

        public int deluxeOrder() {
                return selectingMealSize(true);
        }

        public int regularOrder() {
                return selectingMealSize(false);
        }

        public int selectingMealSize(boolean deluxeBurger) {
                if (deluxeBurger) {
                        maxToppings = 1;
                        System.out.println("""
                                You placed a deluxe order. Please select the size of your meal
                                NOTE: The prices is for the meal and you get up to two additional toppings(for free)
                                                         Type 1 for Small  = $12.99
                                                         Type 2 for Medium = $15.99
                                                         Type 3 for Large  = $17.99
                                """);
                } else {
                        System.out.println("""
                                You placed a regular order. Please select the size of your meal
                                NOTE: The prices is for the meal and you get up to 3 additional toppings that cost extra
                                                         Type 1 for Small  = $9.99
                                                         Type 2 for Medium = $11.99
                                                         Type 3 for Large  = $13.99
                                """);
                }
                Scanner scanner = new Scanner(System.in);
                mealSize = scanner.nextInt();

                return mealSize;
        }

        public String[] addingToppings() {

                Scanner scanner = new Scanner(System.in);
                System.out.print(""" 
                                Please make your selection for the toppings above
                                Type 1 for Tomatoes 
                                Type 2 for Cucumbers
                                Type 3 for Pickles
                                Type 4 for Ketchup
                                Type 5 for Mayo
                                Type 6 for Ranch
                                Type 7 for Vinegar                                 
                                """);
                for (int i = 0; i <= maxToppings; i++) {
                       int entry = scanner.nextInt();
                        switch(entry){
                                case 1 -> {toppings[i] = "Tomatoes";
                                        toppingsPrice += .15;}
                                case 2 -> {toppings[i] = "Pickles";
                                        toppingsPrice += .20;}
                                case 3 -> {toppings[i] = "Ketchup";
                                        toppingsPrice += .06;}
                                case 4 -> {toppings[i] = "Mayo";
                                        toppingsPrice += .05;}
                                case 5 -> {toppings[i] = "Ranch";
                                        toppingsPrice += .06;}
                                case 6 -> {toppings[i] = "Vinegar";
                                        toppingsPrice += .07;}
                                case 7 -> {toppings[i] = "Bacon";
                                        toppingsPrice += .20;}
                                default -> {
                                        toppings[i] = "You added no toppings for your " + i + " selection ";;
                                }
                        }
                        System.out.println("Thank you for selecting " + toppings[i] + ",  please chose again. " +
                                "You have " + (maxToppings - i) + " selections left");
                }
                return toppings;
        }

        public double priceCalculation(){

                if(deluxeBurger){
                        if(mealSize == 1){
                            burgerPrice = 12.99;
                        }else if (mealSize == 2){
                                burgerPrice = 15.99;
                        }else if(mealSize == 3){
                                burgerPrice = 17.99;
                        }
                        burgerPrice += toppingsPrice;
                }else{
                        if(mealSize == 1){
                                burgerPrice = 9.99;
                        }else if (mealSize == 2){
                                burgerPrice = 11.99;
                        }else if(mealSize == 3){
                                burgerPrice = 13.99;
                        }
                        burgerPrice += toppingsPrice;
                }
                return burgerPrice;
        }

        public boolean isDeluxeBurger(){
                return deluxeBurger;
        }
}
