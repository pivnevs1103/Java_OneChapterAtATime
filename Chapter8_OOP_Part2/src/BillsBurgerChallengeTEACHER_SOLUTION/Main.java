package BillsBurgerChallengeTEACHER_SOLUTION;

public class Main {
    public static void main(String[] args) {

        // Item coke = new Item("Drink", "coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();

        // Item avocado = new Item("Topping", "avocado", 1.50);
        // avocado.printItem();

        //  Burger burger = new Burger("Regular", 4.00);
        // burger.addToppings("BACON", "CHEESE", "MAYO");
        //

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

        System.out.println("\n-------------- Meal #2 ----------------");

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "Chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        System.out.println("\n-------------- DELUXE Meal  ----------------");

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                    "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
