package AbstractChallengeMySolution;

public class CollectibleCards extends ProductsForSale{

    public CollectibleCards(String type, double price, boolean description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(" ".repeat(20) + "!!!DETAILS!!!\nCOLLECTIBLE CARDS HOBBY BOXES DETAILS -> "
                + type + "\nPRICE: $" + price + " per Hobby box");
        if(description) {
            System.out.print("""
            \nElevate your collection with our hobby box of collectible hockey cards, offering a thrilling chance 
            to discover rare signed cards from real NHL players. Crafted for ultimate quality and authenticity, 
            each box comes with a 30-day return policy, ensuring your complete satisfaction with every 
            purchase.\n""");
        }
    }
}
