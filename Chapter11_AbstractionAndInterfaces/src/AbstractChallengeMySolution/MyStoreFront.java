package AbstractChallengeMySolution;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MyStoreFront {
    public static void main(String[] args) {
        ArrayList<ProductsForSale> productsForSale = new ArrayList<>();
        populatingMyStoreWithItems(productsForSale);
        printingItemsInMyStore(productsForSale);
    }

    public static void populatingMyStoreWithItems(ArrayList<ProductsForSale> productsForSales){
        productsForSales.add(new Sticks("Bauer", 199.99, true));
        productsForSales.add(new CollectibleCards("Upper Deck", 99.99, true));
        productsForSales.add(new Jerseys("Connor Bedard signed", 299.99, true));

    }

    public static void printingItemsInMyStore(ArrayList<ProductsForSale> productsForSales){
        ArrayList<OrderedItems> orderedItems = new ArrayList<>();

        int index = 1;
        for (ProductsForSale products : productsForSales){
            System.out.println("PRODUCT " + index + ": ");
            products.showDetails();
            addingTheProductToPurchase(orderedItems, products);
            index++;
        }
        printInfoOrder(orderedItems);
    }

    public static void addingTheProductToPurchase(ArrayList<OrderedItems> orderedItems, ProductsForSale product){
        System.out.println("""
                WOULD YOU LIKE TO ADD THIS PRODUCT TO YOUR ORDER?
                TYPE (1) FOR YES
                TYPE (2) FOR NO and to go to the next item""");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        OrderedItems items;
        switch (input){
            case 1 -> {int quantity = getQuantity();
                orderedItems.add(items  = new OrderedItems(product, quantity));
                System.out.println("\nCONGRATS: You just added " + product.getClass().getSimpleName() + " of QTY: " +
                        quantity + " For a Grand Total Off: $" + product.getSalesPrice(quantity) + "\n\n");
            }
            case 2 -> System.out.println("Error");
        }

    }
    public static int getQuantity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the quantity you would like to add: ");
        int input = scanner.nextInt();
        return input;
    }

    public static void printInfoOrder(ArrayList<OrderedItems> orderedItems){
        double grandTotal = 0;
        int totalItems = 0;
        System.out.println("-".repeat(10) + " ORDER Receipt " + "-".repeat(10));
        for(OrderedItems items : orderedItems){
            items.products().printPricedItem(items.quantity());
            grandTotal += items.products().getSalesPrice(items.quantity());
            totalItems += items.quantity();
        }
        System.out.println("Total Items: " + totalItems);
        System.out.println("GRAND TOTAL: $" + grandTotal);
    }
}
