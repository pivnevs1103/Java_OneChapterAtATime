package AbstractionChallengeProfessorSolution;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    // Populating the store inventory
    public static void main(String[] args) {
      storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted"
              + " in 2010"));
      storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JFK, reproduced" +
              " in 1950"));
      storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));
      storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));
      listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 2, 5);
        addItemToOrder(order2, 3, 3);
        addItemToOrder(order2, 0, 1);
        printOrder(order2);
    }

    // Prints out all the items in the array List aka out inventory
    public static void listProducts(){

        // Using a for loop we are able to loop through arrayList and access each object directly
        for (var items : storeProducts){
            System.out.println("-".repeat(30));
            items.showDetails();
        }
    }

    // This class takes in the order arraylist, orderIndex of the item in our store inventory and the qty the person
    // ordered. Then it stores that order in our new ArrayList which keeps track of all the costumer's order details
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    // Uses a for loop and access each Object/order in the arrayList and prints out the info about it
    public static void printOrder(ArrayList<OrderItem> order){

        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice((item.qty()));
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
