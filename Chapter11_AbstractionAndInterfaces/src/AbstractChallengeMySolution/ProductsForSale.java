package AbstractChallengeMySolution;

import java.lang.reflect.Type;

public abstract class ProductsForSale {
    protected String type;
    protected double price;
    protected boolean description;

    public ProductsForSale(String type, double price, boolean description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return price * quantity;
    }

    public void printPricedItem(int quantity){
        System.out.println("ITEM: " + type + " " + this.getClass().getSimpleName() + "\nQTY: " + quantity +
                "\nTOTAL PRICE: $" + getSalesPrice(quantity) + "\n\t(" + price + " x " + quantity + ")");
        System.out.println("-".repeat(34));
    }

    public abstract void showDetails();
}
