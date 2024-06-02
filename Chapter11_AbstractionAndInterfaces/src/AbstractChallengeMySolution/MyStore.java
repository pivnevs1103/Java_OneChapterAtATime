package AbstractChallengeMySolution;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStore {
    public static void main(String[] args) {
        storeInfo(true);
    }

    public static void storeInfo(boolean flag) {
        while (flag) {
            System.out.println("DEAR COSTUMER, WELCOME TO MY STORE!!! Please checkout the AMAZING DEALS THAT WE " +
                    "HAVE UP");
            flag = false;
        }

        System.out.println("""
                Please choose from the following items:
                Type 1 for Collectible Cards
                Type 2 for Hockey jersey
                Type 3 for Stick
                Type 4 to view your order
                Type 5 to quit""");
        usersChoice();
    }

    public static void usersChoice() {
        ArrayList<ProductsForSale> productsForSale = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> {
                productsForSale.add(new CollectibleCards("UPPER DECK", 199.99, true));

            }
            case 2 -> {
                productsForSale.add(new Jerseys("Connor Bedard Fanatics", 399.99, true));

            }
            case 3 -> {
                productsForSale.add(new Sticks("Bauer", 259.99, true));

            }
            case 4 -> System.out.println();
            case 5 -> System.out.println("You are exiting the store! Good Bye!");
            default -> System.out.println("You did something wrong please try again");
        }
        storeInfo(false);
    }

    public static void addingItemsToOrder(ProductsForSale orderedItem) {

        System.out.println("""
                \nPLEASE CHOOSE FROM THE MENU BELOW
                Type (1) to add this item to your order
                Type (2) to go back to the main menu""");


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        switch (input) {
            case 1 -> {
                int quantity = selectingQuantity();
                System.out.println("\nSCORE, You have just added " + " QT:" +
                        quantity + " to cart");
                System.out.println("For a grand total of: $" + orderedItem.getSalesPrice(quantity));
            }
            case 2 -> {
                System.out.println("ALRIGHT, Exiting to the main menu now..........");
                storeInfo(false);
            }
            default -> System.out.println("Please only type in 1 or 2");
        }
    }

    public static int selectingQuantity() {
        System.out.print("\nPlease enter the quantity: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 1) {
            System.out.println("Incorrect entry you cannot add  " + input + " items to cart!"
                    + "\n You must at least add 1 or more items");
        } else return input;

        return 0;
    }
}
