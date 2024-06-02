package Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {


    }
}

 class Store{

    ArrayList<OrderedItems> orderedItems  = new ArrayList<>();

    public void showMainInfo(){
        System.out.print("""
                                             WELCOME TO MY STORE :)))))!!!!
                FROM THE MENU BELOW YOU CAN BROWSE MY STORE AND SELECT TO GO INTO DIFFERENT SECTION OF THE STORE
                AND CHOOSE THE ITEMS YOU WANT TO ADD TO YOUR SHOPPING CART""");
        showMenu();
    }

    public void showMenu(){
        System.out.println("""
                TYPE (1) for Hockey Sticks
                TYPE (2) for Hockey Jerseys
                Type (3) for Hockey Hobby Boxes
                Type (4) to quit""");
    }
}

abstract class ProductForSale{

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double salesPrice(int quantity){
        return price * quantity;
    }


    public abstract void showDetails();
    }

    // One of the product types for Sale that I have in my store! This one has different type of hockey Sticks
class HockeySticks extends ProductForSale{

    public HockeySticks(String type, String description) {
        super(type, switch (type.toLowerCase()){
            case "bauer" -> 299.99;
            case "reebok" -> 199.99;
            case "easton" -> 249.99;
            default -> 249.99;}, description);
    }

        @Override
    public void showDetails() {
        if(type.equalsIgnoreCase("bauer")){
            System.out.print("You are Looking at the new BAUER Stick. Priced at: $" + price);
            description();
        }else if(type.equalsIgnoreCase("Reebok")){
            System.out.print("You are Looking at the new REEBOK Stick. Priced at: $" + price);
            description();
        }else if(type.equalsIgnoreCase("Easton")){
            System.out.print("You are Looking at the new EASTON Stick. Priced at: $" + price);
        }else
            System.out.print("This is a MYSTERY STICK BOX. Try your luck today! Priced at: $" + price);
    }

    public void description(){
        System.out.println("DESCRIPTION:" + "-".repeat(30));
        if(description.equalsIgnoreCase("short")){
            System.out.print("""
                    Above is one of the hottest Sticks on the market!
                    It is top of the line and you wont regret getting one""");
        }else if(description.equalsIgnoreCase("long")) {
            System.out.print("""
                    Experience unmatched performance and precision on the ice with our latest hockey stick,
                    designed using cutting-edge materials to enhance your game. Try it risk-free with our 30-day 
                    warranty, ensuring you have the confidence to elevate your skills to the next level.""");
        }else
            System.out.println("No description!");
        }
}

// One of the product types for Sale that I have in my store! This one has different type of hockey jerseys
class HockeyJerseys extends ProductForSale{

    public HockeyJerseys(String type, String description) {
        super(type, switch (type.toLowerCase()){
            case "connor bedard" -> 499.99;
            case "connor mcdavid" -> 599.99;
            case "lucas raymond" -> 349.99;
            default -> 449.99;}, description);
    }

    @Override
    public void showDetails() {
        if(type.equalsIgnoreCase("Connor Bedard")){
            System.out.print("You are Looking at a signed CONNOR BEDARD BLACKHAWKS jersey. Priced at: $" + price);
            description();
        }else if(type.equalsIgnoreCase("Connor Mcdavid")){
            System.out.print("You are Looking at a signed CONNOR MCDAVID OILERS jersey. Priced at: $" + price);
            description();
        }else if(type.equalsIgnoreCase("Lucas Raymond")){
            System.out.print("You are Looking at a signed LUCAS RAYMOND RED WINGS jersey. Priced at: $" + price);
        }else
            System.out.print("This is a MYSTERY JERSEY BOX. Try your luck today! Priced at: $" + price);
    }

    public void description(){
        System.out.println("DESCRIPTION:" + "-".repeat(30));
        if(description.equalsIgnoreCase("short")){
            System.out.print("""
                    Experience ultimate comfort with our premium hockey jersey, signed by real NHL players for an 
                    authentic touch. Perfect for any true fan.""");
        }else if(description.equalsIgnoreCase("long")) {
            System.out.print("""
                    Elevate your game-day experience with our premium hockey jersey, crafted from high-performance 
                    fabric for ultimate comfort and durability. Each jersey is signed by real NHL players, adding an 
                    authentic touch, and is backed by our 30-day warranty for a worry-free purchase.""");
        }else
            System.out.println("No description!");
    }
}

// One of the product types for Sale that I have in my store! This one has different type of hockey hobby boxes
class HockeyCollectibleCards extends ProductForSale{

    public HockeyCollectibleCards(String type, double price, String description) {
        super(type, switch (type.toLowerCase()){
            case "upper deck" -> 149.99;
            case "topps" -> 99.99;
            case "topps chrome" -> 299.99;
            default -> 189.99;}, description);
    }

    @Override
    public void showDetails() {
        if(type.equalsIgnoreCase("Upper Deck")){
            System.out.print("You are Looking at the new UPPER DECK HOCKEY HOBBY BOX. Priced at: $" + price);
            description();
        }else if(type.equalsIgnoreCase("Topps")){
            System.out.print("You are Looking at the new TOPPS HOCKEY HOBBY BOX. Priced at: $" + price);
            description();
        }else if(type.equalsIgnoreCase("Topps Chrome")){
            System.out.print("You are Looking at the new TOPPS CHROME HOCKEY HOBBY BOX. Priced at: $" + price);
        }else
            System.out.print("This is a MYSTERY HOCKEY HOBBY BOX. Try your luck today! Priced at: $" + price);
    }

    public void description(){
        System.out.println("DESCRIPTION:" + "-".repeat(30));
        if(description.equalsIgnoreCase("short")){
            System.out.print("""
                    Enhance your collection with our hobby box of collectible hockey cards, offering a chance to find
                    rare signed cards from real NHL players.""");
        }else if(description.equalsIgnoreCase("long")) {
            System.out.print("""
                    Elevate your collection with our hobby box of collectible hockey cards, offering a thrilling chance 
                    to discover rare signed cards from real NHL players. Crafted for ultimate quality and authenticity, 
                    each box comes with a 30-day return policy, ensuring your complete satisfaction with every 
                    purchase.""");
        }else
            System.out.println("No description!");
    }
}

record OrderedItems(String itemForSale, int quantity){}