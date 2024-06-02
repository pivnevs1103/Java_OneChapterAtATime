package AbstractChallengeMySolution;

public class Jerseys extends ProductsForSale{

    public Jerseys(String type, double price, boolean description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(" ".repeat(20) + "!!!DETAILS!!!\nJERSEY DETAILS -> " + type + "\nPRICE: $" +
                price + " per jersey");
        if(description) {
            System.out.print("""
                    \nElevate your game-day experience with our premium hockey jersey, crafted from high-performance 
                    fabric for ultimate comfort and durability. Each jersey is signed by real NHL players, adding an 
                    authentic touch, and is backed by our 30-day warranty for a worry-free purchase.\n""");
        }
    }


}
